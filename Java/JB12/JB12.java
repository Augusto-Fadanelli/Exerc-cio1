/* 12 - A partir da idade informada de um cidadão diga se ele não pode votar (idade inferior a 16), ou se o
voto é facultativo (idade igual a 16 ou 17 ou ainda maior do que 70), ou ainda se o voto é obrigatório
para idades entre 18 e 70 (incluindo estes valores). */

import java.util.Scanner;

public class JB12
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Cidadao c1 = new Cidadao();
        
        System.out.print("Insira a sua idade: ");
        c1.idade = input.nextInt();
        
        c1.votar(c1.idade);
    }
}
