# HibernateTP2
# Application Java avec Hibernate, MySQL et Maven

Ce projet est une application Java simple illustrant l'utilisation de **Hibernate** pour la persistance des données dans une base de données **MySQL**, le tout géré par **Maven**.

## Fonctionnalités

L'application gère deux entités :

* **Salle**: représente une salle physique avec un code unique.
* **Machine**: représente une machine avec une référence, une date d'achat et appartient à une salle.

L'application permet de :

* Créer des salles et des machines.
* Afficher la liste de toutes les salles et leurs machines associées.
* Rechercher des machines achetées entre deux dates.

## Installation et Exécution

1. **Clonez le projet:**
   ```bash
   git clone <repo_url>
   ```

2. **Construisez le projet avec Maven:**
   ```bash
   cd hibernate1
   mvn clean install
   ```
   Cette commande va télécharger les dépendances nécessaires, compiler le code et créer un fichier JAR exécutable.

3. **Créez la base de données MySQL:**
   * Ouvrez votre outil de gestion de base de données (par exemple, MySQL Workbench).
   * Créez une nouvelle base de données nommée "hbnate2".

4. **Configurez le fichier `hibernate.cfg.xml`:**
   * Modifiez les propriétés `hibernate.connection.url`, `hibernate.connection.username`, `hibernate.connection.password` pour correspondre à vos informations de connexion à la base de données MySQL.

5. **Exécutez l'application:**
   ```bash
   java -cp target/hibernate1-1.0-SNAPSHOT.jar test.Test
   ```
   Ceci lancera la classe `test.Test` qui démontrera les fonctionnalités de l'application.

## Structure du code

Le code est organisé comme suit :

* **entities:** Contient les classes d'entités (`Salle`, `Machine`).
* **services:** Contient les classes de service (`SalleService`, `MachineService`) qui gèrent les opérations sur les entités.
* **dao:** Contient l'interface `IDao` qui définit les méthodes génériques pour les opérations CRUD (Create, Read, Update, Delete).
* **util:** Contient la classe `HibernateUtil` qui gère la configuration et la création de la `SessionFactory` Hibernate.
* **test:** Contient la classe `Test` qui teste les fonctionnalités de l'application et la classe `MachineServiceTest` et `SalleServiceTest` pour tester les classes services.

## Utilisation de Hibernate

* **Configuration:** Le fichier `hibernate.cfg.xml` définit la configuration de Hibernate, incluant le pilote JDBC, l'URL de connexion à la base de données et les mappings des entités.
* **Mappings:** Les annotations JPA (`@Entity`, `@Id`, `@GeneratedValue`, `@ManyToOne`, `@OneToMany`) sont utilisées pour mapper les classes Java aux tables de la base de données.
* **Opérations CRUD:** Les classes de service utilisent les méthodes de la `SessionFactory` Hibernate pour effectuer les opérations CRUD sur les entités.

## Utilisation de MySQL

* **Base de données:** La base de données "hbnate2" est utilisée pour stocker les données de l'application.
* **Tables:** Les tables "salles" et "machines" sont créées automatiquement par Hibernate lors de la première exécution de l'application.

## Utilisation de Maven

* **Dépendances:** Maven gère les dépendances nécessaires pour le projet, telles que Hibernate, MySQL Connector, et JUnit.
* **Construction:** Maven est utilisé pour compiler le code, exécuter les tests et créer un fichier JAR exécutable.

## Notes

* Ce projet est un exemple simple et peut être étendu avec d'autres fonctionnalités.
* Vous pouvez utiliser des outils de test unitaires comme JUnit pour tester votre code.
* N'oubliez pas de modifier le fichier `hibernate.cfg.xml` pour correspondre à votre configuration de base de données.

## Ressources

* [Hibernate documentation](https://hibernate.org/orm/documentation/5.6/)
* [MySQL documentation](https://dev.mysql.com/doc/)
* [Maven documentation](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
