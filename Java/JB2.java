// 2 - Calcule e exiba a quantidade de salários mínimos que um determinado funcionário ganha. Para isto, peça o valor do seu salário e o valor do salário mínimo atual.

import java.util.Scanner;

public class JB2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira o valor do salario mensal do funcionario em R$: ");
        double salary = input.nextDouble();
        System.out.print("Insira o valor do salario minimo em R$: ");
        double minimum = input.nextDouble();
        
        double amount = salary/minimum;
        System.out.println("O funcionario recebe " + amount + " salarios minimos!");
    }
}
