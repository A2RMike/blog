/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.forit.blog.dao;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import org.forit.blog.dto.PostDTO;
import org.forit.blog.entity.PostEntity;
import org.forit.blog.exceptions.BlogException;

/**
 *
 * @author UTENTE
 */
public class PostDAO {

    public List<PostDTO> getListaPost() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("blog_pu");
        EntityManager em = emf.createEntityManager();

        TypedQuery<PostEntity> query = em.createNamedQuery("query_post", PostEntity.class);
        List<PostEntity> list = query.getResultList();
        List<PostDTO> posts = list.stream().map(post -> {
            return new PostDTO(post.getID(), post.getID_Categoria(), post.getTitolo(), post.getDescrizione(),
                    post.getAutore(), post.getData(), post.isVisibile(), post.getVisite());
        }).collect(Collectors.toList());
        em.close();
        emf.close();

        return posts;
    }

    public PostDTO getPost(long ID) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("blog_pu");
        EntityManager em = emf.createEntityManager();

        PostEntity post = em.find(PostEntity.class, ID);
        
        long id_categoria = post.getID_Categoria();
        String titolo = post.getTitolo();
        String descrizione = post.getDescrizione();
        long ID_autore = post.getAutore();
        LocalDate data = post.getData();
        boolean visibile = post.isVisibile();
        long visite = post.getVisite();

        PostDTO p = new PostDTO(ID, id_categoria, titolo, descrizione, ID_autore, data, visibile, visite);
        
        em.close();
        emf.close();

        return p;
    }
    
    public void insertPost(long id_categoria, String titolo, String descrizione, long ID_autore, LocalDate data, boolean visibile, long visite) throws BlogException{
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("blog_pu");
        EntityManager em = emf.createEntityManager();
        
        EntityTransaction t = em.getTransaction();
        try{
            t.begin();
            
            PostEntity post = new PostEntity();
            post.setID_Categoria(id_categoria);
            post.setTitolo(titolo);
            post.setDescrizione(descrizione);
            post.setAutore(ID_autore);
            post.setData(data);
            post.setVisibile(visibile);
            post.setVisite(visite);
            em.persist(post);
            
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
