import java.util.ArrayList;
import java.util.Scanner;

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