import java.util.Scanner;

public class Desafio04 {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        int num = number.nextInt();  

        fizzBuzz(num);

    }

    static void fizzBuzz(int numero){
        
        if(numero%3 == 0 && numero%5 == 0){
           System.out.println("FizzBuzz"); 
        }
        else if( numero%3 == 0){
            System.out.println("Fizz");
        }
        else if(numero%5 == 0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(numero);
        }
    }
}