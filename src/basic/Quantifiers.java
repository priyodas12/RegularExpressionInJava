package basic;

/*
 * Quantifiers::
 * a  ->          single match of a;
 * a+ ->          sequence of a;
 * a* ->          any number of a including 0 numbers of a=a+U{E};
 * a? ->          at least one a;
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {
    public static String regx1="a+";
    public static String regx2="a*";
    public static String regx3="a?";

    public static void main(String[] args) {

        //use regex from above list accordingly;
        Pattern pattern= Pattern.compile(regx3);
        Matcher matcher=pattern.matcher("abaabaaacaaaad");

        while(matcher.find()){
            System.out.println(matcher.start()+"..."+matcher.group());
        }
    }
}
