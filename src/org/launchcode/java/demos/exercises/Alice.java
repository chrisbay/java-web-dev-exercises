package org.launchcode.java.demos.exercises;

import java.util.Scanner;

/**
 * Created by Chris Bay
 */
public class Alice {

    public static void main(String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Search term:");
        String term = input.nextLine();
        boolean found = alice.toLowerCase().contains(term);
        System.out.println("Term found: " + found);
        int idx = alice.toLowerCase().indexOf(term);
        System.out.println("Location: " + idx);
        System.out.println("length: " + term.length());
//        String modifiedAlice = alice.replace(term, "");
        String modifiedAlice = alice.substring(0, idx) + alice.substring(idx + term.length());
        System.out.println("Sentence with your term removed: ");
        System.out.println(modifiedAlice);
    }
}
