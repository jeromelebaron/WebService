#WebService

Différents projets qui rassemblent les technologies que l'on peut utiliser pour mettre en place les webservices en Java.

sur la classe implementation, on click droit et on choisit webservice puis create webservice, tu choisie deploy service puis start service

on peut taper le lien de service qui se trouve dans la balise location dans le fichier wsdl : http://localhost:8080/PremierServiceAxis/services/PremierServiceImpl puis on ajoute à ce lien le mot  "?wsdl"

UDDI Register : un simple registre avec DNS qui centralise tous les webservices dans une entreprise

on a utilisé windows power shell :

    taper la ligne de commande : $ws = WebServiceProxy -uri http://localhost:8080/PremierServiceAxis/services/PremierServiceImpl?wsdl

    Appeler les fonction et l'executer par le webservice : $ws.add(15,12), entrer

on a utilisé l'outil SoapUI 5.1.3:

    new Soap Project: on entre le lien de notre service : http://localhost:8080/PremierServiceAxis/services/PremierServiceImpl?wsdl
    dans remplit les champs des paramètres des fonctions par des valeurs
    on clique sur le triangle vert pour voir le résultat

Avec Axis aussi :

    on a crée un nouveau projet client .jar :
    on a cliquer droit sur le dossier : src/main/java
    on a choisit new ->other-> client webservice-> on donné le lien de wsdl
    il a générer toutes les classes du proxy
    on a utilisé le proxy pour appeler les fonctions de services

Avec wsimport :
pour generer le proxy cmd: ligne de command : on a accédé au dossier bin de dossier java jdk ou se trouve ws-import
on a crée un nouveau dossier dans lequel on va génerer les classes du proxy
puis on a taper la ligne de commande : wsimport -s lien de nouveau dossier  lien wsdl
exemple

creation d'un ejb + webservice

-creation d'un projet ejb (packaging : ejb)
-configuration du pom en ajoutant les lignes suivantes :
<dependencies>
        <dependency>
            <groupId>javax</groupId>
            <artifactId>javaee-api</artifactId>
            <version>6.0</version>
            <scope>provided</scope>
        </dependency>
    </dependencies>
    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>2.0.2</version>
                <configuration>
                    <source>1.7</source>
                    <target>1.7</target>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-ejb-plugin</artifactId>
                <version>2.3</version>
                <configuration>
                    <ejbVersion>3.0</ejbVersion>
                </configuration>
            </plugin>
        </plugins>
    </build>
creation d'une interface qui represente le service en ajoutant des notation ejb et web service : voila un exemple
@WebService(targetNamespace = "http://ws.ejb.afcepf.fr")
public interface IEjbService {
    @WebMethod(operationName="ajouter")
    @WebResult(name="retourAjout")
int add(@WebParam(name="paramI")int i, @WebParam(name="paramj") int j);
    @WebMethod(operationName="puissance")
    @WebResult(name="retourPow")
double pow(@WebParam(name="paramA") double a, @WebParam(name="paramB")double b);
}

creation d'une classe qui implement les opération du service en ajoutant des notations: voila un exemple
@Remote(IEjbService.class)
@Singleton
@WebService(endpointInterface = "fr.afcepf.al26.ws.api.IEjbService", targetNamespace = "http://ws.ejb.afcepf.fr", serviceName = "operationService")
public class EjbServiceImpl implements IEjbService {

    @Override
    public int add(int i, int j) {
        return i + j;
    }

    @Override
    public double pow(double a, double b) {
        return Math.pow(a, b);
    }

}

deployer le projet ejb sur le serveur jboss et n'oublie de modifier les ports sur standalone.xml pour gérer le conflit avec le serveur tomcat
- copie l'adresse de service pour voir le wsdl sur le navigateur
- puis genere le proxy avec wsimport en une ligne de commande
- copie les classes de projet et les coller dans java/src/main d'un nouveau projet client
- tester avec :
public class TestCallWs {
    private static Logger log = Logger.getLogger(TestCallWs.class);
    private TestCallWs(){

    }

    public static void main(String[] args) {
            OperationService service = new OperationService();
            IEjbService proxy = service.getEjbServiceImplPort();
            log.info(proxy.ajouter(11, 15));
            log.info(proxy.puissance(2, 3));
            log.info("fin de test");
    }
Tomcat n'est pas un standard JEE à part le servlet
java-eee pour connaitre la version de jee par le web.xml
pour generer le fichier web.xml : creer un dossier WEb-INF sous webapp et clique droit jee tools generate deployment descrpition

avec un style SoapBuilding RPC, le proxy n'a pas de classe pour chaque opération , on aura deux classe : une pour l'interface et l'autre pour l'implementation.

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
