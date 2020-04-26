// 19 - Exiba dois números fornecidos pelo usuário em ordem crescente.
import java.util.Scanner;

public class Questao19
{
    public static void main(String[] args)
    {        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira o primeiro numero: ");
        int num1 = input.nextInt();
        System.out.print("Insira o segundo numero: ");
        int num2 = input.nextInt();
        
        if(num1 < num2){
            System.out.println(num1 + "; " + num2);
        }else{
            System.out.println(num2 + "; " + num1);
        }
    }
}
