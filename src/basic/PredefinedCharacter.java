package basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * character classes::
 * \s ->             space;
 * \S ->             except space;
 * \d ->             any digit(0-9);
 * \D ->             except any digit(0-9);
 * \w ->             any alpha numeric character;
 * \W ->             except any alpha numeric character i.e special character;
 * .  ->             any characters;
 */
public class PredefinedCharacter {

    public static String regx1="\\s";
    public static String regx2="\\S";
    public static String regx3="\\d";
    public static String regx4="\\D";
    public static String regx5="\\w";
    public static String regx6="\\W";
    public static String regx7=".";

    public static void main(String[] args) {


        Pattern pattern= Pattern.compile(regx6);
        Matcher matcher=pattern.matcher("a#02Zc Bi4K &lb");

        while(matcher.find()){
            System.out.println(matcher.start()+"..."+matcher.group());
        }


    }
}
