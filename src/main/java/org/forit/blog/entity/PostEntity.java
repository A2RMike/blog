/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.forit.blog.entity;

import java.io.Serializable;
import java.time.LocalDate;
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
@Table(name = "post")
@NamedQueries({
    @NamedQuery(name = "query_post", query = "SELECT p from PostEntity p")
})
public class PostEntity implements Serializable {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private long ID;
    
    @Column(name = "ID_CATEGORIA", unique = false, nullable = false)
    private long ID_Categoria;
    
    @Column(name = "TITOLO", unique = false, nullable = false)
    private String titolo;
    
    @Column(name = "DESCRIZIONE", unique = false, nullable = false)
    private String descrizione;
    
    @Column(name = "ID_AUTORE", unique = false, nullable = false)
    private long ID_autore;
    
    @Column(name = "DATA", unique = false, nullable = false)
    private LocalDate data;
    
    @Column(name = "VISIBILE", unique = false, nullable = false)
    private boolean visibile;
    
    @Column(name = "VISITE", unique = false, nullable = false)
    private long visite;

    public PostEntity() {
    }

    public PostEntity(long ID, long ID_Categoria, String titolo, String descrizione, long ID_autore, LocalDate data, boolean visibile, long visite) {
        this.ID = ID;
        this.ID_Categoria = ID_Categoria;
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.ID_autore = ID_autore;
        this.data = data;
        this.visibile = visibile;
        this.visite = visite;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getID_Categoria() {
        return ID_Categoria;
    }

    public void setID_Categoria(long ID_Categoria) {
        this.ID_Categoria = ID_Categoria;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public long getAutore() {
        return ID_autore;
    }

    public void setAutore(long autore) {
        this.ID_autore = autore;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public boolean isVisibile() {
        return visibile;
    }

    public void setVisibile(boolean visibile) {
        this.visibile = visibile;
    }

    public long getVisite() {
        return visite;
    }

    public void setVisite(long visite) {
        this.visite = visite;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (this.ID ^ (this.ID >>> 32));
        hash = 37 * hash + (int) (this.ID_Categoria ^ (this.ID_Categoria >>> 32));
        hash = 37 * hash + Objects.hashCode(this.titolo);
        hash = 37 * hash + Objects.hashCode(this.descrizione);
        hash = 37 * hash + Objects.hashCode(this.ID_autore);
        hash = 37 * hash + Objects.hashCode(this.data);
        hash = 37 * hash + (this.visibile ? 1 : 0);
        hash = 37 * hash + (int) (this.visite ^ (this.visite >>> 32));
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
        final PostEntity other = (PostEntity) obj;
        if (this.ID != other.ID) {
            return false;
        }
        if (this.ID_Categoria != other.ID_Categoria) {
            return false;
        }
        if (this.visibile != other.visibile) {
            return false;
        }
        if (this.visite != other.visite) {
            return false;
        }
        if (!Objects.equals(this.titolo, other.titolo)) {
            return false;
        }
        if (!Objects.equals(this.descrizione, other.descrizione)) {
            return false;
        }
        if (!Objects.equals(this.ID_autore, other.ID_autore)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PostEntity{" + "ID=" + ID + ", ID_Categoria=" + ID_Categoria + ", titolo=" + titolo + ", descrizione=" + descrizione + ", ID_autore=" + ID_autore + ", data=" + data + ", visibile=" + visibile + ", visite=" + visite + '}';
    }
    
    
    
}
