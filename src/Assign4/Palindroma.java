package Assign4;
public class Palindroma {
    public static void main(String[] args){
        String st ="madam";
        System.out.println("madam:" +isPalindroma("madam"));
    }
    public  static boolean isPalindroma(String st){
        for(int i=0;i<st.length()-1;i++){
            if(st.charAt(i)!=st.charAt(st.length()-1-i)){
             return false;
            }
        }
        return true;

    }
}