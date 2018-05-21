/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.forit.blog.rest;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.forit.blog.dao.TagDAO;
import org.forit.blog.dto.TagDTO;

/**
 *
 * @author UTENTE
 */
@Path("/tags")
public class TagRest {
    
    @Path("/")
    @GET()
    @Produces("application/json")
    public List<TagDTO> getTag() {
        TagDAO post = new TagDAO();
        return post.getListaTag();
    }
    
    
}
