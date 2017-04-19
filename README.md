# Spring Boot With MongoDB and RESTful Webservices Example Application

A sample of Java+Maven+Spring Boot application that can be used as a starter for creating a REST webservice.  I hope it will help you.

## How to Run

* Clone this repository 
* You can build the project and run the tests by running ```mvn clean package```
* After successfull build, run SpringBootStarter.java as a java application
* Check the console output, to make sure no exceptions are thrown

Once the application runs you should see something like this :-

```
2017-03-14 20:52:44.535  INFO 11204 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2017-03-14 20:52:44.612  INFO 11204 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8080 (http)
2017-03-14 20:52:44.618  INFO 11204 --- [           main] c.p.springboot.rest.SpringBootStarter    : Started SpringBootStarter in 4.506 seconds (JVM running for 5.013)
```

## URL details : 

1.	Get all users  
 url :  http://localhost:8080/api/users


2.	Get user by id  
url :  http://localhost:8080/api/user/id/1

3.	Get user by name  
url :  http://localhost:8080/api/user/name/Pradeep

4.	Create user  
url : http://localhost:8080/api/create/user

5.	Update user  
url :  http://localhost:8080/api/update/user

6.	Delete all users  
url : http://localhost:8080/api/delete/users

## Questions and Comments: pradeepk.pdp@gmail.com
