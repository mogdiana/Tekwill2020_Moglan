package dao;

import model.Persoana;

public class PersoanaDao {
    public Persoana[] listPersoane = new Persoana[20];
    private int count = 0;

    public void create(Persoana persoana) {
        //logica de adaugare a persoanei in array
        listPersoane[count++] = persoana;
    }

    public Persoana read(int id) {
        //logica de gasire a persoanei cu id de la argument in array
        for (int i = 0; i < count; i++) {
            if (listPersoane[i].getId() == id)
                return listPersoane[i];
        }
        return null;
    }

    public Persoana[] readAll() {
        //logica de returnare a tuturor persoanelor din array
        return listPersoane;
    }

    public boolean update(int id) {
        // 1. cautare dupa id
        Persoana p = this.read(id);
        // 2. persoanei hasite i se updateaza datele
        if (p != null) {
            p.setNume(p.getNume() + "111");
            return true;
        }
        // 3. persoana cu noile date se salveaza inapoi in array
        else
            return false;
    }

    public void delete(int id) {
        // 1. cautare dupa id
        // 2. persoana gasita se sterge din array
        int k = 0;
        while ((k < count) && (listPersoane[k].getId() != id)) {
            k++;
        }
        if (k < count) {
            for (int j = k; j < count-1; j++){
                listPersoane[j] = listPersoane[j+1];
            }
            listPersoane[--count] = null;
        }
    }

    public void printeazaToatePersoanele() {
        // printati toate datele din array
        for (int i = 0; i < count; i++) {
            System.out.println(listPersoane[i].toString());
        }
//        System.out.println();
    }

}
