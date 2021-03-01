/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.programacion.dvd.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Luis
 */
@Entity
@Table(name = "film")
@NamedQueries({
    @NamedQuery(name = "Film.findAll", query = "SELECT f FROM Film f")})
public class Film implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "film_id")
    private Integer filmId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "title")
    private String title;
    @Size(max = 2147483647)
    @Column(name = "description")
    private String description;
    @Column(name = "release_year")
    private Integer releaseYear;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rental_duration")
    private short rentalDuration;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "rental_rate")
    private BigDecimal rentalRate;
    @Column(name = "length")
    private Short length;
    @Basic(optional = false)
    @NotNull
    @Column(name = "replacement_cost")
    private BigDecimal replacementCost;
    @Size(max = 2147483647)
    @Column(name = "rating")
    private String rating;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;
    @Column(name = "special_features")
    private Serializable specialFeatures;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "fulltext")
    private Object fulltext;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "film", fetch = FetchType.LAZY)
    private List<FilmCategory> filmCategoryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "film", fetch = FetchType.LAZY)
    private List<FilmActor> filmActorList;
    @JoinColumn(name = "language_id", referencedColumnName = "language_id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Language languageId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "filmId", fetch = FetchType.LAZY)
    private List<Inventory> inventoryList;

    public Film() {
    }

    public Film(Integer filmId) {
        this.filmId = filmId;
    }

    public Film(Integer filmId, String title, short rentalDuration, BigDecimal rentalRate, BigDecimal replacementCost, Date lastUpdate, Object fulltext) {
        this.filmId = filmId;
        this.title = title;
        this.rentalDuration = rentalDuration;
        this.rentalRate = rentalRate;
        this.replacementCost = replacementCost;
        this.lastUpdate = lastUpdate;
        this.fulltext = fulltext;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public short getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(short rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public BigDecimal getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
    }

    public Short getLength() {
        return length;
    }

    public void setLength(Short length) {
        this.length = length;
    }

    public BigDecimal getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Serializable getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(Serializable specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public Object getFulltext() {
        return fulltext;
    }

    public void setFulltext(Object fulltext) {
        this.fulltext = fulltext;
    }

    public List<FilmCategory> getFilmCategoryList() {
        return filmCategoryList;
    }

    public void setFilmCategoryList(List<FilmCategory> filmCategoryList) {
        this.filmCategoryList = filmCategoryList;
    }

    public List<FilmActor> getFilmActorList() {
        return filmActorList;
    }

    public void setFilmActorList(List<FilmActor> filmActorList) {
        this.filmActorList = filmActorList;
    }

    public Language getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Language languageId) {
        this.languageId = languageId;
    }

    public List<Inventory> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(List<Inventory> inventoryList) {
        this.inventoryList = inventoryList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (filmId != null ? filmId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Film)) {
            return false;
        }
        Film other = (Film) object;
        if ((this.filmId == null && other.filmId != null) || (this.filmId != null && !this.filmId.equals(other.filmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.programacion.dvd.modelo.Film[ filmId=" + filmId + " ]";
    }
    
}
