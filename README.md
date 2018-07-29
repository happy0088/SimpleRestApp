# SimpleRestApp

This is a sample maven project aiming to maintain a TODO List .

#dependencies :
Jax-RS 

#persistant layer :
	in-memory using List
	
#Server :
Apache Tomcat 7

#Steps:
Do a maven install in the repo , deploy the app in the server and hit the below urls :

GET : 
http://localhost:8080/todoList/webapi/resources

GET :
http://localhost:8080/todoList/webapi/resources/{message_id}

POST : 
http://localhost:8080/todoList/webapi/resources
  payload e.g :
  application/json
  
    {
    "author": "abs",
    "created": "2018-07-30T16:24:09.058",
    "id": 10,
    "message": "Message3"
}

