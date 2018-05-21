/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.forit.blog.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.LocalDate;
import java.util.Objects;
import org.forit.blog.serializer.LocalDateDeserializer;
import org.forit.blog.serializer.LocalDateSerializer;

/**
 *
 * @author UTENTE
 */
public class PostDTO {
    
    private long ID;
    private long ID_Categoria;
    private String titolo;
    private String descrizione;
    private long ID_autore;
    
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate data;
    private boolean visibile;
    private long visite;
    private String dataAsString;

    public PostDTO() {
    }

    public PostDTO(long ID, long ID_Categoria, String titolo, String descrizione, long ID_autore, LocalDate data, boolean visibile, long visite) {
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

    public void setAutore(long ID_autore) {
        this.ID_autore = ID_autore;
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
    
    public String getDataAsString(){
        return this.data.toString();
    }
    
    public void setDataAsString(String dataAsString){
        this.data = LocalDate.parse(dataAsString);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (this.ID ^ (this.ID >>> 32));
        hash = 97 * hash + (int) (this.ID_Categoria ^ (this.ID_Categoria >>> 32));
        hash = 97 * hash + Objects.hashCode(this.titolo);
        hash = 97 * hash + Objects.hashCode(this.descrizione);
        hash = 97 * hash + Objects.hashCode(this.ID_autore);
        hash = 97 * hash + Objects.hashCode(this.data);
        hash = 97 * hash + (this.visibile ? 1 : 0);
        hash = 97 * hash + (int) (this.visite ^ (this.visite >>> 32));
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
        final PostDTO other = (PostDTO) obj;
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
        return "PostDTO{" + "ID=" + ID + ", ID_Categoria=" + ID_Categoria + ", titolo=" + titolo + ", descrizione=" + descrizione + ", ID_autore=" + ID_autore + ", data=" + data + ", visibile=" + visibile + ", visite=" + visite + '}';
    }
    
    
    
}
