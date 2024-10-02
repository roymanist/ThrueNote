/*package com.pb.test.TrueNoteBook.manager;

import com.pb.test.TrueNoteBook.dataType.Note;
import com.pb.test.TrueNoteBook.impl.Repositoriy;
import com.pb.test.TrueNoteBook.impl.iCoreNoteManager;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class NoteManager implements iCoreNoteManager, GetURLDBase  {

    private static NoteManager instance;
    private static final Object lock = new Object();/// не сильно понял этот локер. по теории он блочит создание дубля в многопоточности

    private Connection connection;
    private List<Note> notebook;


    private NoteManager(Repositoriy repository) throws SQLException {
        this.repository = repository;
        // connection = DriverManager.getConnection("jdbc:h2:E:/JAVA_LRN/II/PROJ/NEW-NOTE-V2/src/main/java/dbase/NoteDBase");
        connection = DriverManager.getConnection(GetURL());
        notebook = new ArrayList<>();
    }

    private final Repositoriy repository;
    @Override
    public List<Note> FindAllNotes() throws SQLException {

        return repository.FindAllNotes();
    }
    @Override
    public List<Note> openAllNotes() {
        return null;
    }

    @Override
    public Note createNote(String id, String name, String text) {
        return null;
    }

    @Override
    public Note findById(String id) {
        return null;
    }

    @Override
    public void deleteNote(String id) {

    }
}*/
