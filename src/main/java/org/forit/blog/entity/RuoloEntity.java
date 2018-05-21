/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.forit.blog.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author UTENTE
 */
@Entity
@Table(name = "ruolo")
@NamedQueries({
    @NamedQuery(name = "query_ruolo", query = "SELECT r FROM RuoloEntity r")
})
public class RuoloEntity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private long ID;
    
    @Column(name = "DENOMINAZIONE", unique = false, nullable = false)
    private String denominazione;

    public RuoloEntity() {
    }

    public RuoloEntity(long ID, String denominazione) {
        this.ID = ID;
        this.denominazione = denominazione;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (this.ID ^ (this.ID >>> 32));
        hash = 97 * hash + Objects.hashCode(this.denominazione);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RuoloEntity other = (RuoloEntity) obj;
        if (this.ID != other.ID) {
            return false;
        }
        if (!Objects.equals(this.denominazione, other.denominazione)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RuoloEntity{" + "ID=" + ID + ", denominazione=" + denominazione + '}';
    }
    
    
    
}
