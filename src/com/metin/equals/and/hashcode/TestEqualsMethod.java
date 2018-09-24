package com.metin.equals.and.hashcode;

public class TestEqualsMethod {

    public static void main(String[] args) {

        Person p1 = new Person(12345L, "Yusuf", "Alnıaçık");
        Person p2 = new Person(12345L, "Yusuf", "Alnıaçık");

        System.out.println("p1 ve p2 içerikleri aynı mı? ==> " + (p1.equals(p2)));
        // Eğer tüm alanları kontrol ederek equals metodunu tanımlarsak değer true olarak dönecektir.
    }
}
