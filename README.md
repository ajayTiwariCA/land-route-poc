Backend Developer Test

Requirements:-
 Create a Spring Boot Application.
 Able to calculate any possible land route from one country to another.
 Take a list of country data in JSON format
 Calculate the route by utilizing individual countries border 

Standards Followed:-
Uses Java maven Spring Boot framework to develop the APIs
We have created the sample JSON that is the subset of the given JSON in assignment  to complete the demo faster . We can use the original JSON once we get the chance to be associated with this project .
The application exposes REST endpoint /routing?origin=CZE&destination=ITA
If there is no land crossing, the endpoint returns HTTP 400
Countries are identified by cca3 field in country data

Steps for project configuration:-
1 Clone the repository https://github.com/ajayTiwariCA/land-route-poc.git
2 Open the directory in the IDE i.e eclipse.
3 Clean and build the application using maven 
4 Open file /routing/src/main/java/com/rout/routing/RoutingApplication.java
5 Run the file as java application or as spring boot application
6 Application is by default running on port 8080 - You can change the port in application.properties file if required. 
7 For testing hit the provided endpoint -> /routing?origin=CZE&destination=ITA


