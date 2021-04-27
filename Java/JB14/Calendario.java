public class Calendario
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    String mes;

    void numMes(String m)
    {   
        if(m.equalsIgnoreCase("Janeiro")){
            System.out.println("1");
        }else if(m.equals("Fevereiro")){
            System.out.println("2");
        }else if(m.equals("Março")){
            System.out.println("3");
        }else if(m.equals("Abril")){
            System.out.println("4");
        }else if(m.equals("Maio")){
            System.out.println("5");
        }else if(m.equals("Junho")){
            System.out.println("6");
        }else if(m.equals("Julho")){
            System.out.println("7");
        }else if(m.equals("Agosto")){
            System.out.println("8");
        }else if(m.equals("Setembro")){
            System.out.println("9");
        }else if(m.equals("Outubro")){
            System.out.println("10");
        }else if(m.equals("Novembro")){
            System.out.println("11");
        }else if(m.equals("Dezembro")){
            System.out.println("12");
        }else{
            System.out.println("Mês inválido!");   
        }
    }
}
