// Acessar: https://tinyurl.com/aula29-04

package sobrescrita;

public class EsporteRadical {
    public void manobras() {
        System.out.println("Adrenalina a mil...");
    }
}
// "Extends" denota heranca.
class Skate extends EsporteRadical {
    @Override
    public void manobras() {
        System.out.println("Ollie, Kickflip, Manual");
    }
}

class Surf extends EsporteRadical {
    @Override
    public void manobras() {
        System.out.println("Tubo, Rasgada, Duckdive, Layback");
    }
}

class Patinete extends EsporteRadical {
    @Override
    public void manobras() {
        System.out.println("Pulo, 360");
    }
}

class main {
    public static void main(String[] args) {
        EsporteRadical er = new EsporteRadical();
        Skate s = new Skate();
        Patinete p = new Patinete();
        Surf su = new Surf();

        er.manobras();
        s.manobras();
        p.manobras();
        su.manobras();
    }
}