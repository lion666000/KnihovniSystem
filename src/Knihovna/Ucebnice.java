package Knihovna;

public class Ucebnice extends Publikace {
    private String predmet;

    public Ucebnice() {
        super();

        System.out.println("Předmět: ");
        this.predmet = sc.nextLine();
    }

    public String getPredmet() {
        return predmet;
    }

    @Override
    public void vypisInfo(){
        System.out.println("Nazev: " + super.getNazev()+", Autor: " + super.getAutor()+", Rok vydání: "+super.getRokVydani()+", ISBN: "+super.getISBN()+", Počet stránek: "+super.getPocetStranek()+", Předmět: "+getPredmet() );
    }
}



