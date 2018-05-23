package application.ui.preview.server.preview.stax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import javax.xml.stream.Location;

import org.daisy.dotify.studio.api.DocumentPosition;
import org.daisy.streamline.api.validity.ValidatorMessage;

/**
 * Provides a consumable message extractor to be used when parsing an xml document.
 * @author Joel Håkansson
 */
class MessageExtractor { 
	private static final List<ValidatorMessage> EMPTY_LIST = Collections.emptyList();
	private static final Comparator<? super ValidatorMessage> MESSAGE_COMPARATOR = (t1, t2)->toDocumentPosition(t1).compareTo(toDocumentPosition(t2)); 
	private Iterator<ValidatorMessage> messages;
	private ValidatorMessage current;
	private DocumentPosition lastSeenLocation;

	/**
	 * Creates a new instance with the supplied messages.
	 * @param messages the validation messages
	 */
	MessageExtractor(List<ValidatorMessage> messages) {
		// Make sure messages are in document order. They should be already, but since the implementation requires it, we better make sure.
		this.messages = messages.stream().sorted(MESSAGE_COMPARATOR).iterator();
	}
	
	List<ValidatorMessage> extractMessages(Location startLoc, Location endLoc) {
		if (!messages.hasNext() && current == null) {
			return EMPTY_LIST;
		}
		DocumentPosition end = DocumentPosition.with(endLoc);
		DocumentPosition start = DocumentPosition.with(startLoc);
		if (start.getLineNumber()<0) {
			throw new IllegalArgumentException("Line must be >= 0");
		}
		if (start.getColumnNumber()<0) {
			throw new IllegalArgumentException("Column must be >= 0");
		}
		if (end.isBefore(start)) {
			throw new IllegalArgumentException("Illegal range.");
		}
		if (lastSeenLocation!=null && end.isBefore(lastSeenLocation)) {
			throw new IllegalArgumentException("Locations must be in order.");
		}
		lastSeenLocation = end;
		List<ValidatorMessage> ret = null;
		do {
			if (current==null && messages.hasNext()) {
				current = messages.next();
			}
			if (current!=null) {
				if (toDocumentPosition(current).isBefore(start)) {
					// we've passed this location, discard
					current = null;
				} else if (toDocumentPosition(current).isBeforeOrEqual(end)) {
					if (ret == null) {
						ret = new ArrayList<>();
					}
					ret.add(current);
					current = null;
				}
			}
		} while (current==null && messages.hasNext());
		if (ret==null) {
			return EMPTY_LIST;
		} else {
			return ret;
		}
	}
	
	private static DocumentPosition toDocumentPosition(ValidatorMessage m) {
		return DocumentPosition.with(m.getLineNumber(), m.getColumnNumber());
	}
	
	public static String messageId(ValidatorMessage m) {
		return "msgId-" + Integer.toHexString(m.hashCode());
	}

}
