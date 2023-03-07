package notebook.model;

import java.util.List;

public interface NotebookActionable {

    List<Note> getAllNotes();
    String CreateNote(Note note);
    String saveNotes(List<Note> notes);

}
