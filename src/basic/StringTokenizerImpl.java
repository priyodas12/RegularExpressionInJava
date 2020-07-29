package basic;

import java.util.StringTokenizer;

public class StringTokenizerImpl {
    public static void main(String[] args) {
        //default regex for string tokenizer is space
        StringTokenizer st=new StringTokenizer("www infosys com");

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
