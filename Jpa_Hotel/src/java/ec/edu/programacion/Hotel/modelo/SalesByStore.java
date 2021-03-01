/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.programacion.dvd.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Luis
 */
@Entity
@Table(name = "sales_by_store")
@NamedQueries({
    @NamedQuery(name = "SalesByStore.findAll", query = "SELECT s FROM SalesByStore s")})
public class SalesByStore implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 2147483647)
    @Column(name = "store")
    private String store;
    @Size(max = 2147483647)
    @Column(name = "manager")
    private String manager;
    @Column(name = "total_sales")
    private BigInteger totalSales;

    public SalesByStore() {
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public BigInteger getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(BigInteger totalSales) {
        this.totalSales = totalSales;
    }
    
}
