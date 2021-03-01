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
@Table(name = "sales_by_film_category")
@NamedQueries({
    @NamedQuery(name = "SalesByFilmCategory.findAll", query = "SELECT s FROM SalesByFilmCategory s")})
public class SalesByFilmCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 25)
    @Column(name = "category")
    private String category;
    @Column(name = "total_sales")
    private BigInteger totalSales;

    public SalesByFilmCategory() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigInteger getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(BigInteger totalSales) {
        this.totalSales = totalSales;
    }
    
}
