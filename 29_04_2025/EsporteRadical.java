class EsporteRadical {
    pulic void manobras(Skate){
        System.out.println("Manobra de Skate: " + manobra)
    }
    public void manobras(Surf) {

    }
    public void manobras(Patinete){

    }
}

class Skate {
    private String manobra;

    public Skate(String manobra) {
        this.manobra = manobra;
    }
}

class Surf {
    private String manobra;

    public Surf(String manobra) {
        this.manobra = manobra;
    }
}

class Patinete {
    private String manobra;

    public Patinete(String manobra) {
        this.manobra = manobra;
    }
}