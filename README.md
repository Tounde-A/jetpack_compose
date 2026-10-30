# Devoir - Créer une fiche « Profil développeur » avec Compose

## Contexte

### Objectif

créer un petit écran Compose représentant une fiche « Profil développeur ». L’objectif est
de produire une interface propre, structurée, lisible et composée de plusieurs composants
réutilisables.

---

### Sujet 

Votre écran devra contenir au minimum :

• un nom ;

• un rôle ou titre professionnel ;

• une courte description ;

• une liste de compétences ;

• une information de contact ou de disponibilité ;

• au moins une action utilisateur sous forme de bouton ou de zone cliquable.

---

### travail demandé

Créer une application Android Compose simple contenant un écran principal de profil
développeur.

Le code doit être organisé en plusieurs composables.
Créer au minimum 5 fonctions composables, par exemple :

• un composable pour l’écran principal ;

• un composable pour la fiche de profil ;

• un composable pour l’en-tête du profil ;

• un composable pour une compétence ;

• un composable pour une action ;

• un composable pour une information secondaire.

Les noms sont donnés à titre indicatif. Vous pouvez choisir vos propres noms, à condition qu’ils
soient clairs.

---

### Temps

Ce devoir est à réalisé en 1h30.

---

### Livrables attendus

un dépôt Git public

Le dépôt doit contenir :
1. Le projet Android complet.
2. Un fichier README.md.
3. Le code Compose de votre fiche « Profil développeur ».
4. Au moins deux previews fonctionnelles.
5. Une courte réponse écrite dans le README.md.

---

## Titre : Profil développeur Compose

### Description



---

### Notions utilisées



---

### Explications

1. Quels composables avez-vous créés ?

- ProfileCard
- ProfileHeader
- ProfileName
- ProfileTitle
- ProfileSkills
- ProfileButtonContact
- ProfileContent
- DeveloperFullstackPreview
- DeveloperFrontPreview

2. Quel composable représente l’écran principal ?

- ProfileCard

3. Où utilisez-vous un padding externe ?

- ProfileCard

4. Où utilisez-vous un padding interne ?

- ProfileContent

5. Quel composant reçoit un callback ?

- ProfileButtonContact

6. Quelle information d’accessibilité avez-vous ajoutée ?

- un role est une description

7. Pourquoi vos composants peuvent-ils être considérés comme réutilisables ?

- grace aux paramètre transmit des enfant vers le parent

---

### ScreenShot de la preview de l'application