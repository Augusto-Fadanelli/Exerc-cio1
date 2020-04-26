// 5 - Calcule e exiba o valor final de uma dívida. Para isto pergunte ao usuário o valor inicial do débito, a quantidade de meses e os juros mensais. Use o calculo de juros simples.

import java.util.Scanner;

public class Questo5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira o valor inicial do débito em R$: ");
        double debit = input.nextDouble();
        System.out.print("Insira a quantidade de mêses de atraso: ");
        int months = input.nextInt();
        System.out.print("Insira os juros mensais em R$: ");
        double interest = input.nextDouble();
        
        double finalValue = debit+(months*interest);
        System.out.println("O valor final da dívida é R$" + finalValue);
    }
}
