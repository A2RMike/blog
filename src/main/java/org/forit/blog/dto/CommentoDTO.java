/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.forit.blog.dto;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author UTENTE
 */
public class CommentoDTO {
    
    private long ID;
    private String nickname;
    private String email;
    private LocalDate data_inserimento;
    private String testo;
    private LocalDate data_risposta;
    private String risposta;
    private boolean visibile;
    private long ID_post;

    public CommentoDTO() {
    }

    public CommentoDTO(long ID, String nickname, String email, LocalDate data_inserimento, String testo, LocalDate data_risposta, String risposta, boolean visibile, long ID_post) {
        this.ID = ID;
        this.nickname = nickname;
        this.email = email;
        this.data_inserimento = data_inserimento;
        this.testo = testo;
        this.data_risposta = data_risposta;
        this.risposta = risposta;
        this.visibile = visibile;
        this.ID_post = ID_post;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getData_inserimento() {
        return data_inserimento;
    }

    public void setData_inserimento(LocalDate data_inserimento) {
        this.data_inserimento = data_inserimento;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public LocalDate getData_risposta() {
        return data_risposta;
    }

    public void setData_risposta(LocalDate data_risposta) {
        this.data_risposta = data_risposta;
    }

    public String getRisposta() {
        return risposta;
    }

    public void setRisposta(String risposta) {
        this.risposta = risposta;
    }

    public boolean isVisibile() {
        return visibile;
    }

    public void setVisibile(boolean visibile) {
        this.visibile = visibile;
    }

    public long getID_post() {
        return ID_post;
    }

    public void setID_post(long ID_post) {
        this.ID_post = ID_post;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (int) (this.ID ^ (this.ID >>> 32));
        hash = 59 * hash + Objects.hashCode(this.nickname);
        hash = 59 * hash + Objects.hashCode(this.email);
        hash = 59 * hash + Objects.hashCode(this.data_inserimento);
        hash = 59 * hash + Objects.hashCode(this.testo);
        hash = 59 * hash + Objects.hashCode(this.data_risposta);
        hash = 59 * hash + Objects.hashCode(this.risposta);
        hash = 59 * hash + (this.visibile ? 1 : 0);
        hash = 59 * hash + (int) (this.ID_post ^ (this.ID_post >>> 32));
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
        final CommentoDTO other = (CommentoDTO) obj;
        if (this.ID != other.ID) {
            return false;
        }
        if (this.visibile != other.visibile) {
            return false;
        }
        if (this.ID_post != other.ID_post) {
            return false;
        }
        if (!Objects.equals(this.nickname, other.nickname)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.testo, other.testo)) {
            return false;
        }
        if (!Objects.equals(this.risposta, other.risposta)) {
            return false;
        }
        if (!Objects.equals(this.data_inserimento, other.data_inserimento)) {
            return false;
        }
        if (!Objects.equals(this.data_risposta, other.data_risposta)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CommentoDTO{" + "ID=" + ID + ", nickname=" + nickname + ", email=" + email + ", data_inserimento=" + data_inserimento + ", testo=" + testo + ", data_risposta=" + data_risposta + ", risposta=" + risposta + ", visibile=" + visibile + ", ID_post=" + ID_post + '}';
    }
    
    
    
}
