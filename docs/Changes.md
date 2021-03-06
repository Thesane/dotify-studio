[[Table of Contents|Toc]]

# 1.0.0
## New in this version
- User Interface
  - Enables output format selection, progress estimate, auto-save and character tool features
  - Improves extension filters in open dialog
  - Adds empty value to ChoiceBox
  - Adds configuration tab to About window
  - Supports setting target locale in converter options
  - Adds editor defaults to settings panel
  - Uses display name for locales in settings
  - Improves input format selection accuracy
  - Fixes a problem with saving to file
  - Fixes a problem where the selected template was not applied
  - Improves cleanup when exiting the application
- Translators
  - Adds Liblouis translators for the following locales:  af, ar, as, awa, bn, bra, ca, chr, ckb, cs, cy, da, de, de-CH, el, en, en-GB, en-US, eo, es, fa, fi, fr, ga, gez, gu, haw, hi, hr, hu, iu, kha, kn, ko, lt, lv, mi, ml, mn, mni, mr, ne, nl, nl-BE, no, or, pa, pl, pt, ru, sa sd, sk, sl, sr, ta, te and vi
  - Supports locale 'sv'
- Input format converters
  - Supports docx, odt and html input
  - Adds more options to Text2ObflTask
  - Removes xml:lang validation from dtbook converter
  - Removes a debug message in the epub converter
  - Improves task names
- Formatting
  - Supports flow into header/footer (fixes brailleapps/dotify.formatter.impl#63)
  - Enhances volume-transition
  - Fixes marker-reference issue (fixes brailleapps/dotify.formatter.impl#39, closes brailleapps/dotify.formatter.impl#94)
  - Fixes a problem with vertical position (fixes brailleapps/dotify.formatter.impl#92, closes brailleapps/dotify.formatter.impl#96)
  - Fixes a page number offset problem (part of brailleapps/dotify.formatter.impl#97)
  - Fixes a case where an volume breaking solution could not be found (part of brailleapps/dotify.formatter.impl#97)
  - Fixes a situation that could cause a StackOverflowException when looking up markers (part of brailleapps/dotify.formatter.impl#97)
  - Fixes a problem with uneven margins
  - Fixes a problem where no solution was found (closes brailleapps/dotify.formatter.impl#104)
- Other
  - Adds a feature switch with file set support
  - Fixes a NullPointerException
  - Improves documentation

# 0.11.0
## New in this version

- User Interface
  - Adds zoom feature to preview, editor and help views
  - Supports opening larger files (fixes #76)
  - Supports volume range in emboss dialog
  - Sorts templates after name and increases the size of the the template window
  - Improves validation in the "manage papers" tab (fixes #69)
  - Changes warning when file has not been modified (fixes #47)
  - Opens find dialog with selected text
  - Updates find dialog when the last tab is closed or if the new tab doesn't support searching
  - Adds license information
- Embossing
  - Fixes a problem with page ranges on Index V4 and V5 embossers
- Input format converters
  - Supports staircase tables in html/epub (fixes brailleapps/dotify.task.impl#8)
- Formatting
  - Improves error reporting in OBFL-files (fixes brailleapps/dotify.formatter.impl#52)
  - Fixes a bug in vertical-position
  - Supports BreakBefore.SHEET (fixes brailleapps/dotify.formatter.impl#53)

# 0.10.1
## New in this version
- Updates Norwegian translation
- Supports passing a file path as the only startup argument
- Improves the left tools panel implementation
- Removes code duplication in DotifyController (fixes #68)

# 0.10.0
## New in this version
- Adds a validation view (fixes #52)
- Adds find and replace functionality
- Adds an option to disable the template dialog on import
- Renames find books view
- Makes console closeable

# 0.9.1
## New in this version
- Fixes a problem where a page could become too long 

# 0.9.0
## New in this version
- User interface
  - Supports templates managing (fixes #34, #50 and #54)
  - Supports splitting a PEF-file (fixes #56)
  - Supports merging PEF-files (fixes #55)
  - Makes it easier to find a specific embosser model in the settings
  - Disables file actions while converter is running (fixes #70)
  - Improves menu bindings
- Embossing
  - Corrects width calculation on Braillo 300 (fixes brailleapps/braille-utils.impl#1)
- Dtbook & epub converters
  - Corrects top-padding of the toc heading
  - Improves Java 9 compatibility (fixes brailleapps/dotify.task.impl#18)
  - Removes workaround for tables in the DTBook converter (fixes brailleapps/dotify.task.impl#4)
- Formatting
  - Supports referencing spans (closes brailleapps/dotify.api#17 and brailleapps/dotify.formatter.impl#44)

# 0.8.0 #
## New in this version ##
- User interface
  - Supports side-by-side view
  - Remembers last open directory in import braille dialog
  - Adds a keyboard shortcut to "import source document" menu item
  - Updates Norwegian translations
  - Enables localization in a couple of places
- Dtbook & epub converters
  - Adds the possibility to add content to the beginning of the book
- Other
  - Fixes a temp file cleanup issue
  - Ignores invalid startup arguments (fixes #58)
  - Replaces SwingWorker with Task (fixes #59)
  - Code cleanup (including #31)

# 0.7.0 #
## New in this version ##
- User interface
  - Adds pretty printing of XML-files
  - Makes it possible to open OBFL, HTML, XML and TXT-files
  - Supports HTML preview when opening HTML-files
  - Highlights modified options
  - Displays some preliminary options before the first conversion has finished
  - Keeps changes made to options while converting
  - Makes it possible to close template view with ESC
  - Improves the open and import dialog file filters
  - Improves converter panel layout including the possibility to show/hide converter options
  - Improves XML styling
  - Prevents a cancelled save action from proceeding (fixes #53)
  - Wraps browser call in a new thread (fixes #44)
  - Supports scanning sub folders in the plugins folder (fixes #41)
  - Starts even if the plugins-folder is missing
- Formatting
  - Supports volume transitions
  - Disallows ending volume on hyphen
  - Improves volume splitting
- Other
  -Improves documentation

# 0.6.1 #
## New in this version ##
- Prevents overlapping read/write operations
- Improves file watching stability
- Improves liveness during conversion
- Closes some background threads when the tab is closed and removes the possibility of doing so manually
- Improves fault tolerance when reading PEF-files

# 0.6.0 #
## New in this version ##
- Adds the possibility to edit the source or the PEF-file
- Remembers the last open/save locations
- Replaces icon (fixes brailleapps/dotify-studio-installer#6)
- Improves about dialog

# 0.5.0 #
## New in this version ##
- Embossing
  - Supports Index V5 embossers
  - Adds 8-dot embossing for Index V4 and V5 embossers
  - Adds unprintable margins for Index V4 and V5 (fixes brailleapps/braille-utils.impl#3)
  - ~~Corrects width calculation on Braillo 300 (fixes brailleapps/braille-utils.impl#1)~~
- User interface
  - Restores the inner margin indicator
  - Fixes page numbering for single sided sections (fixes #43)
  - Displays some key properties of the selected embosser implementation in embosser settings (8-dot support, volume support, line spacing support)
  - Fixes the file filter in the "Save as" dialog
- Formatter
  - Supports additional page counters in OBFL
- Other
  - Improves documentation

# 0.4.0 #
## New in this version ##
- Enables drag-and-drop for source file imports
- Moves the watch source checkbox and the apply button out of the options scroll pane
- Improves dtbook/epub conversion:
  - Adds option to remove title page (enabled by default)
  - Adds an option to disable the cover page
  - Updates Norwegian localization
- Adds java version to "about" dialog
- Corrects menu actions for help tab (fixes #42)

# 0.3.0 #
## New in this version ##
- Adds Norwegian translation
- Adds individual extension filters for each file format in the import dialog
- Adds icons to tabs (fixes #21)
- Adds support for drag and drop (fixes #37)
- Adds a confirmation before deleting a custom paper (fixes #29)
- Adds support for displaying help contents (fixes #19)
- Adds the possibility to hide the console view (fixes #18) and modifies search menu item to match
- Displays only the file name when starting the application with a file argument (fixes #17)
- Improves help documents
- Prevents files from being opened unintentionally from the search view (fixes #27)
- Closes an InputStream properly and updates dotify.common to v3.5.1 (which also had this problem in earlier versions)
- Fixes a problem where sheet paper were labeled as tractor paper and vice versa (fixes #28)
- Cleans up code

# 0.2.0 #

## New in this version ##
- Adds embossing from the application menu and removes it in the preview window
- Remembers settings in the emboss dialog (fixes #10)
- Adds support for importing braille text
- Improves synchronization of book validity and metadata (if the file changes, this information is updated)
- Improves validation by:
  - adding visual markers to rows with validation problems
  - adding a validation notice to the preview and validation messages to "about the book"
- Adds scroll lock and clear console buttons to the console view
- Makes it possible to close dialogs with ESC
- Improves efficiency of preview rendering (fixes #12)
- Restores possibility to select preview font
- Adds an option to disable the toc preamble
- Improves documentation
- Distributes documentation in HTML-format

# 0.1.0 #

## New in this version ##
  - First version to use JavaFx as the framework
  - Supports converting source documents to PEF (with Dotify)
  - Several of the features from Easy Embossing Utility have been re-implemented using JavaFx