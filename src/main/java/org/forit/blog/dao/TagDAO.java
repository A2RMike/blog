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
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import org.forit.blog.dto.TagDTO;
import org.forit.blog.entity.TagEntity;
import org.forit.blog.exceptions.BlogException;

/**
 *
 * @author UTENTE
 */
public class TagDAO {
    
    public List<TagDTO> getListaTag() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("blog_pu");
        EntityManager em = emf.createEntityManager();

        TypedQuery<TagEntity> query = em.createNamedQuery("query_tag", TagEntity.class);
        List<TagEntity> list = query.getResultList();
        List<TagDTO> tags = list.stream().map(tag -> {
            return new TagDTO(tag.getID(), tag.getNome());
        }).collect(Collectors.toList());
        em.close();
        emf.close();

        return tags;
    }
    
    public void insertTag(String nome) throws BlogException{
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("blog_pu");
        EntityManager em = emf.createEntityManager();
        
        EntityTransaction t = em.getTransaction();
        try{
            t.begin();
            
            TagEntity tag = new TagEntity();
            tag.setNome(nome);
            em.persist(tag);
            
            t.commit();
            
        } catch(Exception ex){
            t.rollback();
            throw new BlogException(ex);
        } finally{
            em.close();
            emf.close();
        }
        
    }
    
}
