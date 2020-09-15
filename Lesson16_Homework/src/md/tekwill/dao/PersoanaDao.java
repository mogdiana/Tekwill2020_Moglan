package md.tekwill.dao;

import md.tekwill.model.Persoana;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PersoanaDao {

    public Persoana[] listPersoane = new Persoana[10];
    private int count = 0;

    public Persoana create(Persoana persoana) {
        //logica de adaugare a persoanei in array
        if (count < listPersoane.length) {
            listPersoane[count++] = persoana;
            return persoana;
        }
        return null;
    }

    public Persoana read(int id) {
        //logica de gasire a persoanei cu id de la argument in array
        for (int i = 0; i < count; i++) {
            if (listPersoane[i].getId() == id) {
                return listPersoane[i];
            }
        }
        return null;
    }

    public Persoana[] readAll() {
        //logica de returnare a tuturor persoanelor din array
        //return listPersoane;
        Persoana[] persoaneExistente = new Persoana[count];
        for (int i = 0; i < count; i++) {
            persoaneExistente[i] = listPersoane[i];
        }
        return persoaneExistente;
    }

    public boolean update(int id, String nume, String prenume) {
        // 1. cautare dupa id
        Persoana p = this.read(id);
        // 2. persoanei hasite i se updateaza datele
        if (p != null) {
            p.setNume(nume);
            p.setPreNume(prenume);
            return true;
        } // 3. persoana cu noile date se salveaza inapoi in array
        else {
            return false;
        }
    }

    public boolean delete(int id) {
        // 1. cautare dupa id
        // 2. persoana gasita se sterge din array
        int k = 0;
        while ((k < count) && (listPersoane[k].getId() != id)) {
            k++;
        }
        if (k < count) {
            for (int j = k; j < count - 1; j++) {
                listPersoane[j] = listPersoane[j + 1];
            }
            listPersoane[--count] = null;
            return true;
        }
        else return false;
    }

    public void printeazaToatePersoanele(Object whereObject) {
        // printati toate datele din array
        //System.out.println(listPersoane.length);
        if (whereObject instanceof JTable) {
            JTable jTable = (JTable) whereObject;
            DefaultTableModel model = (DefaultTableModel) jTable.getModel();
            model.setRowCount(0);
            for (int i = 0; i < count; i++) {
                //System.out.println(listPersoane[i]);

                model.addRow(new Object[]{listPersoane[i].getId(), listPersoane[i].getNume(), listPersoane[i].getPreNume()});
            }
        }
//        System.out.println();
    }

}
