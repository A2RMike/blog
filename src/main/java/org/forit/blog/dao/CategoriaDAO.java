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
import org.forit.blog.dto.CategoriaDTO;
import org.forit.blog.entity.CategoriaEntity;

/**
 *
 * @author UTENTE
 */
public class CategoriaDAO {
    
    public List<CategoriaDTO> getListaCategorie() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("blog_pu");
        EntityManager em = emf.createEntityManager();

        TypedQuery<CategoriaEntity> query = em.createNamedQuery("query_categoria", CategoriaEntity.class);
        List<CategoriaEntity> list = query.getResultList();
        List<CategoriaDTO> posts = list.stream().map(c -> {
            return new CategoriaDTO(c.getID(), c.getNome(), c.getDescrizione(), c.getImmagine(), c.isVisibile());
        }).collect(Collectors.toList());
        em.close();
        emf.close();

        return posts;
    }
    
    public CategoriaDTO getCategoria(long ID) {
        /*EntityManagerFactory emf = Persistence.createEntityManagerFactory("blog_pu");
        EntityManager em = emf.createEntityManager();
        TypedQuery<CategoriaEntity> query = em.createNamedQuery("query_categoria", CategoriaEntity.class);

        CategoriaEntity c = em.find(CategoriaEntity.class, ID);
        
        String nome = c.getNome();
        String descrizione = c.getDescrizione();
        String immagine = c.getImmagine();
        boolean visibile = c.isVisibile();

        CategoriaDTO cat = new CategoriaDTO(ID, nome, descrizione, immagine, visibile);
        
        em.close();
        emf.close();
*/
        
        for(CategoriaDTO cat : getListaCategorie())
            if(cat.getID()==ID)        
                return cat;
            
        
        return null;
    }
    
}
