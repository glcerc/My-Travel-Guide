package com.company;

public class Profile {
    private int id;
     String details;
    private String name;
    private String surname;
    private String eMail;
    private String myPlaces;
    private String mustGo;
    private String haveGone;
    private String favorites;
    private  String password;

    public Profile(int id, String details, String name, String surname, String eMail, String myPlaces, String mustGo, String haveGone, String favorites, String password) {
        this.id = id;
        this.details = details;
        this.name = name;
        this.surname = surname;
        this.eMail = eMail;
        this.myPlaces = myPlaces;
        this.mustGo = mustGo;
        this.haveGone = haveGone;
        this.favorites = favorites;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getMyPlaces() {
        return myPlaces;
    }

    public void setMyPlaces(String myPlaces) {
        this.myPlaces = myPlaces;
    }

    public String getMustGo() {
        return mustGo;
    }

    public void setMustGo(String mustGo) {
        this.mustGo = mustGo;
    }

    public String getHaveGone() {
        return haveGone;
    }

    public void setHaveGone(String haveGone) {
        this.haveGone = haveGone;
    }

    public String getFavorites() {
        return favorites;
    }

    public void setFavorites(String favorites) {
        this.favorites = favorites;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
