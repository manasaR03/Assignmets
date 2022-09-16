package Assign2;

public class FizzBuzz {
    public static void main(String[] args) {
        printFizzBuzz(500);
    }

    public static void printFizzBuzz(int n){

        for(int i=1; i< n ;i++){
            if(i%15==0){
                System.out.println( i +": FizzBuzz");
            } else if(i%3==0){
                System.out.println(i + ": Fizz");
            } else if( i%5==0){
                System.out.println(i + ": Buzz");
            }
        }


    }
}
