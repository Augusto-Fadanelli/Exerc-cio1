/* Crie um jogo para o usuário descobrir um número sorteado de 1 a 100. A cada 
 * tentativa dele, forneça uma dica falando se o número é maior ou menor. Quando
 * ele descobrir exiba uma mensagem de parabéns e mostre em quantas tentativas
 * ele conseguiu. */
 
import java.util.Scanner;
import java.util.Random;

public class JB41
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Sorteio s1 = new Sorteio();

        Random gerador = new Random();
        int r = gerador.nextInt(100)+1;
        
        int flag = 0;
        do{        
        System.out.print("Digite um numero de 1 a 100: ");
        s1.num = input.nextInt();
        
        flag = s1.sortear(s1.num, r);
            
        }while(flag == 0);
    }
}

