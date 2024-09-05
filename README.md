
---

# Application de Gestion des Plats

Cette application est une solution web intuitive permettant aux utilisateurs de gérer facilement une liste de plats. Elle propose des fonctionnalités telles que l'ajout, la modification, la suppression de plats et la visualisation des plats disponibles.

## Fonctionnalités

- **Consulter la liste des plats** : Affichage de tous les plats disponibles dans une interface claire.
- **Ajouter un plat** : Possibilité d'ajouter de nouveaux plats avec leurs informations (nom, description, prix, etc.).
- **Modifier un plat** : Mettre à jour les informations d'un plat existant.
- **Supprimer un plat** : Retirer un plat de la liste.
  
## Prérequis

- [Java](https://www.java.com/fr/download/) 11 ou plus
- [Spring Boot](https://spring.io/projects/spring-boot) 2.5 ou plus
- [Thymeleaf](https://www.thymeleaf.org/) pour le rendu des vues

- Base de données relationnelle (ex : MySQL)

## Installation

1. Clonez le dépôt : 
   
2. Accédez au répertoire du projet :
   ```bash
   cd votre-repo
   ```

3. Configurez les paramètres de la base de données dans `application.properties` :
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/nom_de_la_base
   spring.datasource.username=nom_utilisateur
   spring.datasource.password=mot_de_passe
   spring.jpa.hibernate.ddl-auto=update
   ```

4. Lancez l'application :
   ```bash
   mvn spring-boot:run
   ```

## Utilisation

Une fois l'application lancée, accédez à l'interface web via l'URL suivante :

```
http://localhost:8080
```

### Ajouter un plat

Accédez à la page "Ajouter un plat" pour ajouter un nouveau plat à la liste. Remplissez le formulaire avec les informations nécessaires et soumettez-le.

### Modifier ou supprimer un plat

Depuis la liste des plats, vous pouvez cliquer sur les boutons "Modifier" ou "Supprimer" à côté de chaque plat pour mettre à jour ou supprimer les informations.

## Technologies Utilisées

- **Back-end** : Spring Boot
- **Front-end** : Thymeleaf, Tailwind CSS
- **Base de données** : MySQL (ou tout autre système relationnel compatible avec Spring Data JPA)
- **Build tool** : Maven

## Contribuer

1. Forkez ce dépôt.
2. Créez une branche pour votre fonctionnalité (`git checkout -b fonctionnalité-nouvelle`).
3. Committez vos modifications (`git commit -am 'Ajoute nouvelle fonctionnalité'`).
4. Poussez la branche (`git push origin fonctionnalité-nouvelle`).
5. Ouvrez une Pull Request.

## Licence

Ce projet est sous licence MIT. Voir le fichier [LICENSE](LICENSE) pour plus de détails.

---

N'hésitez pas à ajuster les sections selon les spécificités de votre projet.
