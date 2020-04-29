// 11 - Solicite o nome e as três notas de uma disciplina que o usuário cursa. Em seguida informe se ele foi aprovado, ficou de recuperação ou foi reprovado. A média de aprovação é >= 7.0; a média de recuperação é >= 5.0 e < 7.0; e a média do reprovado é < 5.0.

import java.util.Scanner;

public class JB11
{
    public static void main(String[] args)
    {
        Scanner string = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Insira o seu nome: ");
        String name = string.nextLine();
        System.out.print("Insira a 1ª nota: ");
        double n1 = input.nextDouble();
        System.out.print("Insira a 2ª nota: ");
        double n2 = input.nextDouble();
        System.out.print("Insira a 3ª nota: ");
        double n3 = input.nextDouble();
        double media = (n1+n2+n3)/3;
        
        if(media >= 7){
            System.out.println("Você foi Aprovado!");
        }else if(media < 5){
            System.out.println("Você está Reprovado!");
        }else{
            System.out.println("Você está em Recuperação!");
        }
    }
}
