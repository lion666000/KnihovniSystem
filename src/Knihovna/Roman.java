package Knihovna;

import java.util.Scanner;

public class Roman extends Publikace {
    private String zanr;


    static Scanner sc = new Scanner(System.in);
    public Roman() {
        super();

        System.out.println("Žánr: ");
        this.zanr = sc.nextLine();

    }

    public String getZanr() {
        return zanr;
    }

    @Override
    public void vypisInfo(){
        System.out.println("Nazev: " + super.getNazev()+", Autor: " + super.getAutor()+", Rok vydání: "+super.getRokVydani()+", ISBN: "+super.getISBN()+", Počet stránek: "+super.getPocetStranek()+", Žánr: "+getZanr());
    }


}
