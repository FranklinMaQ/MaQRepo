/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maq.repository.Api;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import javax.ejb.Init;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.SessionScoped;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import maq.repository.App.App;
import maq.repository.InterfacesImpl.MultimediaAppsLoader;
import maq.repository.InterfacesImpl.UzytkoweAppsLoader;

/**
 * REST Web Service
 *
 * @author MaQ
 */
@Path("api")
@ApplicationScoped
public class AppResource {

 
    private ArrayList<App> multimedialne;
  private ArrayList<App> uzytkowe;
  
  
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AppResource
     */
    public AppResource() {
        this.multimedialne = new MultimediaAppsLoader().LoadApps();
        this.uzytkowe = new UzytkoweAppsLoader().LoadApps();
      
    }
    
    private Response FindLink(String name, String version)
    {
        for(App x : uzytkowe)
           {
               if(x.getName().equals(name) && x.getLinki().containsKey(version))
               {
                   return Response.status(200)
		.entity(x.getLinki().get(version).getLink())
		.build();
               }
           }
        for(App x : multimedialne)
           {
               if(x.getName().equals(name) && x.getLinki().containsKey(version))
               {
                   return Response.status(200)
		.entity(x.getLinki().get(version).getLink())
		.build();
               }
           }
        return Response.status(404).entity("brak linku").build();
    }
    
    private Response FindIcon(String name, String version)
    {
        for(App x : uzytkowe)
           {
               if(x.getName().equals(name) && x.getLinki().containsKey(version))
               {
                   return Response.status(200)
		.entity(x.getIcon())
		.build();
               }
           }
        for(App x : multimedialne)
           {
               if(x.getName().equals(name) && x.getLinki().containsKey(version))
               {
                   return Response.status(200)
		.entity(x.getIcon())
		.build();
               }
           }
        return Response.status(404).entity("brak linku").build();
    }

    /**
     * Retrieves representation of an instance of maq.repository.Api.AppResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("{name}/{version}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getAppLink(
			@PathParam("name") String name,
			@PathParam("version") String version
			) {

	   return FindLink(name, version);

	   

	}

     @GET
    @Path("ico/{name}/{version}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getAppIcon(
			@PathParam("name") String name,
			@PathParam("version") String version
			) {

	   return FindIcon(name, version);

	   

	}

}
