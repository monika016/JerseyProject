package com.mindtree.TestProject.service;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;

import com.mindtree.TestProject.entity.User;

 
@Path("/user")
public interface UserService {

	@GET
	@Path("/add")
	@Produces({MediaType.TEXT_PLAIN})
	@Consumes({MediaType.TEXT_PLAIN})

	public String addUser();
	
	@GET
    @Path("/start")
    @Produces({MediaType.TEXT_PLAIN})
	@Consumes({MediaType.TEXT_PLAIN})
    public String startWebService();
	
	
	@POST
    @Path("/logIn")
    @Produces({MediaType.TEXT_PLAIN})
	@Consumes({MediaType.APPLICATION_JSON})
	public boolean logIn(User user);

}
