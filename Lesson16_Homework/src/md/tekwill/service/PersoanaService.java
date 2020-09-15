package md.tekwill.service;

import md.tekwill.dao.PersoanaDao;
import md.tekwill.model.Persoana;

public class PersoanaService {
    PersoanaDao persoanaDao = new PersoanaDao();
//    AdresaDao adresaDao = new AdresaDao();

    public Persoana create(Persoana persoana) {
       return persoanaDao.create(persoana);
    }

    public Persoana read(int id) {
        return persoanaDao.read(id);
    }

    public Persoana[] readAll() {
        return persoanaDao.readAll();
    }

    public boolean update(int id, String nume, String prenume) {
        return persoanaDao.update(id, nume, prenume);
    }

    public boolean delete(int id) {
        return persoanaDao.delete(id);
    }

    public void printeazaToatePersoanele(Object whereObject) {
        persoanaDao.printeazaToatePersoanele(whereObject);
    }
}
