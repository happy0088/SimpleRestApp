package com.absonworld.happy.todoList.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.absonworld.happy.todoList.model.Message;
import com.absonworld.happy.todoList.service.TODOService;

@Path("/resources")
public class TODOResource {

	TODOService todo = new TODOService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getTODO()
	{
		return todo.getAllMessages();
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message createTODO(Message message)
	{
		return (Message) todo.insertMessage(message);
	}
	
	
}
