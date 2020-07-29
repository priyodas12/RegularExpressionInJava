package basic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExImplOne {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter target string:::");
        String targetString=scn.next();
        System.out.println("Enter regex string:::");
        String findRegexString=scn.next();

        int countOfRegEx=0;

        //which regular expression we are searching pattern
        Pattern pattern=Pattern.compile(findRegexString);

        //target String
        Matcher matcher=pattern.matcher(targetString);

        //
        while(matcher.find()){
            countOfRegEx++;
            System.out.println("starts at "+matcher.start()+"..ends "+matcher.end()+"..group "+matcher.group());
        }

        System.out.println("'"+findRegexString+"' presents  "+countOfRegEx+ " times in "+targetString);
    }
}
