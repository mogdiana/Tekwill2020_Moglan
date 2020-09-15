package md.tekwill.service;

import md.tekwill.dao.PersoanaDao;
import md.tekwill.dao.PersoanaDaoImpl;
import md.tekwill.model.Persoana;

public class PersoanaServiceImpl implements PersoanaService {
    PersoanaDao persoanaDao = new PersoanaDaoImpl();
//    AdresaDao adresaDao = new AdresaDao();

    @Override
    public Persoana create(Persoana persoana) {
       return persoanaDao.create(persoana);
    }

    @Override
    public Persoana read(int id) {
        return persoanaDao.read(id);
    }

    @Override
    public Persoana[] readAll() {
        return persoanaDao.readAll();
    }

    @Override
    public boolean update(int id, String nume, String prenume) {
        return persoanaDao.update(id, nume, prenume);
    }

    @Override
    public boolean delete(int id) {
        return persoanaDao.delete(id);
    }

    @Override
    public void printeazaToatePersoanele(Object whereObject) {
        persoanaDao.printeazaToatePersoanele(whereObject);
    }
    
    @Override
    public void printeazaToatePersoanele() {
        persoanaDao.printeazaToatePersoanele();
    }
}
