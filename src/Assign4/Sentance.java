package Assign4;

public class Sentance {
    public static void main(String[] args){
    String st= "i am learning java";
    String st1="java";
    System.out.println("String 1 :" +st + " String 2 :" +st1 + " Ans : "+ isString(st,st1));

}
  public static boolean isString(String st, String st1){
        for(int i=0;i<=st.length()-st1.length();i++)
        {
            int j=0 ;
            while ( st.charAt(i+j) == st1.charAt(j)){
                if(st1.length()-1 == j)
                    return true;
                j++;
            }
        }
        return  false;

    }
}
