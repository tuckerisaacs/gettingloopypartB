import java.util.Scanner;

public class main
{
    public static void main(String[] args)




    {
        Scanner in = new Scanner(System.in);
        String trash = " ";
        boolean done=(false);
        while(done=false) {
            System.out.println("enter the outside temp in celcius: ");
            if (in.hasNextDouble()) {
                double celcius = in.nextDouble();

                double fahrenheight = ((celcius * 9) / 5) + 32;

                System.out.println("the outside temp in fahrenheight is " + fahrenheight);
                 done =(true);
            }
            else {
                trash = in.nextLine();
                System.out.println("enter a valid number");
            }
            }
        }


    }

