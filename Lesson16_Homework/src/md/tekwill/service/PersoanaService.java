/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md.tekwill.service;

import md.tekwill.model.Persoana;

/**
 *
 * @author User
 */
public interface PersoanaService {
   public Persoana create(Persoana persoana);

    public Persoana read(int id);

    public Persoana[] readAll();

    public boolean update(int id, String nume, String prenume);

    public boolean delete(int id);

    public void printeazaToatePersoanele(Object whereObject);
    
    public void printeazaToatePersoanele();
}
