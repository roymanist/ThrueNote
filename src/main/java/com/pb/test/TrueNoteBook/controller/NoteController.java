package com.pb.test.TrueNoteBook.controller;


import com.pb.test.TrueNoteBook.dataType.Note;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/xxx/xxx/xxx")
@AllArgsConstructor


public class NoteController {

    @GetMapping
public List<Note> FindAllNotes() throws SQLException {

        String relativePath = "src/main/java/resources/NoteDBase";
        List<Note> notebook = new ArrayList<>();
        // Преобразование относительного пути в абсолютный
        Path path = Paths.get(relativePath).toAbsolutePath();
        String URL = "jdbc:h2:" + path;


        Connection connection;
        connection = DriverManager.getConnection(URL);
        Statement SQL = connection.createStatement();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM notes");

        while (resultSet.next()) {
            Note note = new Note();
            note.setId(resultSet.getString("id"));
            note.setName(resultSet.getString("nameNote").trim());
            note.setText(resultSet.getString("textNote").trim());


            if (!notebook.contains(note)) {
                notebook.add(note);

            }
        }
        return notebook;
    }
}
