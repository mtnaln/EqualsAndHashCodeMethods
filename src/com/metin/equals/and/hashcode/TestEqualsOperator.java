package com.metin.equals.and.hashcode;

public class TestEqualsOperator {

    public static void main(String[] args) {

        Person p1 = new Person(12345L, "Yusuf", "Alnıaçık");
        Person p2 = new Person(12345L, "Yusuf", "Alnıaçık");

        System.out.println("p1 ==> " + p1);
        System.out.println("p2 ==> " + p2);

        System.out.println("p1 ve p2 adresleri aynı mı? ==> " + (p1 == p2));
    }
}
