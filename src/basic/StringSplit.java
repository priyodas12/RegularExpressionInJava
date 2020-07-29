package basic;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSplit {
    public static String regx1="\\s";
    public static String regx2="\\.";

    public static void main(String[] args) {

        //use regex from above list accordingly;
        Pattern pattern1=Pattern.compile(regx1);
        Pattern pattern2=Pattern.compile(regx2);


        String [] output1= pattern1.split("in fo sys limited");
        String [] output2= pattern2.split("www.infosys.in");

        Arrays.asList(output1).forEach(System.out::println);

        //or

        Arrays.stream(output2).forEach(System.out::println);
    }
}
