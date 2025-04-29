import Knihovna.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {




        ArrayList<Publikace> publikace = new ArrayList<>();

        for (int r = 0; r < 5; r--) {
            System.out.println("1 - Přidat publikaci");
            System.out.println("2 - Výpisy");

            int a = sc.nextInt();
            sc.nextLine();
            switch (a) {
                case 1:
                    System.out.println("1 - Román");
                    System.out.println("2 - Učebnice");
                    int b = sc.nextInt();
                    sc.nextLine();
                    switch (b) {
                        case 1:
                            System.out.println("Kolik románů chceš zadat?");
                            int c = sc.nextInt();
                            sc.nextLine();
                            for (int i = 0; i < c; i++) {
                                Roman roman = new Roman();
                                publikace.add(roman);
                            }
                            publikace.forEach(publik -> {
                                publik.vypisInfo();
                            });
                            break;
                        case 2:
                            System.out.println("Kolik učebnic chceš zadat?");
                            int d = sc.nextInt();
                            sc.nextLine();
                            for (int i = 0; i < d; i++) {
                                Ucebnice ucebnice = new Ucebnice();
                                publikace.add(ucebnice);
                            }
                            publikace.forEach(publik -> {
                                publik.vypisInfo();
                            });

                            break;

                    }

                    break;
                case 2:
                    System.out.println("1 - Nejstarší učebnici");
                    System.out.println("2 - Celkový počet stránek");
                    System.out.println("3 - Jména autorů matematických učebnic");
                    System.out.println("4 - Jméno autora nejdelšího románu");
                    System.out.println("5 - Vyskytuje se mezi romány fantazy?");
                    int g = sc.nextInt();
                    sc.nextLine();
                    switch (g) {
                        case 1:

                            break;
                        case 2:
                            int pocetStran = 0;
                            for (Publikace publik : publikace) {
                                if (publik.getClass()== Roman.class) {
                                    pocetStran = pocetStran + publik.getPocetStranek();
                                }
                            }
                            System.out.println("Celkový počet stran: " + pocetStran);
                            break;
                        case 3:
                            for (Publikace publik : publikace) {
                                if (publik.getClass()== Ucebnice.class) {
                                    if (((Ucebnice) publik).getPredmet().equals("matematika")){
                                        System.out.println("Jméno autora matematické učebnice: "+publik.getAutor());
                                    }
                                }
                            }
                            break;
                        case 4:
                            break;
                        case 5:
                            for (Publikace publik : publikace) {

                            }
                            break;
                    }



                    break;


                default:
                    System.err.println("Špatně");
                    break;
            }
        }


    }
}
