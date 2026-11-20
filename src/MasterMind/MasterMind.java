package MasterMind;

import java.util.Scanner;

public class MasterMind
{
    static void main(String[] args)
    {
        //er zijn 6 kleuren, iedere nummer staat voor een individuele kleur.
        Scanner input = new Scanner(System.in);
        int c1, c2, c3, c4;
        int zwartPinnen;
        int wittePinnen;
        int poging = 10;
        boolean gewonnen = false;

        c1 = (int) (Math.random() * 6) + 1;
        c2 = (int) (Math.random() * 6) + 1;
        c3 = (int) (Math.random() * 6) + 1;
        c4 = (int) (Math.random() * 6) + 1;
        int r1, r2, r3, r4;

        //Asks the user for the code and checks if the code is correct.
        while ((poging > 0) && (!gewonnen))
        {
            zwartPinnen = 0;
            wittePinnen = 0;
            System.out.println("geef de code gescheiden door spaties");
            r1 = input.nextInt();
            r2 = input.nextInt();
            r3 = input.nextInt();
            r4 = input.nextInt();

            System.out.println("" + r1 + r2 + r3 + r4);

            //Adds a black pin if a given color matches the same color and in the correct position.
            if (c1 == r1)
            {
                zwartPinnen++;
                //Adds a white pin if a given color is correct but is not in the correct position.
            } else if ((c1 == r2) || (c1 == r3) || (c1 == r4))
                wittePinnen++;

            if (c2 == r2)
            {
                zwartPinnen++;

            } else if ((c2 == r1) || (c2 == r3) || (c2 == r4))
                wittePinnen++;

            if (c3 == r3)
            {
                zwartPinnen++;

            } else if ((c3 == r1) || (c3 == r2) || (c3 == r4))
                wittePinnen++;

            if (c4 == r4)
            {
                zwartPinnen++;

            } else if ((c4 == r1) || (c4 == r2) || (c4 == r3))
                wittePinnen++;

            //removes an attempt to guess the color code.
            poging--;

            //checks if the given color code is correct then ends the game.
            if (c1 == r1 && c2 == r2 && c3 == r3 && c4 == r4)
            {
                System.out.println("Je hebt Master Mind gewonnen!");
                System.out.println("De code was: " + c1 + c2 + c3 + c4);
                gewonnen = true;
            }

            //checks if the user has used all their attempts to guess then ends the game.
            if (poging == 0)
            {
                System.out.println("Je hebt geen pogingen over! Je verloort Master Mind!");
                System.out.println("De code was: " + c1 + c2 + c3 + c4);
            }

            System.out.println("Je hebt " + zwartPinnen + " zwarte pinnen.");
            System.out.println("Je hebt " + wittePinnen + " witte pinnen.");
            System.out.println("Je hebt " + poging + " pogingen over.");
        }
    }
}