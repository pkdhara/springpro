/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.argusoft.testbyjay;

import java.sql.SQLException;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author pradeepkumar
 */
@Path("/display")
public class XmlDisplay {

    XmlInsertion xml;

    public XmlDisplay() throws ClassNotFoundException, SQLException {
        this.xml = new XmlInsertion();
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<MyResources> Display() {
        return xml.getMyResources();
    }
}
