# Front Controller Desing Pattern
## Probleme:
In A Java Application we use Servlets to manage our application endpoints, bu as application grows our servlets number also increases, so we hit the Redundancy of common functionalities acros servlets like (authentication, authorization,logging,tracking).
## Solution:
To void that The solution is to use the Front controller design pattern.

---
### Explication:
The front controller design pattern is used to provide a centralized request handling mechanism so that all requests will be handled by a single handler. This handler can do the authentication/ authorization/ logging or tracking of request and then pass the requests to corresponding handlers. Following are the entities of this type of design pattern.
 - **Front Controller**: Single handler for all kinds of requests coming to the application (either web based/ desktop based).
 - **Dispatcher**: Front Controller may use a dispatcher object which can dispatch the request to corresponding specific handler.
 - **View**: Views are the object for which the requests are made.
---
<img src="https://www.tutorialspoint.com/design_pattern/images/frontcontroller_pattern_uml_diagram.jpg" width="100%">

---

## Exemple in Java:
- HomeView.java
```java
public class HomeView {
   public void show(){
      System.out.println("Displaying Home Page");
   }
}
```
- StudentView.java
```java
public class StudentView {
   public void show(){
      System.out.println("Displaying Student Page");
   }
}
```
- Dispatcher.java
```java
public class Dispatcher {
   private StudentView studentView;
   private HomeView homeView;
   
   public Dispatcher(){
      studentView = new StudentView();
      homeView = new HomeView();
   }

   public void dispatch(String request){
      if(request.equalsIgnoreCase("STUDENT")){
         studentView.show();
      }
      else{
         homeView.show();
      }	
   }
}
```
- FrontController.java
```java
public class FrontController {
	
   private Dispatcher dispatcher;

   public FrontController(){
      dispatcher = new Dispatcher();
   }

   private boolean isAuthenticUser(){
      System.out.println("User is authenticated successfully.");
      return true;
   }

   private void trackRequest(String request){
      System.out.println("Page requested: " + request);
   }

   public void dispatchRequest(String request){
      //log each request
      trackRequest(request);
      
      //authenticate the user
      if(isAuthenticUser()){
         dispatcher.dispatch(request);
      }	
   }
}
```
`Use the FrontController to demonstrate Front Controller Design Pattern.`

- FrontControllerPatternDemo.java
```java
public class FrontControllerPatternDemo {
   public static void main(String[] args) {
   
      FrontController frontController = new FrontController();
      frontController.dispatchRequest("HOME");
      frontController.dispatchRequest("STUDENT");
   }
}
```
- Verify the output.
```
Page requested: HOME
User is authenticated successfully.
Displaying Home Page
Page requested: STUDENT
User is authenticated successfully.
Displaying Student Page
```

# In spring MVC:
Front controller in Spring MVC is presented by `DispatcherServlet` wich is a class that receives the incoming request and maps it to the right resource such as controllers, models, and views.

---
<img src="https://static.javatpoint.com/sppages/images/spring-web-model-view-controller.png" width="100%" style="padding:16px;background:white;">

---
- ***Model***: A model contains the data of the application. A data can be a single object or a collection of objects.
- ***Controller***: A controller contains the business logic of an application. Here, the @Controller annotation is used to mark the class as the controller.
- ***View***: A view represents the provided information in a particular format. Generally, JSP+JSTL is used to create a view page. Although spring also supports other view technologies such as Apache Velocity, Thymeleaf and FreeMarker.
- ***Front Controller***: In Spring Web MVC, the DispatcherServlet class works as the front controller. It is responsible to manage the flow of the Spring MVC application.
