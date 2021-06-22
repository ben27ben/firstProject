import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_calculation {

    public static void main(String[] args) {

        USD Dollar = new USD();
        ILS Shekel = new ILS();
        double amountVal = 0.0D;
        double calculateVal = 0.0D;
        ArrayList<Double> CollectData = new ArrayList();


        boolean var8;
        Introduction();
        for (String exit = "N"; exit == "N"; var8 = true) {
            Scanner Userinput = new Scanner(System.in);
            //int User = Userinput.nextInt();

            double userChoice = 0;
            try {
                userChoice = Userinput.nextDouble();
            } catch (InputMismatchException var18) {
                System.out.println("Invalid choice..");
            }

            if (userChoice == 1.0) {
                System.out.println("Please enter an amount to convert");
                new Scanner(System.in);
                //Userinput = new Scanner(System.in);

                try {
                    amountVal = Userinput.nextDouble();
                } catch (Exception var17) {
                    System.out.println("Invalid choice..");
                    continue;
                }

                calculateVal = amountVal * Dollar.getValue();
                CollectData.add(calculateVal);
            }

            if (userChoice == 2.0) {
                System.out.println("Please enter an amount to convert ");

                try {
                    amountVal = Userinput.nextDouble();
                } catch (Exception var16) {
                    System.out.println("Invalid choice..");
                }

                calculateVal = amountVal * Shekel.getvalue();
                CollectData.add(calculateVal);
            }

            System.out.println("the calculated value is");
            System.out.println(calculateVal);
            System.out.println(" start over Y / N");
            Scanner userStartOver = new Scanner(System.in);
            String UserChoice = userStartOver.next();
            if (UserChoice.equals("Y") || UserChoice.equals("y")) {
                Introduction();
            } else if (UserChoice.equals("N") || UserChoice.equals("n")){
                System.out.println("Thanks for using our currency converter ");

                for (int i = 0; i < CollectData.size(); ++i) {
                    System.out.println(CollectData.get(i));
                }
                System.exit(0);
            }

        }

    }
    //Function for entering the app//
    private static void Introduction() {
        System.out.println("Welcome to currency converter");
        System.out.println("Please choose an option (1/2):");
        System.out.println("1. Dollars to Shekels");
        System.out.println("2. Shekels to Dollars");
    }
}

