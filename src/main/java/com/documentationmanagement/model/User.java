package com.documentationmanagement.model;

public class User {

    /*
    create table users
(
    user_id             varchar(100)  null, #用户ID
    user_name           varchar(200)  null, #用户昵称
    user_pwd            varchar(100)  null, #用户密码
    user_email          varchar(200)  null, #用户邮箱
    personal_documentdb varchar(1000) null, #个人用户文献库, 文件默认放在个人默认文献库
    Team_creator        varchar(1000) null, #创建的团队(团队id数组, 用','区分)
    Team_joined         varchar(1000) null, #加入的团队(团队id数组, 用','区分)

    PRIMARY KEY(userid)
)
     */
    String userId;
    String userName;
    String userPwd;
    String userEmail;
    String personal_documentdbb;
    String Team_creator;
    String Team_joined;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPersonal_documentdbb() {
        return personal_documentdbb;
    }

    public void setPersonal_documentdbb(String personal_documentdbb) {
        this.personal_documentdbb = personal_documentdbb;
    }

    public String getTeam_creator() {
        return Team_creator;
    }

    public void setTeam_creator(String team_creator) {
        Team_creator = team_creator;
    }

    public String getTeam_joined() {
        return Team_joined;
    }

    public void setTeam_joined(String team_joined) {
        Team_joined = team_joined;
    }
}
