// 1 - Determine qual é a idade que o usuário faz no ano atual. Para isso solicite o seu ano de nascimento e o ano atual.
import java.util.Scanner;

public class Questao1
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       
       System.out.print("Insira seu ano de nascimento: ");
       int birth = input.nextInt();
       System.out.print("Insira o ano atual: ");
       int year = input.nextInt();
       
       int age = year - birth;
       System.out.println("Voce faz " + age + " anos em " + year + "!");
    }
}
