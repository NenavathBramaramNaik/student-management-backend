# Coding Challenge - Fiatwise
		
#Technology stack:
		Java 11, Spring Boot, Swagger, Spring Data JPA, H2 in-memory database, MAVEN,	Springtoolsuite.exe

#Solution	
	The application works the way user expects the application to work and I even ensured the 	functionality meets and covers all features as per the given requirement document.
	
	I have preloaded University data, as the universities will be either populated by using external 	system or from any datasource because the universities are already registered and established.
	
	Hence, I injected data by using data.sql to h2 in-memory database.
	
	Just incase, If we are caching the data or not consuming updated universities data, I am validating 	whether the selected university is available in the database or not.
	
#API response:
	
	For Saving data:
					{
					  "firstName": "Bramaram",
					  "lastName": "Nenavath",
					  "dateOfBirth": "1990-05-25",
					  "email": "abc@abc.com",
					  "phoneNumber": 1744044699,
					  "status": "SUBSCRIBED",
					  "universityName": "Jawaharlal Nehru State University",
					  "universityDate": "2021-01-01"
					}
	For updating data:
					{
					  "id":1
					  "firstName": "Bramaram",
					  "lastName": "Nenavath",
					  "dateOfBirth": "1990-05-25",
					  "email": "abc@abc.com",
					  "phoneNumber": 1744044699,
					  "status": "SUBSCRIBED",
					  "universityName": "Jawaharlal Nehru State University",
					  "universityDate": "2021-01-01"
					}
	
	Invalid case: If selected university or student is invalid.
		Response:
					{
					  "title": "404",
					  "status": "NOT_FOUND",
					  "timestamp": "2021-02-12T16:09:52.9984589",
					  "message": "Could not find the selected university Jaawaharlal Nehru State University"
					}
					{
					  "title": "404",
					  "status": "NOT_FOUND",
					  "timestamp": "2021-02-12T16:11:25.8857708",
					  "message": "Could not find the Student for the given booking ID: 2"
					}
					
#Planning
	I have read the given business document thoroughly and understood the given requirement like 	features, conditions, tasks and then identified business models like
		defining business domain objects
		defining business value objects
		defining business actions
		defining business validations
		
	All these are implemented.
	
#Implementation
	The application is developed as a classic microservice structure by following "Separation of concern" 	pattern which is more flexible with clean design and architecture.
	
	The architecture of the service is built with the following components:
	 	* DataTransferObjects: Objects which are used for outside communication via the API
	   * Controller: Implements the processing logic of the  service, parsing of parameters and validation of in- and outputs.
	   * Service: Implements the business logic and handles the access to the DataAccessObjects.
	   * DataAccessObjects: Interface for the database. Inserts, updates, deletes and reads objects from the database.
	   * DomainObjects: Functional Objects which might be persisted in the database.
	   * Domainvalue: business constants which defines domain specific value. 
	

	I did the implementation using a more `functional programming` approach. Notice there are very few 	`if` keywords used. This results in a more linear, reusable codebase, immutable objects and avoiding 	`null`.
	
	For the design of the application followed 	DDD so again it's easier to convert the domain models 	to software artifacts.
	
	I tried to not add any any big external `dependencies/frameworks` and just keep it simple.
	
	as per the given document, i was asked to use spring boot for the task.
	Hence I used spring boot for the application development with , h2 in memory database as spring boot 	 	very good interation with h2 it also provides the web console to maintain the database which is very 	simple to use it, jpa for data management.
	
	The also integrated with swagger ui to visualize and interact with API resources which 	makes it easy 	for backend implementation and client side consumption If any.
	
#Application Setup
I have given the code as a zip file,

	Either we can use maven plugin to run the application using mvn spring-boot:run OR
	
	Open Springtoolsuite.exe IDE, File -> 
						  import ->
						  general ->
						  existing projects into workspace -> 
						  select archive file ->
						  select the zip file -> finish
						  Run as -> maven install
						  Run as -> Spring boot app
	Once, the server is started.
	Please access the URL http://localhost:8080/ for the swagger-ui which provides the access to rest api 	endpoints.

For production grade application, I can definitely add more high level configurations and other key blocks like unit tests, integration tests, acceptance tests, Authentication and Authorization, Orchestration, CICD pipeline , API gateways, fault tolerance, disaster recovery, monitoring, and documentation.
				
