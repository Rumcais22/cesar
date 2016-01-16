package com.company;

public class Main {

    static String caesar(String value, int shift) {
        char[] buffer = value.toCharArray();
        for (int i = 0; i < buffer.length; i++) {
            char letter = buffer[i];
            letter = (char) (letter + shift);
            if (letter > 'z') {
                letter = (char) (letter - 26);
            } else if (letter < 'a') {
                letter = (char) (letter + 26);
            }
            buffer[i] = letter;
        }
        return new String(buffer);
    }
    public static void main(String[] args) {
        String a = "ccc";
        System.out.println(a);
        String b = caesar(a, 5 );
        System.out.println(b);
    }
}# cesar
