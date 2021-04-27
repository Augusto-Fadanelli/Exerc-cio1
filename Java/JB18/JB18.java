/*Verifique a validade de uma data de aniversário (solicite apenas o número do
 * dia e do mês). Além de falar se a data está ok, informe também o nome do mês.*/

/*Acrescente no exercício anterior se a pessoa nasceu no 1º, 2º, 3º ou 4º trimestre.*/

/* Acrescente no exercício anterior a apresentação do signo do horóscopo da 
 * pessoa. */

/* Inclua no exercício anterior a solicitação do ano de nascimento e também da 
 * data de hoje. A partir destas informações, apresente a idade atual desta 
 * pessoa. */
 
 import java.util.Scanner;

public class JB18
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Calendario c1 = new Calendario();
        Signos s1 = new Signos();
        
        System.out.print("Insira o número referente ao ano de nascimento: ");
        c1.ano_nasc = input.nextInt();
        System.out.print("Insira o numero referente ao mês de nascimento: ");
        c1.mes_nasc = input.nextInt();
        System.out.print("Insira o numero referente ao dia de nascimento: ");
        c1.dia_nasc = input.nextInt();
        
        c1.verificar(c1.mes_nasc, c1.dia_nasc); //verifica se há algum erro na data informada
        
        System.out.print("Insira o número referente ao ano atual: ");
        c1.ano_atual = input.nextInt();
        System.out.print("Insira o numero referente ao mês atual: ");
        c1.mes_atual = input.nextInt();
        System.out.print("Insira o numero referente ao dia atual: ");
        c1.dia_atual = input.nextInt();
        
        c1.verificar(c1.mes_atual, c1.dia_atual); //verifica se há algum erro na data informada
        
        s1.mes = c1.mes_nasc;
        s1.dia = c1.dia_nasc;        
        
        c1.data(c1.mes_nasc, c1.dia_nasc);
        s1.data(s1.mes, s1.dia);
        c1.idade(c1.ano_nasc, c1.mes_nasc, c1.dia_nasc, c1.ano_atual, c1.mes_atual, c1.dia_atual);
        
        System.out.println("Datas Válidas!");
    }
}

