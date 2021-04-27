/*Verifique a validade de uma data de aniversário (solicite apenas o número do
 * dia e do mês). Além de falar se a data está ok, informe também o nome do mês.*/

 import java.util.Scanner;

public class JB15
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Calendario c1 = new Calendario();
        
        System.out.print("Insira o numero referente ao mês de aniversario: ");
        c1.mes = input.nextInt();
        System.out.print("Insira o numero referente ao dia de aniversario: ");
        c1.dia = input.nextInt();
        
        c1.data(c1.mes, c1.dia);
        
    }
}
