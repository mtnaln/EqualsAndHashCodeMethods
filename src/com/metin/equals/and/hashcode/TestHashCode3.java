package com.metin.equals.and.hashcode;

import java.util.HashMap;
import java.util.Map;

public class TestHashCode3 {

    public static void main(String[] args) {

        Person p1 = new Person(12345L, "Yusuf", "Alnıaçık");
        Person p2 = new Person(12345L, "Dilek", "Alnıaçık");
        Person p3 = new Person(12345L, "Dilek", "Alnıaçık");

        Map<Person, String> liste = new HashMap<>();
        liste.put(p1, "Yusuf");
        liste.put(p2, "Yusuf");
        liste.put(p3, "Dilek");

        System.out.println(liste.size()); // 2 kayıt mevcuttur.
    }
}
