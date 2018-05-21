/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.forit.blog.dto;

import java.util.Objects;

/**
 *
 * @author UTENTE
 */
public class RuoloDTO {
    
    private long ID;
    private String denominazione;

    public RuoloDTO() {
    }

    public RuoloDTO(long ID, String denominazione) {
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
        int hash = 7;
        hash = 53 * hash + (int) (this.ID ^ (this.ID >>> 32));
        hash = 53 * hash + Objects.hashCode(this.denominazione);
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
        final RuoloDTO other = (RuoloDTO) obj;
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
        return "RuoloDTO{" + "ID=" + ID + ", denominazione=" + denominazione + '}';
    }
    
    
    
}
