package md.tekwill.model;

public class Persoana {
    private int id;
    private String nume;
    private String preNume;
    Adresa adresa;
    private static int countId;

    @Override
    public String toString() {
        return "Persoana{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", preNume='" + preNume + '\'' +
                ", adresa=" + adresa +
                '}';
    }

    public Persoana(String nume, String preNume) {
        this.nume = nume;
        this.preNume = preNume;
        this.id = ++countId;
    }

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPreNume() {
        return preNume;
    }

    public void setPreNume(String preNume) {
        this.preNume = preNume;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

}
