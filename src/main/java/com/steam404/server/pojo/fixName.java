package com.steam404.server.pojo;

public class fixName {
    String newName;
    String oldName;

    public fixName() {
    }

    public fixName(String newName, String oldName) {
        this.newName = newName;
        this.oldName = oldName;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    @Override
    public String toString() {
        return "fixName{" +
                "newName='" + newName + '\'' +
                ", oldName='" + oldName + '\'' +
                '}';
    }
}
