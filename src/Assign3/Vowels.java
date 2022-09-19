package Assign3;

public class Vowels {
    public static void main(String[] args){
 System.out.print("manasa :" + getVowels("manasa"));
    }
    public static int getVowels(String st){
        int counter=0;
        for(int i=0;i<st.length();i++){
            char c =st.charAt(i);
            if(c=='a' || c=='e' || c=='i'|| c=='o' || c=='u'){
                counter=counter+1;
            }
        }
        return counter;
    }
}


