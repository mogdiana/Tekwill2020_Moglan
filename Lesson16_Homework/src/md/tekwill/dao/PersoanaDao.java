/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md.tekwill.dao;
import md.tekwill.model.Persoana;

/**
 *
 * @author User
 */
public interface PersoanaDao {
    public Persoana create(Persoana persoana);

    public Persoana read(int id);

    public Persoana[] readAll();

    public boolean update(int id, String nume, String prenume);

    public boolean delete(int id);

    public void printeazaToatePersoanele();

    public void printeazaToatePersoanele(Object whereObject);

    
}
