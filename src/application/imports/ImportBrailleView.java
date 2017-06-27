package application.imports;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import application.l10n.Messages;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class ImportBrailleView extends Stage {
	private static final Logger logger = Logger.getLogger(ImportBrailleView.class.getCanonicalName());
	private ImportBrailleController controller;

	public ImportBrailleView(File path) {
		try {
			FXMLLoader loader = new FXMLLoader(this.getClass().getResource("ImportBraille.fxml"), Messages.getBundle());
			Parent root = loader.load();
			controller = loader.<ImportBrailleController>getController();
			Scene scene = new Scene(root);
	    	setScene(scene);
			scene.addEventHandler(KeyEvent.KEY_PRESSED, ev->{
				if (ev.getCode()==KeyCode.ESCAPE) {
					controller.closeWindow();
				}
			});
	    	setResizable(false);
	    	controller.setFile(path);
		} catch (IOException e) {
			logger.log(Level.WARNING, "Failed to load view", e);
		}
		setTitle(Messages.TITLE_IMPORT_BRAILLE_OPTIONS_DIALOG.localize());
	}
	
	public Map<String, String> getOptions() {
		return controller.getOptions();
	}

}
