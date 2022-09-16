package Assign2;

public class FibonacciSeries {

    public static void main(String[] args) {
        printFib(10);
    }

    public static void printFib(int n){
        // 0,1,(0+1),((0+1)+1)
        // n = 4 : print = 0,1,(0+1),((0+1)+1)
        int a = 0, b=1;
        System.out.println(a);
        int i=1;
        while(i<n){
            System.out.println(b);
            int c = a + b;
            a = b;
            b = c;
            i++;
        }
    }
}
