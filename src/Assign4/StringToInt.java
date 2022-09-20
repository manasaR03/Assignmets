package Assign4;

public class StringToInt {
    public static void main(String[] args) {
        String st = "35";

    System.out.println("String 35: int=" +getInt("35"));

    }
    public static int getInt(String st){
    int a=(int) st.charAt(0)-'0';
    for(int i=1;i<st.length();i++){
    a=a*10;
     a=a+((int) st.charAt(i)-'0');
     }
    return a;
  }
    }

