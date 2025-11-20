package Page_44;

public class BeerSong {
    public static void main(String[] args) {
        int numberBeer=3;
        String word ="бутылков";

        while( numberBeer >0 ){
            if(numberBeer==1){
                word = "бутылка";
            }else if (numberBeer > 1){
                word = "бутылков";
            }
            System.out.println(numberBeer +" "+ word + " пива на стене " );
            System.out.println(numberBeer +" "+ word +" пива");
            System.out.println("возьмите одну пожалуйста ");
            numberBeer=numberBeer- 1;

             if(numberBeer > 0){
                System.out.println(numberBeer +" "+ word + " пива на стене " );
                System.out.println("=================================================");
            }else  {
                System.out.println("большее никаких бутылков пива на стене " );
            }

        }
    }



}
