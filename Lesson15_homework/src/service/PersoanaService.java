package service;

import dao.PersoanaDao;
import model.Persoana;

public class PersoanaService {
    PersoanaDao persoanaDao = new PersoanaDao();
//    AdresaDao adresaDao = new AdresaDao();

    public void create(Persoana persoana) {
        persoanaDao.create(persoana);
    }

    public Persoana read(int id) {
        return persoanaDao.read(id);
    }

    public Persoana[] readAll() {
        return persoanaDao.readAll();
    }

    public boolean update(int id) {
        return persoanaDao.update(id);
    }

    public void delete(int id) {
        persoanaDao.delete(id);
    }

    public void printeazaToatePersoanele() {
        persoanaDao.printeazaToatePersoanele();
    }
}
