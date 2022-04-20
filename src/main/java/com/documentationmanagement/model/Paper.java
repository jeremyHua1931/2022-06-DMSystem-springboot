package com.documentationmanagement.model;

public class Paper {

        /*
        file_id            varchar(100)  null,  #文件id
    owner_id           varchar(100)  null,  #所属(用户id | 团队id)
    file_name          varchar(100)  null,  #文件名
    file_title         varchar(100)  null,  #文件标题
    file_author        varchar(200)  null,  #文件作者
    file_create_time   date          null,  #文件创建日期
    file_type          varchar(100)  null,  #文件类型
    file_edit_table    varchar(100)  null,  #文件批注信息表
    file_comment_table varchar(100)  null,  #文件评论信息表
    jc_name            varchar(200)  null,  #期刊或者会议名称
    page_number        varchar(100)  null,  #页数
    keyword            varchar(200)  null,  #关键词
    subtract           longtext      null,  #摘要
    permission         varchar(100)  null,  #文件权限(针对所有人: 可读, 可批注, 可评论)
    read_permission    varchar(1000) null,  #阅读权限(all, share_link[0], 用户id)
    edit_permission    varchar(1000) null,  #批注权限(all, share_link[1], 用户id)
    comment_permission varchar(1000) null,  #评论权限(all, share_link[2], 用户id)
    share_link         varchar(300)  null,  #分享链接(阅读链接, 批注链接, 评论链接)
         */

    String file_id            ;
    String owner_id           ;
    String file_name          ;
    String file_title         ;
    String file_author        ;
    String file_create_time   ;
    String file_type          ;
    String file_edit_table    ;
    String file_comment_table ;
    String jc_name            ;
    String page_number        ;
    String keyword            ;
    String subtract           ;
    String permission         ;
    String read_permission    ;
    String edit_permission    ;
    String comment_permission ;
    String share_link         ;

    public String getFile_id() {
        return file_id;
    }

    public void setFile_id(String file_id) {
        this.file_id = file_id;
    }

    public String getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(String owner_id) {
        this.owner_id = owner_id;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public String getFile_title() {
        return file_title;
    }

    public void setFile_title(String file_title) {
        this.file_title = file_title;
    }

    public String getFile_author() {
        return file_author;
    }

    public void setFile_author(String file_author) {
        this.file_author = file_author;
    }

    public String getFile_create_time() {
        return file_create_time;
    }

    public void setFile_create_time(String file_create_time) {
        this.file_create_time = file_create_time;
    }

    public String getFile_type() {
        return file_type;
    }

    public void setFile_type(String file_type) {
        this.file_type = file_type;
    }

    public String getFile_edit_table() {
        return file_edit_table;
    }

    public void setFile_edit_table(String file_edit_table) {
        this.file_edit_table = file_edit_table;
    }

    public String getFile_comment_table() {
        return file_comment_table;
    }

    public void setFile_comment_table(String file_comment_table) {
        this.file_comment_table = file_comment_table;
    }

    public String getJc_name() {
        return jc_name;
    }

    public void setJc_name(String jc_name) {
        this.jc_name = jc_name;
    }

    public String getPage_number() {
        return page_number;
    }

    public void setPage_number(String page_number) {
        this.page_number = page_number;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getSubtract() {
        return subtract;
    }

    public void setSubtract(String subtract) {
        this.subtract = subtract;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getRead_permission() {
        return read_permission;
    }

    public void setRead_permission(String read_permission) {
        this.read_permission = read_permission;
    }

    public String getEdit_permission() {
        return edit_permission;
    }

    public void setEdit_permission(String edit_permission) {
        this.edit_permission = edit_permission;
    }

    public String getComment_permission() {
        return comment_permission;
    }

    public void setComment_permission(String comment_permission) {
        this.comment_permission = comment_permission;
    }

    public String getShare_link() {
        return share_link;
    }

    public void setShare_link(String share_link) {
        this.share_link = share_link;
    }
}
