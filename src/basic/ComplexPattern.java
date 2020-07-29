package basic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* character classes::
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

    public static String regx1="[abc]";
    public static String regx2="[^abc]";
    public static String regx3="[A-Z]";
    public static String regx4="[a-z]";
    public static String regx5="[a-zA-Z]";
    public static String regx6="[0-9]";
    public static String regx7="[a-zA-Z0-9]";
    public static String regx8="[^a-zA-Z0-9]";

    public static void main(String[] args) {

        //use regex from above list accordingly;
        Pattern pattern= Pattern.compile(regx8);
        Matcher matcher=pattern.matcher("a#02ZcBi4K&lb");
      
          while(matcher.find()){
              System.out.println(matcher.start()+"..."+matcher.group());
          }
    }
}
