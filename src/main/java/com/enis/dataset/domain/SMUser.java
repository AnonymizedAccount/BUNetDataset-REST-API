package com.enis.dataset.domain;

/**
 * Created by amina on 09/11/2018.
 */
public class SMUser {

    private String name;
    private String snLink;

    public SMUser() {
    }

    public SMUser(String name, String snLink) {
        this.name = name;
        this.snLink = snLink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSNLink() {
        return snLink;
    }

    public void setSNLink(String snLink) {
        this.snLink = snLink;
    }
}
