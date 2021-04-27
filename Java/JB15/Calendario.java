public class Calendario
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    int mes;
    int dia;

    void data(int m, int d)
    {   
        if(m == 1){
            if(d > 0 && d <= 31){
                System.out.println("Data Válida!");
                System.out.println("Janeiro");
            }else{
                System.out.println("Dia Inválido!");
            }
        }else if(m == 2){
            if(d > 0 && d <= 29){ //29 pois o ano pode ser bisexto
                System.out.println("Data Válida!");
                System.out.println("Fevereiro");
            }else{
                System.out.println("Dia Inválido!");
            }
        }else if(m == 3){
            if(d > 0 && d <= 31){
                System.out.println("Data Válida!");
                System.out.println("Março");
            }else{
                System.out.println("Dia Inválido!");
            }
        }else if(m == 4){
            if(d > 0 && d <= 30){
                System.out.println("Data Válida!");
                System.out.println("Abril");
            }else{
                System.out.println("Dia Inválido!");
            }
        }else if(m == 5){
            if(d > 0 && d <= 31){
                System.out.println("Data Válida!");
                System.out.println("Maio");
            }else{
                System.out.println("Dia Inválido!");
            }
        }else if(m == 6){
            if(d > 0 && d <= 30){
                System.out.println("Data Válida!");
                System.out.println("Junho");
            }else{
                System.out.println("Dia Inválido!");
            }
        }else if(m == 7){
            if(d > 0 && d <= 31){
                System.out.println("Data Válida!");
                System.out.println("Julho");
            }else{
                System.out.println("Dia Inválido!");
            }
        }else if(m == 8){
            if(d > 0 && d <= 31){
                System.out.println("Data Válida!");
                System.out.println("Agosto");
            }else{
                System.out.println("Dia Inválido!");
            }
        }else if(m == 9){
            if(d > 0 && d <= 30){
                System.out.println("Data Válida!");
                System.out.println("Setembro");
            }else{
                System.out.println("Dia Inválido!");
            }
        }else if(m == 10){
            if(d > 0 && d <= 31){
                System.out.println("Data Válida!");
                System.out.println("Outubro");
            }else{
                System.out.println("Dia Inválido!");
            }
        }else if(m == 11){
            if(d > 0 && d <= 30){
                System.out.println("Data Válida!");
                System.out.println("Novembro");
            }else{
                System.out.println("Dia Inválido!");
            }
        }else if(m == 12){
            if(d > 0 && d <= 31){
                System.out.println("Data Válida!");
                System.out.println("Dezembro");
            }else{
                System.out.println("Dia Inválido!");
            }
        }else{
            System.out.println("Mês inválido!");   
        }
    }
}
