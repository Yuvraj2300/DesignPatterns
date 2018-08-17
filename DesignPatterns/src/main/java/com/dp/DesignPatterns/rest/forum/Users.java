package com.dp.DesignPatterns.rest.forum;

import java.util.ArrayList;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@ApplicationPath("/")
@Path("users")
public class Users extends Application {

	@GET
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response getUsers() {
		ArrayList<Users> users = this.getUserList();
		JsonArrayBuilder jsonArray = Json.createArrayBuilder();

		/*for (Users user : users) {
			jsonArray.add(Json.createObjectBuilder().add("id", user.getClasses()));
		}*/
		
		return	null;

	}

	private ArrayList<Users> getUserList() {
		// TODO Auto-generated method stub

		ArrayList<Users> u = new ArrayList<>();
		u.add(new Users());
		return u;
	}

}
