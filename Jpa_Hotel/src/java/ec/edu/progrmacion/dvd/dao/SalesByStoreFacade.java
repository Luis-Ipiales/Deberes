/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.progrmacion.dvd.dao;

import ec.edu.programacion.dvd.modelo.SalesByStore;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Luis
 */
@Stateless
public class SalesByStoreFacade extends AbstractFacade<SalesByStore> {

    @PersistenceContext(unitName = "Jpa_Ejemplo1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SalesByStoreFacade() {
        super(SalesByStore.class);
    }
    
}
