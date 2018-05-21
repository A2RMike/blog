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
public class CategoriaDTO {
    
    private long ID;
    private String nome;
    private String descrizione;
    private String immagine;
    private boolean visibile;

    public CategoriaDTO() {
    }

    public CategoriaDTO(long ID, String nome, String descrizione, String immagine, boolean visibile) {
        this.ID = ID;
        this.nome = nome;
        this.descrizione = descrizione;
        this.immagine = immagine;
        this.visibile = visibile;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getImmagine() {
        return immagine;
    }

    public void setImmagine(String immagine) {
        this.immagine = immagine;
    }

    public boolean isVisibile() {
        return visibile;
    }

    public void setVisibile(boolean visibile) {
        this.visibile = visibile;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + (int) (this.ID ^ (this.ID >>> 32));
        hash = 43 * hash + Objects.hashCode(this.nome);
        hash = 43 * hash + Objects.hashCode(this.descrizione);
        hash = 43 * hash + Objects.hashCode(this.immagine);
        hash = 43 * hash + (this.visibile ? 1 : 0);
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
        final CategoriaDTO other = (CategoriaDTO) obj;
        if (this.ID != other.ID) {
            return false;
        }
        if (this.visibile != other.visibile) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.descrizione, other.descrizione)) {
            return false;
        }
        if (!Objects.equals(this.immagine, other.immagine)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CategoriaDTO{" + "ID=" + ID + ", nome=" + nome + ", descrizione=" + descrizione + ", immagine=" + immagine + ", visibile=" + visibile + '}';
    }
    
    
    
    
    
}
