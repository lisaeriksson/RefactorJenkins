import javax.swing.*;

public class Program {
    public static boolean fortsatt = false;

    public static void kugghjulsdrift() {
        int val2 = 0; //Initeras till 0, för att nollstollas efter varje avslutat "varv".
        String val2Str = "";

        do {
            try {
                val2Str = JOptionPane.showInputDialog("\tKugghjulsdrift \nVälj vad du vill räkna ut:\n " + "1. Räkna ut Delningsdiameter på hjul. \n 2.Räkna ut Modul \n");
                Program.cancelOrExit(val2Str);
                val2 = Integer.parseInt(val2Str);
                if (val2 == 1 || val2 == 2) {
                    fortsatt = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Felaktigt värde, ange värde 1 eller 2");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Felaktigt värde, ange värde 1 eller 2");
                fortsatt = false;
            }
        } while (fortsatt == false);

        if (val2 == 1) {
            int tandAntal, modul;
            do {
                try {
                    String valAStr = JOptionPane.showInputDialog("Räkna delningsdiameter för kugghjul\n" + "Ange tandantalet: \n");
                    Program.cancelOrExit(valAStr);
                    tandAntal = Integer.parseInt(valAStr);
                    forHogtEllerLagt(tandAntal);
                    String valBStr = JOptionPane.showInputDialog("Räkna delningsdiameter för kugghjul \n Ange Modulen: ");
                    Program.cancelOrExit(valBStr);
                    modul = Integer.parseInt(valBStr);
                    forHogtEllerLagt(modul);
                    JOptionPane.showMessageDialog(null, "Delningsdiameter på kugghjul:" + CalcFunc.kuggdelningsdia(tandAntal, modul));
                    fortsatt = true;

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Felaktigt värde, skriv in en siffra");
                    fortsatt = false;
                }
            } while (fortsatt == false);
        }

        if (val2 == 2) {
            int a = 1;
            do {
                try {
                    String valAStr = JOptionPane.showInputDialog("Skriv in c/c-mått, mellan tandtopp-tandtopp(mm): ");
                    Program.cancelOrExit(valAStr);
                    a = Integer.parseInt(valAStr);
                    forHogtEllerLagt(a);
                    JOptionPane.showMessageDialog(null, "\nFöreslagen Modul:" + CalcFunc.kuggmodul(a));
                    fortsatt = true;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Felaktigt värde, skriv in en siffra");
                    fortsatt = false;
                }
            } while (fortsatt == false);
        }
    }

    public static void kuggremsdrift() {
        int val3 = 0;
        do {
            try {
                String val3Str = JOptionPane.showInputDialog("Välj vad du vill räkna på\n  1.Räkna ut Delningsdiameter på kuggremshjul.\n 2. Räkna på remlängd eller c/c-mått i kilremsdrifter.\n");
                Program.cancelOrExit(val3Str);
                val3 = Integer.parseInt(val3Str);
                forHogtEllerLagt(val3);
                if (val3 == 1 || val3 == 2) {
                    fortsatt = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Felaktigt värde, ange värde 1 eller 2");
                    fortsatt = false;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Felaktigt värde, ange värde 1 eller 2");
                fortsatt = false;
            }
        } while (fortsatt == false);


        if (val3 == 1) {
            int a = 1, b = 1;
            do {
                try {
                    String valAStr = JOptionPane.showInputDialog("Delningsdiameter Kuggremshjul\n Ange tandantalet:");
                    Program.cancelOrExit(valAStr);
                    a = Integer.parseInt(valAStr);
                    forHogtEllerLagt(a);
                    String valBStr = JOptionPane.showInputDialog("Ange delning på rem (mm) \n Ex HTD 8M = 8 mm, T10 = 10 mm, AT20 = 20 mm\nAnge delning:");
                    Program.cancelOrExit(valBStr);
                    b = Integer.parseInt(valBStr);
                    forHogtEllerLagt(b);
                    JOptionPane.showMessageDialog(null, "\nDelningsdiameter på kuggremshjul:" + CalcFunc.kuggremshjul(a, b));
                    fortsatt = true;

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Felaktigt värde, skriv in en siffra");
                    fortsatt = false;
                }
            } while (fortsatt == false);
        }
        if (val3 == 2) {
            int delningsDiameter1 = 1, delningsdiameter2 = 1, cc = 1, remLangd = 1, z = 1;
            do {
                try {
                    String valDD1Str = JOptionPane.showInputDialog("Remlängd eller C/C-mått\n" +
                            "Ange Delningsdiameter för hjul 1: ");
                    Program.cancelOrExit(valDD1Str);
                    delningsDiameter1 = Integer.parseInt(valDD1Str);
                    forHogtEllerLagt(delningsDiameter1);

                    String valDD2Str = JOptionPane.showInputDialog("Ange Delningsdiameter för hjul 2: ");
                    Program.cancelOrExit(valDD2Str);
                    delningsdiameter2 = Integer.parseInt(valDD2Str);
                    forHogtEllerLagt(delningsdiameter2);
                    String valCCStr = JOptionPane.showInputDialog("Ange C/C-mått mellan axlarna*: \n(*Ange 0 om du vill ta reda på C/C-måttet):");
                    Program.cancelOrExit(valCCStr);
                    cc = Integer.parseInt(valCCStr);
                    forHogtEllerLagt(cc);
                    fortsatt = true;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Felaktigt värde, skriv in en siffra");
                    fortsatt = false;
                }
            } while (fortsatt == false);

            if (cc == 0) {
                try {
                    String valLStr = JOptionPane.showInputDialog("Ange längden på din rem(mm): ");
                    Program.cancelOrExit(valLStr);
                    remLangd = Integer.parseInt(valLStr);
                    forHogtEllerLagt(remLangd);
                    JOptionPane.showMessageDialog(null, "\nDitt C/C blir ca:" + CalcFunc.ccmatt(delningsDiameter1, delningsdiameter2, remLangd));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Felaktigt värde, skriv in ett siffra");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Teoretiska langden (utvandig langd) for din kilrem:" + CalcFunc.kilreml(delningsDiameter1, delningsdiameter2, cc));
            }
        }

    }
    public static boolean forHogtEllerLagt(int tal){
        if(tal < 0 || tal > 32.767){
            JOptionPane.showMessageDialog(null, "Felaktigt värde, försök igen");

            fortsatt = false;
        }
        return fortsatt;
    }

    public static void cancelOrExit(String val) {
        if (val == null) {
            System.exit(0);
        }

    }
}
