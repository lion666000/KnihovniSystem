package Knihovna;

import java.util.ArrayList;
import java.util.Scanner;

public class Publikace {
    public String nazev;
    public String autor;
    public int rokVydani;
    public int ISBN;
    public int pocetStranek;

    static Scanner sc = new Scanner(System.in);
    public Publikace() {
        System.out.println("Název: ");
        this.nazev = sc.nextLine();
        System.out.println("Autor: ");
        this.autor = sc.nextLine();
        System.out.println("Rok vydání: ");
        this.rokVydani = sc.nextInt();
        sc.nextLine();
        System.out.println("ISBN: ");
        this.ISBN = sc.nextInt();
        sc.nextLine();
        System.out.println("Počet stránek: ");
        this.pocetStranek = sc.nextInt();
        sc.nextLine();


    }

    public void vypisInfo(){
        System.out.println("Nazev: " + nazev+", Autor: " + autor+", Rok vydání: "+rokVydani+", ISBN: "+ISBN+", Počet stránek: "+pocetStranek);
    }

    public String getNazev() {
        return nazev;
    }

    public String getAutor() {
        return autor;
    }

    public int getRokVydani() {
        return rokVydani;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getPocetStranek() {
        return pocetStranek;
    }


}
