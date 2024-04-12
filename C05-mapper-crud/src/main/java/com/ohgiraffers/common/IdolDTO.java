package com.ohgiraffers.common;

public class IdolDTO {

    private int groupCode;
    private String groupName;
    private int groupCount;
    private String entName;
    private String hitSong;
    private String fandumName;
    private String debYear;
    private String disYear;
    private char disYn;

    public IdolDTO() {}

    public IdolDTO(int groupCode, String groupName, int groupCount, String entName, String hitSong, String fandumName, String debYear, String disYear, char disYn) {
        this.groupCode = groupCode;
        this.groupName = groupName;
        this.groupCount = groupCount;
        this.entName = entName;
        this.hitSong = hitSong;
        this.fandumName = fandumName;
        this.debYear = debYear;
        this.disYear = disYear;
        this.disYn = disYn;
    }

    public int getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(int groupCode) {
        this.groupCode = groupCode;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getGroupCount() {
        return groupCount;
    }

    public void setGroupCount(int groupCount) {
        this.groupCount = groupCount;
    }

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }

    public String getHitSong() {
        return hitSong;
    }

    public void setHitSong(String hitSong) {
        this.hitSong = hitSong;
    }

    public String getFandumName() {
        return fandumName;
    }

    public void setFandumName(String fandumName) {
        this.fandumName = fandumName;
    }

    public String getDebYear() {
        return debYear;
    }

    public void setDebYear(String debYear) {
        this.debYear = debYear;
    }

    public String getDisYear() {
        return disYear;
    }

    public void setDisYear(String disYear) {
        this.disYear = disYear;
    }

    public char getDisYn() {
        return disYn;
    }

    public void setDisYn(char disYn) {
        this.disYn = disYn;
    }

    @Override
    public String toString() {
        return "IdolDTO{" +
                "groupCode=" + groupCode +
                ", groupName='" + groupName + '\'' +
                ", groupCount=" + groupCount +
                ", entName='" + entName + '\'' +
                ", hitSong='" + hitSong + '\'' +
                ", fandumName='" + fandumName + '\'' +
                ", debYear='" + debYear + '\'' +
                ", disYear='" + disYear + '\'' +
                ", disYn=" + disYn +
                '}';
    }
}