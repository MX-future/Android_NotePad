package com.example.mac.notepad;

import org.litepal.crud.LitePalSupport;

public class Note extends LitePalSupport {
    private String content;
    private String time;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
