package Assign5;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayString {
public static void main(String[] args){
    ArrayList<Integer>list=new ArrayList<Integer>();
    list.add(5);
    list.add(12);
    list.add(9);
    list.add(33);
    list.add(26);
    list.add(4);

    System.out.println( "String:"+list);
    Collections.swap(list,1,5);
    System.out.println("swap:"+list);

}


}
