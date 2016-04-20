#WebService

Ce dépot rassemble différents projets qui rassemblent les technologies que l'on peut utiliser pour mettre en place les webservices en Java.

Sur une classe d'implementation que l'on veut transformer en webservice, on click droit et on choisit `webservice` puis` create webservice`. On choisi le mode `deploy` puis on démarre le service grâce à `start service`.  
On peut ensuite taper le lien du service qui se trouve dans la balise location dans le fichier wsdl : `http://localhost:8080/PremierServiceAxis/services/PremierServiceImpl`. Pour accéder à la description du web service, on ajoute à ce lien le mot `?wsdl`.

UDDI Register : un simple registre avec DNS qui centralise tous les webservices dans une entreprise

On peut tester les webservices avec windows power shell.
Il faut taper dans  la ligne de commande : 
	
	$ws = WebServiceProxy -uri http://localhost:8080/PremierServiceAxis/services/PremierServiceImpl?wsdl

Ensuite pour appeler une fonction et l'executer par le webservice : 

	$ws.add(15,12)

On peut aussi utiliser l'outil SoapUI 5.1.3 :

- new Soap Project, on entre le lien de notre service : `http://localhost:8080/PremierServiceAxis/services/PremierServiceImpl?wsdl`
- On peut ensuite remplir les champs des paramètres des fonctions par des valeurs
- On clique sur le triangle vert pour voir le résultat

Avec Axis aussi :

- on a crée un nouveau projet client .jar :
- on a cliqué droit sur le dossier : src/main/java
- on a choisit new -> other -> client webservice -> on donné le lien de wsdl
- il a généré toutes les classes du proxy
- on a utilisé le proxy pour appeler les fonctions de services

Avec wsimport :

- pour generer le proxy cmd : ligne de commande : on accède au dossier `bin` du dossier où est installé le java jdk ou se trouve ws-import
- on crée un nouveau dossier dans lequel on va génerer les classes du proxy
- on tape la ligne de commande : `wsimport -s lien-de-nouveau-dossier lien-wsdl`

creation d'un ejb + webservice :

- creation d'un projet ejb (packaging : ejb)
- configuration du pom en ajoutant les lignes suivantes :


On déploie ensuite le projet ejb sur le serveur jboss et (n'oublie de modifier les ports sur standalone.xml) pour éviter le conflit avec le serveur tomcat

- copier l'adresse de service pour voir le wsdl sur le navigateur
- puis generer le proxy avec wsimport en une ligne de commande
- copier les classes de projet et les coller dans `java/src/main` d'un nouveau projet client

Avec un style SoapBuilding `RPC`, le proxy n'a pas de classe pour chaque opération, on aura deux classes : une pour l'interface et l'autre pour l'implementation.

##Spring et CXF

Dépendances nécessaires :

- Spring-Web
- CXF (servlet)

Il faut bien penser à ajouter les fichiers de configuration du context de Spring avec la déclaration des beans et les listener dans le fichier `web.xml`.  
De même pour déclarer la servlet CXF.  
URL pour WSDL : `http://localhost:8080/WebService-SpringCXF/services/springService?wsdl`

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
