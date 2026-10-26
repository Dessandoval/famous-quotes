package com.pluralsight;

import java.util.Scanner;

public class QuotesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] famousQuotes = {
                "To be, or not to be, that is the question.",
                "The only thing we have to fear is fear itself.",
                "In the middle of difficulty lies opportunity.",
                "I think, therefore I am.",
                "Not all those who wander are lost.",
                "Be the change that you wish to see in the world.",
                "The journey of a thousand miles begins with one step.",
                "That which does not kill us makes us stronger.",
                "Life is what happens when you're busy making other plans.",
                "Stay hungry, stay foolish."
        };
        try {
            System.out.print("Select a quote from (1-10): ");
            int i = scanner.nextInt();
            i--;
            System.out.println(famousQuotes[i]);
        } catch (Exception e) {
            e.printStackTrace();;
        }

        scanner.close();
    }
}
