SpringMVC4GettingStarted
========================

Start Jump with new features of Spring MVC 4
*****
1. mvn clean install -Dmaven.test.skip=true
2. mvn -X tomcat7:run
3. http://localhost:8080/Spring4Training/event.html

To import this project into Eclipse, you need to generate some Eclipse project configuration files ://
 *.mvn eclipse:eclipse -Dwtpversion=2.0


*****
To Test Internal Resources we added a pdf file in the project you can test that by deploying and go to this URL://
 *.http://localhost:8080/Spring4Training/pdfs/javasun.pdf

*****

To Test the RestControler go to this Url:
 *.http://localhost:8080/Spring4Training/events.json

*****
In Order to test the angular Client go to this url : //
 *.http://localhost:8080/Spring4Training/eventsReports.jsp

