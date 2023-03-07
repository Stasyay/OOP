package notebook.controllers;

import notebook.logger.Logger;
import notebook.model.Note;
import notebook.model.NotebookActionable;

import java.util.List;

public class NoteController {
    private final NotebookActionable notebookFiles;
    private final Logger logger;

    public NoteController(NotebookActionable notebookFiles, Logger logger) {
        this.notebookFiles = notebookFiles;
        this.logger = logger;
    }

    public List<Note> readAllNotes(){

        return  notebookFiles.getAllNotes();
    }

    public Note readNote(String noteId) throws Exception {
        List<Note> notes = notebookFiles.getAllNotes();
        Note note = noteSearch(noteId, notes);
        logger.saveLog(String.valueOf(new StringBuilder().append("Read note: ").append(note)));
        return note;
    }

    public void saveNote(Note note) throws Exception{
        notebookFiles.CreateNote(note);
        logger.saveLog(String.valueOf(new StringBuilder().append("Create note: ").append(note)));
    }
    public void deleteNote (String noteId) throws Exception {
        List<Note> notes = notebookFiles.getAllNotes();
        Note note = noteSearch(noteId, notes);
        notes.remove(note);
        logger.saveLog(String.valueOf(new StringBuilder().append("Delete note: ").append(note)));
        notebookFiles.saveNotes(notes);
    }

    private static Note noteSearch(String noteId, List<Note> notes) throws Exception{
        for (Note note: notes) {
            if(note.getId().equals(noteId)){
                return note;
            }

        }
        throw new Exception("Запись не найдена");
    }

    public void updateNote(String noteId, Note newNote) throws Exception {
        List<Note> notes = notebookFiles.getAllNotes();
        Note note = noteSearch(noteId, notes);
        note.setTitle(newNote.getTitle());
        note.setText(newNote.getText());
        notebookFiles.saveNotes(notes);
        logger.saveLog(String.valueOf(new StringBuilder().append("Update note: ").append(note)));
    }
}
