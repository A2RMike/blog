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
@Table(name = "account")
@NamedQueries({
    @NamedQuery(name = "query_account", query = "SELECT a FROM AccountEntity a order by a.nome")
})
public class AccountEntity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private long ID;
    
    @Column(name = "NOME", unique = false, nullable = false)
    private String nome;
    
    @Column(name = "COGNOME", unique = false, nullable = false)
    private String cognome;
    
    @Column(name = "USERNAME", unique = true, nullable = false)
    private String username;
    
    @Column(name = "EMAIL", unique = false, nullable = false)
    private String email;
    
    @Column(name = "PASSWORD", unique = false, nullable = false)
    private String password;
    
    @Column(name = "DATA_REGISTRAZIONE", unique = false, nullable = false)
    private LocalDate dataRegistrazione;
    
    @Column(name = "DATA_ULTIMO_ACCESSO", unique = false, nullable = false)
    private LocalDate dataUltimoAccesso;
    
    @Column(name = "ATTIVO", unique = false, nullable = false)
    private boolean attivo;
    
    @Column(name = "BLOCCATO", unique = false, nullable = false)
    private boolean bloccato;
    
    @Column(name = "NUMERO_TENTATIVI", unique = false, nullable = false)
    private long numeroTentativi;
    
    @Column(name = "ID_RUOLO", unique = false, nullable = false)
    private long ID_ruolo;

    public AccountEntity() {
    }

    public AccountEntity(long ID, String nome, String cognome, String username, String email, String password, LocalDate dataRegistrazione, LocalDate dataUltimoAccesso, boolean attivo, boolean bloccato, long numeroTentativi, long ID_ruolo) {
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
        hash = 41 * hash + (int) (this.ID ^ (this.ID >>> 32));
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + Objects.hashCode(this.cognome);
        hash = 41 * hash + Objects.hashCode(this.username);
        hash = 41 * hash + Objects.hashCode(this.email);
        hash = 41 * hash + Objects.hashCode(this.password);
        hash = 41 * hash + Objects.hashCode(this.dataRegistrazione);
        hash = 41 * hash + Objects.hashCode(this.dataUltimoAccesso);
        hash = 41 * hash + (this.attivo ? 1 : 0);
        hash = 41 * hash + (this.bloccato ? 1 : 0);
        hash = 41 * hash + (int) (this.numeroTentativi ^ (this.numeroTentativi >>> 32));
        hash = 41 * hash + (int) (this.ID_ruolo ^ (this.ID_ruolo >>> 32));
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
        final AccountEntity other = (AccountEntity) obj;
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
        return "AccountEntity{" + "ID=" + ID + ", nome=" + nome + ", cognome=" + cognome + ", username=" + username + ", email=" + email + ", password=" + password + ", dataRegistrazione=" + dataRegistrazione + ", dataUltimoAccesso=" + dataUltimoAccesso + ", attivo=" + attivo + ", bloccato=" + bloccato + ", numeroTentativi=" + numeroTentativi + ", ID_ruolo=" + ID_ruolo + '}';
    }
    
    
    
}
