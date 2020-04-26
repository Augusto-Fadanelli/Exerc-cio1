// 9 - Verifique se o usuário é maior de idade ou não.
import java.util.Scanner;

public class Questao9
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira a sua idade: ");
        int idade = input.nextInt();
        
        if(idade < 18){
            System.out.println("Menor de idade!");
        }else{
            System.out.println("Maior de idade!");
        }
    }
}
