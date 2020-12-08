#https://stackoverflow.com/questions/21239573/maven-dependency-update-on-commandline

mvn clean install -U

#-U means force update of dependencies.

#Also, if you want to import the project into eclipse, I first run:

mvn eclipse:eclipse

#then run

mvn eclipse:clean




#or
mvn dependency:resolve
mvn clean install


#https://maven.apache.org/plugins/maven-war-plugin/usage.html
mvn package
#or
mvn compile war:war



#Solving java.net.BindException: Address already in use: JVM_Bind
#http://www.mastertheboss.com/jboss-server/jboss-configuration/solving-javanetbindexception-address-already-in-use-jvmbind
#
#
#fuser -v -n tcp 8080
#fuser -v -n tcp 8081
#
#  sudo kill <PID>
# sudo kill 18554
#
#
#
#

