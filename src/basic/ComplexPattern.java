package basic;

import java.util.Scanner;
/*
* [abc] ->          either a or bor c;
* [^abc] ->         neither a or b or c;
* [a-z] ->          any lower case alphabet
* [A-Z] ->          any uppercase alphabet
* [a-zA-Z]->        any alphabet symbol
* [0-9] ->          any digits
* [a-zA-Z0-9]->     any alpha numeric characters
* [^a-zA-Z0-9]->    except any alpha numeric characters,only special characters
*
*/
public class ComplexPattern {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        System.out.println("Enter target string:::");
        String targetString=scn.next();
        System.out.println("Enter regex string:::");
        String findRegexString=scn.next();


    }
}
