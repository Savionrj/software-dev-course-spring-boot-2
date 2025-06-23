package com.example.mycollections.controllers;

import com.example.mycollections.models.MusicAlbum;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/musicAlbums")
public class MusicAlbumController {
    private final List<MusicAlbum> musicAlbums = new ArrayList<>() {{
        add(new MusicAlbum("Super Trouper", "ABBA", 1980, 12));
        add(new MusicAlbum("Are You Serious", "Andrew Bird", 2016, 11));
        add(new MusicAlbum("K.I.D.S.", "Mac Miller", 2010, 18));
    }};

    @GetMapping("/json")
    public List<MusicAlbum> getMusicAlbumsJson() {
        return musicAlbums;
    }

    @GetMapping("/html")
    public String getMusicAlbumsHtml() {
        String musicAlbumList = "<ul>";
        for (MusicAlbum musicAlbum : musicAlbums) {
            musicAlbumList += "<li>" + musicAlbum + "</li>";
        }
        musicAlbumList += "</ul>";

        return """
                <html>
                    <body>
                        <h1>Books</h1>
                        <ul>
                """ +
                musicAlbumList +
                """
                        </ul>
                    </body>
                """;
    }
}
