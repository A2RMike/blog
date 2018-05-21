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
public class AccountDTO {
    
    private long ID;
    private String nome;
    private String cognome;
    private String username;
    private String email;
    private String password;
    private LocalDate dataRegistrazione;
    private LocalDate dataUltimoAccesso;
    private boolean attivo;
    private boolean bloccato;
    private long numeroTentativi;
    private long ID_ruolo;

    public AccountDTO() {
    }

    public AccountDTO(long ID, String nome, String cognome, String username, String email, String password, LocalDate dataRegistrazione, LocalDate dataUltimoAccesso, boolean attivo, boolean bloccato, long numeroTentativi, long ID_ruolo) {
        this.ID = ID;
        this.nome = nome;
        this.cognome = cognome;
        this.username = username;
        this.email = email;
        this.password = password;
        this.dataRegistrazione = dataRegistrazione;
        this.dataUltimoAccesso = dataUltimoAccesso;
        this.attivo = attivo;
        this.bloccato = bloccato;
        this.numeroTentativi = numeroTentativi;
        this.ID_ruolo = ID_ruolo;
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

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getDataRegistrazione() {
        return dataRegistrazione;
    }

    public void setDataRegistrazione(LocalDate dataRegistrazione) {
        this.dataRegistrazione = dataRegistrazione;
    }

    public LocalDate getDataUltimoAccesso() {
        return dataUltimoAccesso;
    }

    public void setDataUltimoAccesso(LocalDate dataUltimoAccesso) {
        this.dataUltimoAccesso = dataUltimoAccesso;
    }

    public boolean isAttivo() {
        return attivo;
    }

    public void setAttivo(boolean attivo) {
        this.attivo = attivo;
    }

    public boolean isBloccato() {
        return bloccato;
    }

    public void setBloccato(boolean bloccato) {
        this.bloccato = bloccato;
    }

    public long getNumeroTentativi() {
        return numeroTentativi;
    }

    public void setNumeroTentativi(long numeroTentativi) {
        this.numeroTentativi = numeroTentativi;
    }

    public long getID_ruolo() {
        return ID_ruolo;
    }

    public void setID_ruolo(long ID_ruolo) {
        this.ID_ruolo = ID_ruolo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (this.ID ^ (this.ID >>> 32));
        hash = 53 * hash + Objects.hashCode(this.nome);
        hash = 53 * hash + Objects.hashCode(this.cognome);
        hash = 53 * hash + Objects.hashCode(this.username);
        hash = 53 * hash + Objects.hashCode(this.email);
        hash = 53 * hash + Objects.hashCode(this.password);
        hash = 53 * hash + Objects.hashCode(this.dataRegistrazione);
        hash = 53 * hash + Objects.hashCode(this.dataUltimoAccesso);
        hash = 53 * hash + (this.attivo ? 1 : 0);
        hash = 53 * hash + (this.bloccato ? 1 : 0);
        hash = 53 * hash + (int) (this.numeroTentativi ^ (this.numeroTentativi >>> 32));
        hash = 53 * hash + (int) (this.ID_ruolo ^ (this.ID_ruolo >>> 32));
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
        final AccountDTO other = (AccountDTO) obj;
        if (this.ID != other.ID) {
            return false;
        }
        if (this.attivo != other.attivo) {
            return false;
        }
        if (this.bloccato != other.bloccato) {
            return false;
        }
        if (this.numeroTentativi != other.numeroTentativi) {
            return false;
        }
        if (this.ID_ruolo != other.ID_ruolo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cognome, other.cognome)) {
            return false;
        }
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.dataRegistrazione, other.dataRegistrazione)) {
            return false;
        }
        if (!Objects.equals(this.dataUltimoAccesso, other.dataUltimoAccesso)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AccountDTO{" + "ID=" + ID + ", nome=" + nome + ", cognome=" + cognome + ", username=" + username + ", email=" + email + ", password=" + password + ", dataRegistrazione=" + dataRegistrazione + ", dataUltimoAccesso=" + dataUltimoAccesso + ", attivo=" + attivo + ", bloccato=" + bloccato + ", numeroTentativi=" + numeroTentativi + ", ID_ruolo=" + ID_ruolo + '}';
    }
    
    
}
