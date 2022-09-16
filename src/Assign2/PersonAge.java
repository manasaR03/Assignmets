package Assign2;

public class PersonAge {

    public static void main(String[] args) {

        printAge(12);
        printAge(40);



    }

    public static void printAge(int a){
        if(a<=13)
        {
            System.out.println("person is a kid");
        } else if(a<=19)
        {
            System.out.println("person is teen");
        } else
        {
            System.out.println("person is adult");
        }
    }


}
