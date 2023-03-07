package notebook.model;

import java.util.ArrayList;
import java.util.List;

public class NotebookFile implements NotebookActionable {

    private NoteMapper mapper = new NoteMapper();
    private FileOperation fileOperation;
    public NotebookFile(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public List<Note> getAllNotes() {
        List<String> lines = fileOperation.readAllLines();
        List<Note> notes = new ArrayList<>();
        for (String line: lines) notes.add(mapper.map(line));
        return notes;
    }

    @Override
    public String CreateNote(Note note) {

        List<Note> notes = getAllNotes();
        int max = 0;
        for (Note e: notes) {
            int id = Integer.parseInt(e.getId());
            if (max < id) {
                max = id;
            }
        }
        int newId = max +1;
        String id = String.format("%d", newId );
        note.setId(id);
        notes.add(note);
        saveNotes(notes);
        return id;
    }

    @Override
    public String saveNotes(List<Note> notes) {
        List<String> lines = new ArrayList<>();
        for (Note e: notes) {
            lines.add(mapper.map(e));
        }
        fileOperation.saveAllLines(lines);
        return null;
    }
}
