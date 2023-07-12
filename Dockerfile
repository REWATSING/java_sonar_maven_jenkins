# Use a base Tomcat image
FROM tomcat:latest

# Copy your application WAR file to the Tomcat webapps directory
COPY /target/my-local-java-project-1.0-SNAPSHOT.jar /usr/local/tomcat/webapps/
