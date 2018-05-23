/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.forit.blog.dao;

import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import org.forit.blog.dto.CommentoDTO;
import org.forit.blog.entity.CategoriaEntity;
import org.forit.blog.entity.CommentoEntity;

/**
 *
 * @author UTENTE
 */
public class CommentoDAO {
    
    public List<CommentoDTO> getListaCommenti() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("blog_pu");
        EntityManager em = emf.createEntityManager();

        TypedQuery<CommentoEntity> query = em.createNamedQuery("query_commento", CommentoEntity.class);
        List<CommentoEntity> list = query.getResultList();
        List<CommentoDTO> commenti = list.stream().map(c -> {
            return new CommentoDTO(c.getID(), 
                    c.getNickname(), c.getEmail(), 
                    c.getData_inserimento(), c.getTesto(), 
                    c.getData_risposta(), c.getRisposta(), c.isVisibile(), c.getID_post());
        }).collect(Collectors.toList());
        em.close();
        emf.close();

        return commenti;
    }
    
    public CommentoDTO getCommento(long ID) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("blog_pu");
        EntityManager em = emf.createEntityManager();

        CommentoEntity c = em.find(CommentoEntity.class, ID);
        CommentoDTO commento = new CommentoDTO(c.getID(), 
                    c.getNickname(), c.getEmail(), 
                    c.getData_inserimento(), c.getTesto(), 
                    c.getData_risposta(), c.getRisposta(), c.isVisibile(), c.getID_post());
        
        em.close();
        emf.close();

        return commento;
    }
    
}
