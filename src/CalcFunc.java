
public class CalcFunc {

    // formel för räkna ut delningsdiameter på hjul
    static double kuggdelningsdia(int z, int m) { // z står för tandantal och m för Modul.
        double d;
        d = m * z;
        return d;
    }

    static double kuggremshjul(int z, int p) {
        double sum;
        sum = ((z * p) / Math.PI);
        return sum;
    }

    //Formel för att räkna ut Kuggmodul på kugghjul
    static double kuggmodul(double p) {
        double m;
        m = p / Math.PI;     //formel: Modul = Pitch(delning / PI,
        return m;
    }

    static double kilreml(double dd1, double dd2, double cc) {
        double utvremlangd;
        utvremlangd = ((dd1 + dd2) * 1.57) + (+cc + cc);
        return utvremlangd;
    }

    static double ccmatt(double a, double b, double l) {
        double res;
        res = (((a + b) * 1.57) - l);
        res = res / -2;
        return res;
    }

    static void sluttext() {

        System.out.format("****************************************************\n\n\t\tNiklas Danell - 2016\n\nEtt projekt i kursen Strukturerad Programmering\n\nF�r ej anv�ndas i kommersiellt syfte\n\n****************************************************");
    }


    static int parseWithDefault(String s, int def) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            // It's OK to ignore "e" here because returning a default value is the documented behaviour on invalid input.
            return def;
        }
    }

}
