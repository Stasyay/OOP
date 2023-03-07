
import notebook.controllers.NoteController;
import notebook.logger.Logger;
import notebook.model.FileOperationImpl;
import notebook.model.NotebookActionable;
import notebook.model.NotebookFile;
import notebook.views.ViewNote;

public class Main {
    public static void main(String[] args) {
        FileOperationImpl fileOperation = new FileOperationImpl("note.txt");
        NotebookActionable notebookFile = new NotebookFile(fileOperation);
//        Logger saveLog = new Logger("log.txt");
        NoteController controller = new NoteController(notebookFile, new Logger("log.txt"));
        ViewNote viewNote = new ViewNote(controller);
        viewNote.run();

    }
}