// 65 - Desenhe a seguinte pirâmide de asteriscos. O usuário determina a quantidade de linhas.
import java.util.Scanner;

public class JB65
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira a quantidade de linhas: ");
        int linhas = input.nextInt();
        
        for(int i=0, l=linhas; i<linhas; i++, l--){
            //Linhas
            for(int j=0; j<linhas; j++){
                //colunas - Esquerda
                if(j<l){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            for(int k=0; k<=i; k++){
                //colunas - Direita
                System.out.print("*");
            }
            
            System.out.println();
        }

    }
}
