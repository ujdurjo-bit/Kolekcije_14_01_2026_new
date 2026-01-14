import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Polaznik> listaPolaznika = new ArrayList<>();

        listaPolaznika.add(new Polaznik("Iva"));
        listaPolaznika.add(new Polaznik("Iva"));

        for (Polaznik polaznik : listaPolaznika) {
            System.out.println("Polaznik: " + polaznik.getIme());

        }
    }
}