package Assign3;

public class IntArray {
    public static void main(String[] args) {
        int[] num = new int[]{14,6 ,9, 2, 58, 8 ,22 ,1};
printSmallestLargest(num );
    }

    public static void printSmallestLargest(int[] arr ){

        int  small= arr[0];
        int large =arr[0];

        for(int i=0;i<arr.length;i++){
            int a = arr[i];
            if(a<small){
                small=a;
            }
            if(a>large){
                large=a;
            }
        }
        System.out.println( "largest:" +large);
        System.out.println("smallest:" +small);
    }

}
