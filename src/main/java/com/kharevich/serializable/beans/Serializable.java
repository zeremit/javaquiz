package com.kharevich.serializable.beans;

/**
 * Created by zeremit on 27.1.15.
 */
public class Serializable implements java.io.Serializable{

    NotSerializable notSerializable;

    String surname;

    public NotSerializable getNotSerializable() {
        return notSerializable;
    }

    public void setNotSerializable(NotSerializable notSerializable) {
        this.notSerializable = notSerializable;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
