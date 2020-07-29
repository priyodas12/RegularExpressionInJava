package basic;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSplit {
    public static String regx1="\\s";

    public static void main(String[] args) {

        //use regex from above list accordingly;
        Pattern pattern=Pattern.compile(regx1);

        String [] output= pattern.split("in fo sys limited");

        Arrays.asList(output).forEach(System.out::println);

        //or

        Arrays.stream(output).forEach(System.out::println);
    }
}
