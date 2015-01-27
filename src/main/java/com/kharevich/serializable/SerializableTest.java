package com.kharevich.serializable;

import com.kharevich.serializable.beans.NotSerializable;
import com.kharevich.serializable.beans.Serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by zeremit on 27.1.15.
 */
public class SerializableTest {

    public static void main(String[] args) {
        Serializable serializable = new Serializable();
        NotSerializable notSerializable = new NotSerializable();
        notSerializable.setName("John");
        serializable.setSurname("Walker");
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("object.ser");
            ObjectOutputStream os = new ObjectOutputStream(fout);
            os.writeObject(serializable);
            os.close();
            System.out.println("done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        serializable.setNotSerializable(notSerializable);
        try {
            fout = new FileOutputStream("object.ser");
            ObjectOutputStream os = new ObjectOutputStream(fout);
            os.writeObject(serializable);
            os.close();
            System.out.println("done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
