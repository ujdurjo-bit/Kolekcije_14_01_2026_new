import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/*Napiši program za evidenciju polaznika na tečaju. Program treba omogućiti unos polaznika i njihovih podataka te pružiti osnovne
funkcije za upravljanje evidencijom.
Napravi klasu Polaznik koja ima sljedeće atribute:✓
Ime polaznika ✓
Prezime polaznika✓
E-mail adresa polaznika✓
Napravi glavnu klasu EvidencijaPolaznika koja sadrži main metodu.✓
Omogući korisniku unos novih polaznika (ime, prezime, e-mail).
Omogući ispis svih polaznika na tečaju.
Omogući pretraživanje polaznika po e-mail adresi.
Za rješavanje koristite klasu ArrayList  */


 /*public class EvidencijaPolaznika {
    public static void main(String[] args) {
        ArrayList<Polaznik> lista = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Unos polaznika");
            System.out.println("2. Ispis svih polaznika");
            System.out.println("3. Pretraga po emailu");
            System.out.println("4. Kraj");
            System.out.print("Izbor: ");

            int izbor = input.nextInt();
            input.nextLine();

            if (izbor == 1) {
                // Unos polaznika
                System.out.print("Ime: ");
                String ime = input.nextLine();
                System.out.print("Prezime: ");
                String prezime = input.nextLine();
                System.out.print("Email: ");
                String email = input.nextLine();

                lista.add(new Polaznik(ime, prezime, email));

            } else if (izbor == 2) {
                // Ispis svih polaznika
                for (Polaznik p : lista) {
                    System.out.println(p.ime + " " + p.prezime + " - " + p.email);
                }

            } else if (izbor == 3) {
                // Pretraga po emailu
                System.out.print("Unesi email: ");
                String trazeniEmail = input.nextLine();

                boolean nadjen = false;
                for (Polaznik p : lista) {
                    if (p.email.equals(trazeniEmail)) {
                        System.out.println("Pronađen: " + p.ime + " " + p.prezime);
                        nadjen = true;
                        break;
                    }
                }

                if (!nadjen) {
                    System.out.println("Nema polaznika s tim emailom.");
                }

            } else if (izbor == 4) {
                // Kraj
                break;
            }
        }

        input.close();
    }
}


 public class EvidencijaPolaznika {
    public static void main(String[] args) {
        ArrayList<Polaznik> lista = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Unos polaznika");
            System.out.println("2. Ispis svih polaznika");
            System.out.println("3. Pretraga po emailu");
            System.out.println("4. Kraj");
            System.out.print("Izbor: ");

            int izbor = input.nextInt();
            input.nextLine();

            switch (izbor) {
                case 1:
                    // Unos polaznika
                    System.out.print("Ime: ");
                    String ime = input.nextLine();
                    System.out.print("Prezime: ");
                    String prezime = input.nextLine();
                    System.out.print("Email: ");
                    String email = input.nextLine();

                    lista.add(new Polaznik(ime, prezime, email));
                    break;

                case 2:
                    // Ispis svih polaznika
                    for (Polaznik p : lista) {
                        System.out.println(p.ime + " " + p.prezime + " - " + p.email);
                    }
                    break;

                case 3:
                    // Pretraga po emailu
                    System.out.print("Unesi email: ");
                    String trazeniEmail = input.nextLine();

                    boolean nadjen = false;
                    for (Polaznik p : lista) {
                        if (p.email.equals(trazeniEmail)) {
                            System.out.println("Pronađen: " + p.ime + " " + p.prezime);
                            nadjen = true;
                            break;
                        }
                    }

                    if (!nadjen) {
                        System.out.println("Nema polaznika s tim emailom.");
                    }
                    break;

                case 4:
                    // Kraj
                    System.out.println("Program završen.");
                    input.close();
                    return;

                default:
                    System.out.println("Neispravan izbor!");
            }
        }
    }
}
*/

/*Napiši program za evidenciju polaznika na tečaju koji također provjerava i sprječava dodavanje duplikata polaznika na tečaj.
Program treba omogućiti unos polaznika i njihovih podataka te provjeriti jesu li polaznici jedinstveni na tečaju.

Koristi klasu Polaznik s atributima: ime, prezime i e-mail✓
Koristi klasu HashSet<Polaznik> za pohranu polaznika kako bi se osigurala jedinstvenost✓
Napravi glavnu klasu EvidencijaPolaznika koja sadrži main metodu✓
Omogući korisniku unos novih polaznika (ime, prezime, e-mail)✓
Pri dodavanju novog polaznika, provjeri je li polaznik već prisutan na tečaju (usporedba po e-mail adresi)✓
Ispisuj odgovarajuće poruke o uspješnom ili neuspješnom dodavanju polaznika na tečaj✓
Omogući ispis svih polaznika na tečaju nakon unosa✓

Što bi trebalo izmijeniti u rješenju ako dodamo novi zahtjev?
Svi polaznici moraju biti cijelo vrijeme sortirani po prezimenu uzlazno*/


public class EvidencijaPolaznika {
    // private static ArrayList<Polaznik> lista = new ArrayList<>();
    //private static HashSet<Polaznik> lista = new HashSet<Polaznik>();
    private static TreeSet<Polaznik> lista = new TreeSet<Polaznik>();



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        lista.add(new Polaznik("Ana", "Horvat", "ana@gmail.com"));
        lista.add(new Polaznik("Ivan", "Ivić", "ivan@gmail.com"));
        lista.add(new Polaznik("Marko", "Markić", "marko@gmail.com"));


        while (true) {
            System.out.println("\n1. Unos polaznika");
            System.out.println("2. Ispis svih polaznika");
            System.out.println("3. Pretraga po emailu");
            System.out.println("4. Kraj");
            System.out.print("Izbor: ");

            int izbor = input.nextInt();
            input.nextLine();

            switch (izbor) {
                case 1:
                    // Unos polaznika
                    System.out.print("Ime: ");
                    String ime = input.nextLine();
                    System.out.print("Prezime: ");
                    String prezime = input.nextLine();
                    System.out.print("Email: ");
                    String email = input.nextLine();

                    Polaznik noviPolaznik = new Polaznik(ime, prezime, email);

                    if (lista.contains(noviPolaznik)) {
                        System.out.println("Polaznik s emailom :" + email + " već postoji!");
                    } else {
                        lista.add(noviPolaznik);
                        System.out.println("Polaznik uspješno dodan!");
                    }
                    break;


                case 2:
                    // Ispis svih polaznika
                    for (Polaznik p : lista) {
                        System.out.println(p.ime + " " + p.prezime + " - " + p.email);
                    }
                    break;

                case 3:
                    // Pretraga po emailu
                    System.out.print("Unesi email: ");
                    String trazeniEmail = input.nextLine();

                    boolean nadjen = false;
                    for (Polaznik p : lista) {
                        if (p.email.equals(trazeniEmail)) {
                            System.out.println("Pronađen: " + p.ime + " " + p.prezime);
                            nadjen = true;
                            break;
                        }
                    }

                    if (!nadjen) {
                        System.out.println("Nema polaznika s tim emailom.");
                    }
                    break;

                case 4:
                    System.out.println("Program završen.");
                    input.close();
                    return;

                default:
                    System.out.println("Neispravan izbor!");
            }


        }
    }
}
