#WebService

Différents projets qui rassemblent les technologies que l'on peut utiliser pour mettre en place les webservices en Java.

##Spring et CXF

Dépendances nécessaires :

- Spring-Web
- CXF (servlet)

Il faut bien penser à ajouter les fichiers de configuration du context de Spring avec la déclaration des beans et les listener dans le fichier `web.xml`.  
De même pour déclarer la servlet CXF.

###Déploiement sur les serveurs :

- Tomcat :
	- WebService-Web
	- WebService-SpringCXF
- JBoss
	- WebService-JaxWS-EJB
	- WebService-ProjetWeb

###Configuration technique

- Projets Maven architecture 3Pom
- Java 1.7
- Java EE 6
- serveur Tomcat 7
- serveur JBoss 7.1
