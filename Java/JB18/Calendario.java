public class Calendario
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    int mes_nasc;
    int dia_nasc;
    int ano_nasc;
    
    int mes_atual;
    int dia_atual;
    int ano_atual;
    

    void data(int m, int d)
    {   
        if(m == 1){
                System.out.print("Janeiro");
                System.out.println(" - 1º Trimestre");
        }else if(m == 2){
                System.out.print("Fevereiro");
                System.out.println(" - 1º Trimestre");
        }else if(m == 3){
                System.out.print("Março");
                System.out.println(" - 1º Trimestre");
        }else if(m == 4){
                System.out.print("Abril");
                System.out.println(" - 2º Trimestre");
        }else if(m == 5){
                System.out.print("Maio");
                System.out.println(" - 2º Trimestre");
        }else if(m == 6){
                System.out.print("Junho");
                System.out.println(" - 2º Trimestre");
        }else if(m == 7){
                System.out.print("Julho");
                System.out.println(" - 3º Trimestre");
        }else if(m == 8){
                System.out.print("Agosto");
                System.out.println(" - 3º Trimestre");
        }else if(m == 9){
                System.out.print("Setembro");
                System.out.println(" - 3º Trimestre");
        }else if(m == 10){
                System.out.print("Outubro");
                System.out.println(" - 4º Trimestre");
        }else if(m == 11){
                System.out.print("Novembro");
                System.out.println(" - 4º Trimestre");
        }else{
                System.out.print("Dezembro");
                System.out.println(" - 4º Trimestre");
        }
        
    }
    
    void idade(int anoN, int mesN, int diaN, int anoA, int mesA, int diaA){
        int age;
        
        if(anoN > anoA || anoN == anoA && mesN > mesA || anoN == anoA && mesN == mesA && diaN > diaA){ //Se a data de nascimento for superior a data atual
            System.out.println("Data de Nascimento ou Atual Inválida!");
            System.exit(0);
        }else{
            age = anoA - anoN;
            if(mesN > mesA || mesN == mesA && diaN > diaA){
                age -= 1;   
            }
            System.out.println("Idade: " + age);
        }
    }
    
    void verificar(int m, int d)
    {   
        if(m == 1){
            if(d < 1 || d > 31){
                System.out.println("Dia Inválido!");
                System.exit(0);
            }
        }else if(m == 2){
            if(d < 1 || d > 29){ //29 pois o ano pode ser bisexto
                System.out.println("Dia Inválido!");
                System.exit(0);
            }
        }else if(m == 3){
            if(d < 1 || d > 31){
                System.out.println("Dia Inválido!");
                System.exit(0);
            }
        }else if(m == 4){
            if(d < 1 || d > 30){
                System.out.println("Dia Inválido!");
                System.exit(0);
            }
        }else if(m == 5){
            if(d < 1 || d > 31){
                System.out.println("Dia Inválido!");
                System.exit(0);
            }
        }else if(m == 6){
            if(d < 1 || d > 30){
                System.out.println("Dia Inválido!");
                System.exit(0);
            }
        }else if(m == 7){
            if(d < 1 || d > 31){
                System.out.println("Dia Inválido!");
                System.exit(0);
            }
        }else if(m == 8){
            if(d < 1 || d > 31){
                System.out.println("Dia Inválido!");
                System.exit(0);
            }
        }else if(m == 9){
            if(d < 1 || d > 30){
                System.out.println("Dia Inválido!");
                System.exit(0);
            }
        }else if(m == 10){
            if(d < 1 || d > 31){
                System.out.println("Dia Inválido!");
                System.exit(0);
            }
        }else if(m == 11){
            if(d < 1 || d > 30){
                System.out.println("Dia Inválido!");
                System.exit(0);
            }
        }else if(m == 12){
            if(d < 1 || d > 31){
                System.out.println("Dia Inválido!");
                System.exit(0);
            }
        }else{
            System.out.println("Mês inválido!"); 
            System.exit(0);
        }
    }
}
