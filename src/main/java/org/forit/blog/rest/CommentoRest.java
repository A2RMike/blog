/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.forit.blog.rest;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.forit.blog.dao.CommentoDAO;
import org.forit.blog.dto.CommentoDTO;

/**
 *
 * @author UTENTE
 */
@Path("/commento")
public class CommentoRest {
    
    @Path("/")
    @GET()
    @Produces("application/json")
    public List<CommentoDTO> getCommenti() {
        CommentoDAO c = new CommentoDAO();
        return c.getListaCommenti();
    }

    @Path("/{id}")
    @GET()
    @Produces("application/json")
    public CommentoDTO getOneCategoria(@PathParam("id") long ID) {
        CommentoDAO c = new CommentoDAO();
        return c.getCommento(ID);
    }
    
}
