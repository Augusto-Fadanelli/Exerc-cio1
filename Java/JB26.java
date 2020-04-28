// 26 - Receba 2 horários e exiba a diferença entre eles em segundos. A entrada destes horários pode ocorrer em qualquer ordem. Dica: transforme os dois horários para segundos.
import java.util.Scanner;

public class JB26
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira a hora: ");
        int hora1 = input.nextInt();
        System.out.print("Insira os minutos: ");
        int min1 = input.nextInt();
        
        System.out.println();
        
        System.out.print("Insira a hora: ");
        int hora2 = input.nextInt();
        System.out.print("Insira os minutos: ");
        int min2 = input.nextInt();
        
        int seg1 = 3600 * hora1 + 60 * min1;
        int seg2 = 3600 * hora2 + 60 * min2;
        
        System.out.print("A diferenca entre os horarios em segundos e de: ");
        if(seg1 < seg2){
            System.out.println(seg2 - seg1);
        }else{
            System.out.println(seg1 - seg2);
        }
    }
}
