// 7 - Calcule e exiba a comissão de 10% de um garçom num restaurante a partir do valor da despesa de um cliente.

import java.util.Scanner;

public class JB7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira o valor pago pelo cliente em R$: ");
        double money = input.nextDouble();
        
        double commission = money/10;
        System.out.println("Comissão do garçom: R$" + commission);
    }
}
