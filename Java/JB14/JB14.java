/*Receba do usuário o nome de um mês. Exiba o número equivalente. Obs.: para 
 * comparar Strings em Java deve-se usar o método equals ou equalsIgnoreCase, 
 * mas nunca o operador “==”. Por exemplo, para comparar a variável nome com 
 * “Maria” deve-se usar: if(nome.equals(“Maria”)*/
 
 import java.util.Scanner;

public class JB14
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Calendario c1 = new Calendario();
        
        System.out.print("Insira o nome do mês: ");
        c1.mes = input.nextLine();
        
        c1.numMes(c1.mes);
        
    }
}
