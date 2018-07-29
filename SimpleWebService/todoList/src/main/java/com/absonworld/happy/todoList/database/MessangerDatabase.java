package com.absonworld.happy.todoList.database;

import java.util.HashMap;
import java.util.Map;

import com.absonworld.happy.todoList.model.Message;


public class MessangerDatabase {

	public static Map<Long,Message> messages =  new HashMap<Long,Message>();
	
	
	public static Map<Long,Message>getmessages()
	{
		return messages;
	}
	
}
