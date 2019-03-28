package com.example.SpringBootJersey;


import java.net.URISyntaxException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wayne.Hu
 */
@Path("/users")
public class UserResource {
    @GET
    @Path("/{name}")
    @Produces("application/json")
    public Response sayHello(@PathParam("name") String name) throws URISyntaxException
    {
        String greeting = "Hello "+name;
        return Response.ok(greeting).build();
    }
}
