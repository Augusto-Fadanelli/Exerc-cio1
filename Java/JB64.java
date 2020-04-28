// 64 - Desenhe a seguinte seqüência de triângulos. O usuário determina a quantidade de triângulos.// 65 - Desenhe a seguinte pirâmide de asteriscos. O usuário determina a quantidade de linhas.
import java.util.Scanner;

public class JB64
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira a quantidade de triangulos: ");
        int triangulos = input.nextInt();
        
        for(int k=0; k<triangulos; k++){
            //Triangulos
            for(int i=0; i<=k; i++){
                //Linhas
                for(int j=0; j<=i; j++){
                    //colunas
                        System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
