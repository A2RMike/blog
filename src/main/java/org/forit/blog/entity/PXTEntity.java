/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.forit.blog.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.Table;

/**
 *
 * @author UTENTE
 */
@Embeddable
@Table(name = "post_tag")
public class PXTEntity implements Serializable {
    
}
