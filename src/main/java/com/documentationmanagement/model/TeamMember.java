package com.documentationmanagement.model;

public class TeamMember {

      String team_id                 ;
      String member_id               ;
      String member_name             ;
      String member_permission       ;
      String member_group_permission ;
      String member_doucumentdb      ;

    public String getTeam_id() {
        return team_id;
    }

    public void setTeam_id(String team_id) {
        this.team_id = team_id;
    }

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public String getMember_permission() {
        return member_permission;
    }

    public void setMember_permission(String member_permission) {
        this.member_permission = member_permission;
    }

    public String getMember_group_permission() {
        return member_group_permission;
    }

    public void setMember_group_permission(String member_group_permission) {
        this.member_group_permission = member_group_permission;
    }

    public String getMember_doucumentdb() {
        return member_doucumentdb;
    }

    public void setMember_doucumentdb(String member_doucumentdb) {
        this.member_doucumentdb = member_doucumentdb;
    }
}
