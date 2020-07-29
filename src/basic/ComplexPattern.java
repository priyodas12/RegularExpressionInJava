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
    public static void main(String[] args) {

      Pattern pattern= Pattern.compile("x");
      Matcher matcher=pattern.matcher("ab#0Z");
      
      while(matcher.find()){
          System.out.println(matcher.start()+"..."+matcher.end());
      }


    }
}
