import java.util.Objects;

public class Polaznik implements Comparable<Polaznik> {

    String ime;
    String prezime;
    String email;

    public Polaznik(String ime, String prezime, String email) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
    }

    public int compareTo(Polaznik sljedeci) {

        int rezultat = this.prezime.compareTo(sljedeci.prezime);

        if (rezultat == 0) {
            rezultat = this.ime.compareTo(sljedeci.ime);
        }

        if (rezultat == 0) {
            rezultat = this.email.compareTo(sljedeci.email);
        }

        return rezultat;
    }








    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Polaznik{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Polaznik polaznik = (Polaznik) o;
        return email.equals(polaznik.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }


}

