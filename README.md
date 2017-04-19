# Spring Boot With MongoDB and RESTful Webservices Example Application

A sample application to get started with Java+Maven+SpringBoot+MongoDB and RESTful webservice.I hope it will help you.

## How to Run

* Clone this repository 
* You can build the project and run the tests by running ```mvn clean package```
* After successfull build, run StarterApp.java as a java application
* Check the console output, to make sure no exceptions are thrown

Once the application runs you should see something like this :-

```
2017-04-19 19:39:13.587  INFO 19764 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2017-04-19 19:39:13.855  INFO 19764 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 2020 (http)
2017-04-19 19:39:13.862  INFO 19764 --- [           main] com.pradeep.spring.mongodb.StarterApp    : Started StarterApp in 5.801 seconds (JVM running for 6.409)
2017-04-19 19:39:13.862  INFO 19764 --- [           main] com.pradeep.spring.mongodb.StarterApp    : Application got started...
```

## URL details : 

1.	Get all employee  
 url :  http://localhost:2020/v1/employees
Output will be like below : 
````
[
  {
    "employeeId": "38860",
    "name": "pradeep",
    "location": "gurgaon",
    "salary": 111111,
    "mobileNo": "1234567890"
  },
  {
    "employeeId": "38861",
    "name": "susil",
    "location": "gurgaon",
    "salary": 121212,
    "mobileNo": "2323232323"
  }
]
````

2.	Get employee by id  
url :  http://localhost:2020/v1/employee/id/38860
Out put will be like below - 
```
 {
    "employeeId": "38860",
    "name": "pradeep",
    "location": "gurgaon",
    "salary": 111111,
    "mobileNo": "1234567890"
  }
```
3.	Get employee by name  
url :  http://localhost:2020/v1/employee/name/pradeep
Out put will be like below - 
```
 {
    "employeeId": "38860",
    "name": "pradeep",
    "location": "gurgaon",
    "salary": 111111,
    "mobileNo": "1234567890"
  }
```


4.	Add employee  
url : http://localhost:2020/v1/employee
Note : while invoking this url mention the details of employee which you want to add in the body of REST tool (e.g. POSTMAN) like below - 
```
 {
    "employeeId": "38860",
    "name": "Pradeep",
    "location": "Gurgaon",
    "salary": 11111,
    "mobileNo": "1234567890"
  }
```

5.	Update employee  
url :  http://localhost:2020/v1/update
Note : while invoking this url mention the details of employee which you want to update in the body of REST tool (e.g. POSTMAN) like below - 
```
 {
    "employeeId": "38860",
    "name": "Pradeep",
    "location": "Gurgaon",
    "salary": 11111,
    "mobileNo": "1234567890"
  }
```
keep the existing employeeId, if employeeId will not be there then a new record will get created.

6. Delete an employee
url :  http://localhost:8080/v1/delete/38860

7.	Delete all employee  
url : http://localhost:2020/v1/delete

## Questions and Comments: pradeepk.pdp@gmail.com
