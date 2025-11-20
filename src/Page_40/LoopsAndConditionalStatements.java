package Page_40;

public class LoopsAndConditionalStatements {

        public static void main(String[] args) {
            int x = 3;
            String name = "Кинжал";
            x *= 17;
            System.out.println("X равен " + x);
            double d = Math.random();
            System.out.println("d равен " + d);

            while(x > 12) {
                --x;
                System.out.println("while = " + x);
            }

            for(x = 0; x < 10; ++x) {
                System.out.println("теперь  x равен " + x);
            }

            if (x == 10) {
                System.out.println("x должон быть равен 10");
            } else {
                System.out.println("x не равен 10");
            }

             x = 2;
            if (x < 3 & name.equals("Кинжал")) {
                System.out.println("осторожно");
            }
            while (x< 5){
                System.out.println("x="+x);
                x++;
            }
            while (x > 1){
                System.out.println(" x small ot 1 ("+ x +")");
                x--;
            }

        }
    }


