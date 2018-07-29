package com.absonworld.happy.todoList.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.UriInfo;

import com.absonworld.happy.todoList.database.MessangerDatabase;
import com.absonworld.happy.todoList.exception.DoesNotExistException;
import com.absonworld.happy.todoList.model.Message;

public class TODOService {

	private Map<Long, Message> messages = MessangerDatabase.getmessages();

	public TODOService() {
		messages.put(10L, new Message(10, "Message1", new Date(), "happy"));
		messages.put(11L, new Message(11, "Message2", new Date(), "happy"));

	}

	public List<Message> getAllMessages() {
		return (new ArrayList<Message>(messages.values()));

	}

	public Message getMessage(Long id, UriInfo uriInfo) {
		Message message1 = messages.get(id);
		String errorMsg = String.valueOf(id) + " does not exist";
		//System.out.println("Erro msg:" + errorMsg);
		if (message1 == null) {
			throw new DoesNotExistException(errorMsg);
		}
		return message1;
	}

	public Message insertMessage(Message message) {
		// Map<Long,Message> message = new HashMap<Long,Message>();
		Long location = messages.size() + 1L;
		messages.put(location, message);
		return ((messages.get(location)));

	}

	/*
	 * public List<Message> updateMessage(Long id,Message message) {
	 * //Map<Long,Message> message = new HashMap<Long,Message>();
	 * messages.put(id,message ); return (new
	 * ArrayList<Message>(messages.values()));
	 * 
	 * }
	 * 
	 * public List<Message> deleteMessage(Long id) { //Map<Long,Message> message =
	 * new HashMap<Long,Message>(); messages.remove(id); return (new
	 * ArrayList<Message>(messages.values()));
	 * 
	 * }
	 */

}
