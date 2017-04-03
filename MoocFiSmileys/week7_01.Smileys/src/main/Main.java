package main;

import smileys.Smileys;

public class Main {
    public static void main(String[] args) {
        Smileys smileys = new Smileys();
        
        System.out.println(smileys.printCharacterStringSurroundedBySmiles("Karen"));
        System.out.println(smileys.printCharacterStringSurroundedBySmiles("Lucas"));
        System.out.println(smileys.printCharacterStringSurroundedBySmiles("Joao"));
        
    }
}
