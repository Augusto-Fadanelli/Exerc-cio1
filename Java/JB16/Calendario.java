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
                System.out.print("Janeiro");
                System.out.println(" - 1º Trimestre");
            }else{
                System.out.println("Dia Inválido!");
            }
        }else if(m == 2){
            if(d > 0 && d <= 29){ //29 pois o ano pode ser bisexto
                System.out.println("Data Válida!");
                System.out.print("Fevereiro");
                System.out.println(" - 1º Trimestre");
            }else{
                System.out.println("Dia Inválido!");
            }
        }else if(m == 3){
            if(d > 0 && d <= 31){
                System.out.println("Data Válida!");
                System.out.print("Março");
                System.out.println(" - 1º Trimestre");
            }else{
                System.out.println("Dia Inválido!");
            }
        }else if(m == 4){
            if(d > 0 && d <= 30){
                System.out.println("Data Válida!");
                System.out.print("Abril");
                System.out.println(" - 2º Trimestre");
            }else{
                System.out.println("Dia Inválido!");
            }
        }else if(m == 5){
            if(d > 0 && d <= 31){
                System.out.println("Data Válida!");
                System.out.print("Maio");
                System.out.println(" - 2º Trimestre");
            }else{
                System.out.println("Dia Inválido!");
            }
        }else if(m == 6){
            if(d > 0 && d <= 30){
                System.out.println("Data Válida!");
                System.out.print("Junho");
                System.out.println(" - 2º Trimestre");
            }else{
                System.out.println("Dia Inválido!");
            }
        }else if(m == 7){
            if(d > 0 && d <= 31){
                System.out.println("Data Válida!");
                System.out.print("Julho");
                System.out.println(" - 3º Trimestre");
            }else{
                System.out.println("Dia Inválido!");
            }
        }else if(m == 8){
            if(d > 0 && d <= 31){
                System.out.println("Data Válida!");
                System.out.print("Agosto");
                System.out.println(" - 3º Trimestre");
            }else{
                System.out.println("Dia Inválido!");
            }
        }else if(m == 9){
            if(d > 0 && d <= 30){
                System.out.println("Data Válida!");
                System.out.print("Setembro");
                System.out.println(" - 3º Trimestre");
            }else{
                System.out.println("Dia Inválido!");
            }
        }else if(m == 10){
            if(d > 0 && d <= 31){
                System.out.println("Data Válida!");
                System.out.print("Outubro");
                System.out.println(" - 4º Trimestre");
            }else{
                System.out.println("Dia Inválido!");
            }
        }else if(m == 11){
            if(d > 0 && d <= 30){
                System.out.println("Data Válida!");
                System.out.print("Novembro");
                System.out.println(" - 4º Trimestre");
            }else{
                System.out.println("Dia Inválido!");
            }
        }else if(m == 12){
            if(d > 0 && d <= 31){
                System.out.println("Data Válida!");
                System.out.print("Dezembro");
                System.out.println(" - 4º Trimestre");
            }else{
                System.out.println("Dia Inválido!");
            }
        }else{
            System.out.println("Mês inválido!");   
        }
    }
}
