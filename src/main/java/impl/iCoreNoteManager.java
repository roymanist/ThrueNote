package impl;

import dataType.Note;

import java.util.List;

public interface iCoreNoteManager {

    List<Note> openAllNotes();
    Note createNote(String id, String name, String text);
    Note findById(String id);
    void deleteNote(String id);
}
