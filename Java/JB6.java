// 6 - Calcule e exiba área ocupada por um círculo cujo raio mede 5 metros. A área de um círculo é ¶ (PI) multiplicado pelo raio elevado ao quadrado. Em Java o valor de ¶ está disponível na constante Math.PI

import java.util.Scanner;
//import java.math.pi;

public class Questao6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        double r = 5; // Raio em metros
        double a = Math.PI*r*r; // Área
        
        System.out.println("A área de um círculo cujo raio " + r + " m é de " + a + "m");
    }
}
