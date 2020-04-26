// 63 - Desenhe a seguinte pirâmide de números. O usuário determina a quantidade de linhas.
import java.util.Scanner;

public class Questao63
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira a quantidade de linhas: ");
        int linhas = input.nextInt();
        
        for(int i=0; i<linhas; i++){
            //linhas
            for(int j=0; j<i+1; j++){
                //colunas
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }

    }
}
