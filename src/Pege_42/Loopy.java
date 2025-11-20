package Pege_42;

public class Loopy {
    public static void main(String[] args) {
        int x= 1;
        System.out.println("началая цикла" );

        while(x< 4){
            System.out.println("внутри цикла");

            System.out.println("x = " + x);
            x= x+1;
        }
        System.out.println("кончаничая цикла ");
    }
}
