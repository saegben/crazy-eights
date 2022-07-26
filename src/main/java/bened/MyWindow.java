package bened;

import java.util.Scanner;

public class MyWindow {

    public void print () {
        System.out.println();
    }

    public void print (String msg) {
        System.out.println(msg);
    }

    protected char promptForChar(String prompt) {
        char c = ' ';
        boolean valid = false;
        while (!valid) {
            Scanner input = new Scanner(System.in);
            //print(prompt);
            System.out.println(prompt);
            //String s = input();
            String s = input.nextLine();
            if (s.length() == 1) {
                c = s.charAt(0);
                valid = true;
            } else {
                c = promptForChar(prompt);
            }
        }
        return c;
    }

    protected String promptForString(String prompt) {
        String val = " ";
        boolean valid = false;
        while (!valid) {
            Scanner input = new Scanner(System.in);
            //print(prompt);
            System.out.println(prompt);
            //String s = input();
            String s = input.nextLine();
            if (s.length() == 1) {
                //val = s.charAt(0);
                val = s;
                valid = true;
            } else {
                val = promptForString(prompt);
            }
        }
        return val;
    }
}
