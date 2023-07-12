# Use a base Tomcat image
FROM tomcat:latest

# Copy your application WAR file to the Tomcat webapps directory
COPY ./target /usr/local/tomcat/webapps/
