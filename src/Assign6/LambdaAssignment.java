package Assign6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

public class LambdaAssignment {
    public static void main(String[] args){
        String st="This is a test";

        HashMap<Character,Integer> c = new HashMap<>();


        

        for( char c1 : st.toLowerCase().toCharArray()){
            c.put(c1,c.getOrDefault(c1,0)+1);
        }

        Stream.of(c).forEach(a -> System.out.println( a + " : "+ c.get(a)));

    }
}
