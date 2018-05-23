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
import org.forit.blog.dao.CategoriaDAO;
import org.forit.blog.dto.CategoriaDTO;

/**
 *
 * @author UTENTE
 */
@Path("/categoria")
public class CategoriaRest {

    @Path("/")
    @GET()
    @Produces("application/json")
    public List<CategoriaDTO> getCategorie() {
        CategoriaDAO c = new CategoriaDAO();
        return c.getListaCategorie();
    }

    @Path("/{id}")
    @GET()
    @Produces("application/json")
    public CategoriaDTO getOneCategoria(@PathParam("id") long ID) {
        CategoriaDAO c = new CategoriaDAO();
        return c.getCategoria(ID);
    }

}
