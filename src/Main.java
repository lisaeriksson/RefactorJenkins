import javax.swing.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Program program = new Program();

        JOptionPane.showMessageDialog(null, "\n\tVälkommen till Transmissionsberäknaren!\n\n");
        while (true) {
            int val = 0; //Initeras till 0, för att nollstollas efter varje avslutat "varv".
            String valStr = JOptionPane.showInputDialog(null, "Välj vad du vill räkna på \n(1.) Kugghjulsdrifter\n(2.) Remdrifter\n(3.) Avsluta\n Skriv siffran för ditt val:");
            val = CalcFunc.parseWithDefault(valStr, 77);
            program.cancelOrExit(valStr);        //Om användaren trycker cancel eller exit
            if (val == 1) {                      // Om valet är Kugghjulsdrifter
                Program.kugghjulsdrift();
            } else if (val == 2) {                // Om valet är Kuggremsdrifter
                Program.kuggremsdrift();
            } else if (val == 3) {                 // Om användaren vill avsluta
                CalcFunc.sluttext();            //anrop funktion "sluttext". Hämtar sluttext från fil.
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Felaktigt värde, försök igen");
            }
        }
    }
}
