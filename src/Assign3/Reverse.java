package Assign3;

public class Reverse {
    public static void main(String[] args){
        System.out.print("manasa:" +getReverse("manasa"));

        // str = Manasa
        // ans : asanam
    }
    public static String getReverse(String st){

        String res = "";
        for(int i=st.length()-1;i>0;i--){
            res = res + st.charAt(i);
        }
        return res;
    }
}




