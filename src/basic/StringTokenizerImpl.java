package basic;

import java.util.StringTokenizer;

public class StringTokenizerImpl {
    public static void main(String[] args) {
        //default regex for string tokenizer is space
        StringTokenizer st1=new StringTokenizer("www infosys com");
        StringTokenizer st2=new StringTokenizer("07/29/2020","/");

        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }

        while(st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }
    }
}
