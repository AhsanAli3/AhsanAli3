import java.util.Random;

public class randomnum {
    public static void main(String[] args){

        Random random = new Random();

        int number1;
        double number2;
        boolean isHead;

       
    //    String alp;


        number1 = random.nextInt(1, 101); // Gives a range from 1 to 5
        number2 = random.nextDouble(); // genertaes a number from 0 to 1 basically a fraction
        isHead = random.nextBoolean();

        if(isHead){
         System.out.println("Heads");

        }

        else{

            System.out.println("Tails");
        }
        System.out.println(number1 + number2);
        
        
        
    

    }
    
}
