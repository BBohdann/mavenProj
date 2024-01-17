package org.example;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        String name = "Bohdan";
        String lastName = "Bodnar";

        Person person = new Person(name, lastName);

        Gson gson = new Gson();
        String json = gson.toJson(person);

        System.out.println(json);
    }
}