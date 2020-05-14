import java.util.Scanner;

public class SimpleCalculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Scanner string = new Scanner(System.in);
        Menu myMenu = new Menu();
        Operations myOperations = new Operations();
        
        boolean flag = false;
        do{
        
            myMenu.displayMenu();
            int op = input.nextInt();
        
            myMenu.displayValues(false);
            double number1 = input.nextDouble();
            myMenu.displayValues(true);
            double number2 = input.nextDouble();
        
            double result = myOperations.getValues(op, number1, number2);
            myMenu.displayResult(result);
        
            myMenu.displayQuit();
            //char quit = string.next();
        
            /*if(quit == 's' || quit == 'S' || quit == 'y' || quit == 'Y'){
                flag = true;
            }*/
        }while(flag == true); //mudar para false
    
    }
}
