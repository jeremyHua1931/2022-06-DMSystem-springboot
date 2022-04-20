package com.documentationmanagement.model;

public class Edit {

    /*
    file_id          varchar(100)  null,
location         varchar(200)  null,
editor           varchar(100)  null,
edit_time        date          null,
content          longtext      null,
     */

    String file_id          ;
    String location         ;
    String editor           ;
    String edit_time        ;
    String content          ;

    public String getFile_id() {
        return file_id;
    }

    public void setFile_id(String file_id) {
        this.file_id = file_id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getEdit_time() {
        return edit_time;
    }

    public void setEdit_time(String edit_time) {
        this.edit_time = edit_time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
