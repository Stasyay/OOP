package notebook.views;

import notebook.controllers.NoteController;
import notebook.logger.Logger;
import notebook.model.Note;

import java.util.List;
import java.util.Scanner;

public class ViewNote {

    private final NoteController noteController;

    public ViewNote(NoteController noteController) {
        this.noteController = noteController;
    }

    public void run() {
        Commands com;

        while (true) {
            String command = prompt("\nCREATE - создать запись \nREAD - посмотреть запись \nUPDATE - обновить запись " +
                    "\nLIST - посмотреть все записи \nDELETE - удалить запись \nEXIT - Выход \nВведите команду:\n");
            try {
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        createNote();
                        break;
                    case READ:
                        readNote();
                        break;
                    case LIST:
                        listNotes();
                        break;
                    case UPDATE:
                        updateNote();
                        break;
                    case DELETE:
                        deleteNote();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }

    private Note inputNote() {

        String titleNote = prompt("Заголовок:");
        String textNote = prompt("Текст:");
        return new Note(titleNote, textNote);
    }

    private void createNote() throws Exception {
        noteController.saveNote(inputNote());
    }

    private void readNote() throws Exception {
        String id = prompt("Идентификатор записи:");
        Note note = noteController.readNote(id);
        System.out.println(note);
    }

    private void listNotes() {
        List<Note> listNotes = noteController.readAllNotes();
        for (Note note : listNotes) System.out.println(note);
    }

    private void updateNote() throws Exception {
        String readId = prompt("Введите ID записи: ");
        noteController.updateNote(readId, inputNote());
    }

    private void deleteNote() throws Exception {
        String readId = prompt("Введите ID записи: ");
        noteController.deleteNote(readId);
    }

}
