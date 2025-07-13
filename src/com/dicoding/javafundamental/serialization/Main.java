package com.dicoding.javafundamental.serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        User user = new User("Mcqeems", "Rahasia123");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.txt"));
        oos.writeObject(user);
        oos.close();

        System.out.println("Objek disimpan. Username: " + user.name + " Password: " + user.password);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.txt"));
        User userHasilBaca = (User) ois.readObject();
        ois.close();

        System.out.println("Objek dibaca. Username: " + userHasilBaca.name + " Password: " + userHasilBaca.password);

    }
}
