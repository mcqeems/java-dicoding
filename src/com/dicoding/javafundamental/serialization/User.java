package com.dicoding.javafundamental.serialization;

import java.io.Serializable;

public class User implements Serializable {
    String name;
    transient String password;

    public User (String name, String password){
        this.name = name;
        this.password = password;
    }
}
