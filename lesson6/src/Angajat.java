public class Angajat {
    private long virsta = 35;
    private String nume = "Ion";
    Angajat ()
    {

    }
    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    long getVirsta (){
        return virsta;
    }

    void setVirsta (long argVirsta) {
        virsta = argVirsta;
    }
    void printeazaNume (){
        System.out.println(nume);
    }
    void printeazaVirstaSiNume (){
        System.out.println("Virsta = " + virsta + " Nume = " + nume);
    }


}
