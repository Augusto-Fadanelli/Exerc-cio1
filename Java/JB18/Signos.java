public class Signos
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    int mes;
    int dia;

    void data(int m, int d)
    {   
        System.out.print("Signo: ");
        if(m == 3 && d >=21 || m == 4 && d <= 20){ //Áries 21/3-20/4
                System.out.println("Áries");
        }else if(m == 4 && d >=21 || m == 5 && d <= 20){ //Touro 21/4-20/5
                System.out.println("Touro");
        }else if(m == 5 && d >=21 || m == 6 && d <= 20){ //Gêmeos 21/5-20/6
                System.out.println("Gêmeos");
        }else if(m == 6 && d >=21 || m == 7 && d <= 22){ //Câncer 21/6-22/7
                System.out.println("Câncer");
        }else if(m == 7 && d >=23 || m == 8 && d <= 22){ //Leão 23/7-22/8
                System.out.println("Leão");
        }else if(m == 8 && d >=23 || m == 9 && d <= 22){ //Virgem 23/8-22/9
                System.out.println("Virgem");
        }else if(m == 9 && d >=23 || m == 10 && d <= 22){ //Libra 23/9-22/10
                System.out.println("Libra");
        }else if(m == 10 && d >=23 || m == 11 && d <= 21){ //Escorpião 23/10-21/11
                System.out.println("Escorpião");
        }else if(m == 11 && d >=22 || m == 12 && d <= 21){ //Sagitário 22/11-21/12
                System.out.println("Sagitário");
        }else if(m == 12 && d >=22 || m == 1 && d <= 20){ //Capricórnio 22/12-20/1
                System.out.println("Capricórnio");
        }else if(m == 1 && d >=21 || m == 2 && d <= 18){ //Aquário 21/1-18/2
                System.out.println("Aquário!");
        }else if(m == 2 && d >=19 || m == 3 && d <= 20){ //Peixes 19/2-20/3
                System.out.println("Peixes");
        }else{
            System.out.println("ERRO NA CLASSE SIGNOS");
            System.exit(0);
        }
    }
}
