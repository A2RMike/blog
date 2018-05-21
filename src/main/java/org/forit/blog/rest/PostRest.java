/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.forit.blog.rest;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.forit.blog.dao.PostDAO;
import org.forit.blog.dto.PostDTO;
import org.forit.blog.exceptions.BlogException;

/**
 *
 * @author UTENTE
 */
@Path("/post")
public class PostRest {

    @Path("/")
    @GET()
    @Produces("application/json")
    public List<PostDTO> getPost() {
        PostDAO post = new PostDAO();
        return post.getListaPost();
    }

    @Path("/{id}")
    @GET()
    @Produces("application/json")
    public PostDTO getOnePost(@PathParam("id") long ID) {
        PostDAO post = new PostDAO();
        return post.getPost(ID);
    }
        
    @Path("/")
    @POST()
    @Produces("application/json")
    @Consumes("application/json")
    public boolean postPost(PostDTO p) {
        try {
            PostDAO post = new PostDAO();
            post.insertPost(p.getID_Categoria(), p.getTitolo(), p.getDescrizione(), p.getAutore(), p.getData(), p.isVisibile(), p.getVisite());
            return true;
        } catch (BlogException ex) {
            System.out.println("Error: " + ex.getMessage());
            return false;
        }
    }
}
