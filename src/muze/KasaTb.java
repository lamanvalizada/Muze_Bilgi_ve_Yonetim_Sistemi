/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muze;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author gruhayn
 */
@Entity
@Table(name = "kasa_tb", catalog = "muze_db", schema = "")
@NamedQueries({
    @NamedQuery(name = "KasaTb.findAll", query = "SELECT k FROM KasaTb k")
    , @NamedQuery(name = "KasaTb.findById", query = "SELECT k FROM KasaTb k WHERE k.id = :id")
    , @NamedQuery(name = "KasaTb.findByTc", query = "SELECT k FROM KasaTb k WHERE k.tc = :tc")
    , @NamedQuery(name = "KasaTb.findByTutar", query = "SELECT k FROM KasaTb k WHERE k.tutar = :tutar")
    , @NamedQuery(name = "KasaTb.findByKucuk", query = "SELECT k FROM KasaTb k WHERE k.kucuk = :kucuk")
    , @NamedQuery(name = "KasaTb.findByBuyuk", query = "SELECT k FROM KasaTb k WHERE k.buyuk = :buyuk")})
public class KasaTb implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Tc")
    private String tc;
    @Basic(optional = false)
    @Column(name = "Tutar")
    private String tutar;
    @Column(name = "Kucuk")
    private String kucuk;
    @Column(name = "Buyuk")
    private String buyuk;

    public KasaTb() {
    }

    public KasaTb(Integer id) {
        this.id = id;
    }

    public KasaTb(Integer id, String tc, String tutar) {
        this.id = id;
        this.tc = tc;
        this.tutar = tutar;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        String oldTc = this.tc;
        this.tc = tc;
        changeSupport.firePropertyChange("tc", oldTc, tc);
    }

    public String getTutar() {
        return tutar;
    }

    public void setTutar(String tutar) {
        String oldTutar = this.tutar;
        this.tutar = tutar;
        changeSupport.firePropertyChange("tutar", oldTutar, tutar);
    }

    public String getKucuk() {
        return kucuk;
    }

    public void setKucuk(String kucuk) {
        String oldKucuk = this.kucuk;
        this.kucuk = kucuk;
        changeSupport.firePropertyChange("kucuk", oldKucuk, kucuk);
    }

    public String getBuyuk() {
        return buyuk;
    }

    public void setBuyuk(String buyuk) {
        String oldBuyuk = this.buyuk;
        this.buyuk = buyuk;
        changeSupport.firePropertyChange("buyuk", oldBuyuk, buyuk);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KasaTb)) {
            return false;
        }
        KasaTb other = (KasaTb) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "muze.KasaTb[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
