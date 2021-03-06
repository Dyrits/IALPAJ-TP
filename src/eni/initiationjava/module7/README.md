# Module 7 : Les variables complexes

<details markdown="block">
<summary>Mélangeur de mots</summary>

# Mélangeur de mots

# More about this project

### Related course
ENI | INITIATION A LA PROGRAMMATION AVEC JAVA  
TRAVAUX PRATIQUE : Module 7 : Les variables complexes  
[Mélangeur de mots](https://github.com/Dyrits/IALPAJ-TP/blob/master/Enonc%C3%A9s/Module%2007%20-%20Enonc%C3%A9%20TP%2001%20-%20M%C3%A9langeur%20de%20mots.pdf)

### Description of the project by ENI
Ecrire un programme **fr.eni_ecole.jse.melangeur.Melangeurqui** mélange les lettres (sauf la première etla dernière) de chaque mot d'une phrase et qui affiche la phrase avec les mots mélangés.  

Exemple de résultat:  
Ercire un porgrmame fr.eni_ecole.jse.melangeur.Melangeur qui mgnléae les lrtetes (suaf la prermèie et la drrnèiee) de cauhqe mot d'une psrahe et qui afifhce la pshare aevc les mtos mlsgééan.

### Technologies | Libraries | Frameworks | Tools  
- Java

### Details | Comments
- This project has been freely made from scratch following global instructions.

### Status
Completed

#### Last update
12/06/2020

#### Last update (README.md)
12/06/2020
</details>
<details markdown="block">
<summary>Cryptage poly-alphabétique</summary>

# Cryptage poly-alphabétique

# More about this project

### Related course
ENI | INITIATION A LA PROGRAMMATION AVEC JAVA  
TRAVAUX PRATIQUE : Module 7 : Les variables complexes  
[Cryptage poly-alphabétique](https://github.com/Dyrits/IALPAJ-TP/blob/master/Enonc%C3%A9s/Module%2007%20-%20Enonc%C3%A9%20TP%2002%20-%20Cryptage%20polyalphab%C3%A9tique.pdf)

### Description of the project by ENI
Mettre en place un programme permettant de crypter ou décrypter une chaîne saisie en fonction d’une clé saisie sur 8 caractères maximum.  
Pour crypter la chaîne de caractères saisie, utiliserun tableau dans lequel sont affichés autant d’alphabets qu'il y a de lettres (26) et qui crypte le texte à l’aide d’une clé de la manière suivante :  
- On cherche la valeur correspondant à la colonne i et la ligne j où i est la premièrelettre du mot en clair et j la premièrelettre de la clé. La lettre ainsi trouvée est la premièrelettre du mot crypté.  
- On procède de même pour toutes les lettres du mot en clair.  
- Lorsque la dernière lettre de la clé a été utilisée, on utilise de nouveau la premièreet ainsi de suite.  

Voyons un exemple :  
Texte en clair : INFORMATIQUE  
Clé : INRACI  
Cryptogramme : QAWOTUIGZQWM  

Car ‘q’ est la lettre qui se trouve à l’intersection du ‘I’ horizontal du mot en clair et du ‘I’ vertical de la clé INRACI.

### Technologies | Libraries | Frameworks | Tools  
- Java

### Details | Comments
- This project has been freely made from scratch following global instructions.

### Status
Completed

#### Last update
12/06/2020

#### Last update (README.md)
12/06/2020
</details>
<details markdown="block">
<summary>Suite logique</summary>

# Suite logique

# More about this project

### Related course
ENI | INITIATION A LA PROGRAMMATION AVEC JAVA  
TRAVAUX PRATIQUE : Module 7 : Les variables complexes  
[Suite logique](https://github.com/Dyrits/IALPAJ-TP/blob/master/Enonc%C3%A9s/Module%2007%20-%20Enonc%C3%A9%20TP%2003%20-%20Suite%20logique.pdf)

### Description of the project by ENI
1  
11  
21  
1211  
111221  
312211  

- Donner la suite de cette suite de chiffre.
- Une fois la suite trouvée, mettre en place l'algorithme permettant de continuer cette suite à une profondeur de 40.
- Optimiser le code afin que le temps d'exécution avec une profondeur de 40 soit inférieur à 1s.

### Technologies | Libraries | Frameworks | Tools  
- Java

### Details | Comments
- This project has been freely made from scratch following global instructions.

### Status
Completed

#### Last update
13/06/2020

#### Last update (README.md)
13/06/2020
</details>
<details markdown="block">
<summary>Représentation binaire</summary>

# Représentation binaire

# More about this project

### Related course
ENI | INITIATION A LA PROGRAMMATION AVEC JAVA  
TRAVAUX PRATIQUE : Module 7 : Les variables complexes  
[Représentation binaire](https://github.com/Dyrits/IALPAJ-TP/blob/master/Enonc%C3%A9s/Module%2007%20-%20Enonc%C3%A9%20TP%2004%20-%20Repr%C3%A9sentation%20binaire.pdf)

### Description of the project by ENI
Écrire une **classefr.eni_ecole.jse.AfficheurBinaire** qui affiche la représentation binaire d’unnombre entier compris entre 0 et 256 (sans utiliser `Integer.toBinaryString()` ni aucune autre classe que `Integer` et `System`)

Exemple:  
77 donne 0100 1101

### Technologies | Libraries | Frameworks | Tools  
- Java

### Details | Comments
- This project has been freely made from scratch following global instructions.

### Status
Completed

#### Last update
13/06/2020

#### Last update (README.md)
13/06/2020
</details>
<details markdown="block">
<summary>Palindromes</summary>

# Palindromes

# More about this project

### Related course
ENI | INITIATION A LA PROGRAMMATION AVEC JAVA  
TRAVAUX PRATIQUE : Module 7 : Les variables complexes  
[Palindromes](https://github.com/Dyrits/IALPAJ-TP/blob/master/Enonc%C3%A9s/Module%2007%20-%20Enonc%C3%A9%20TP%2004%20-%20Repr%C3%A9sentation%20binaire.pdf)

### Description of the project by ENI
Ecrire un programme **fr.eni_ecole.jse.palindrome.TesteurPalindrome** qui teste et affiche si unephrase est un palindrome ou non.

**Remarque :** un palindrome est une phrase donnant le même résultat qu'elle soit lue de droite à gauche ou de gauche à droite (sans tenir compte de la casse, des espaces, de la ponctuation ou des accents).

Exemples de palindromes :  
- « Laval »  
- « Esope reste ici et se repose »  
- « Engage le jeu que je le gagne »  
- « La mère Gide digère mal»  

**Indice:** s'intéresser à la méthode `split` de la classe `String` ou à la classe `StringTokenizer` et ses méthodes.

### Technologies | Libraries | Frameworks | Tools  
- Java

### Details | Comments
- This project has been freely made from scratch following global instructions.

### Status
Completed

#### Last update
13/06/2020

#### Last update (README.md)
13/06/2020
</details>
<details markdown="block">
<summary>Gestion des villes</summary>

# Gestion des villes

# More about this project

### Related course
ENI | INITIATION A LA PROGRAMMATION AVEC JAVA  
TRAVAUX PRATIQUE : Module 7 : Les variables complexes  
[Gestion des villes](https://github.com/Dyrits/IALPAJ-TP/blob/master/Enonc%C3%A9s/Module%2007%20-%20Enonc%C3%A9%20TP%2006%20-%20Gestion%20des%20villes.pdf)

### Description of the project by ENI
- Créer un tableau contenant les villes citées ci-dessous :
    - Lille
    - Lens
    - Amiens
    - Rouen
    - Caen
    - Rennes
    - Nantes
    - Niort
    - Bordeaux
    - Bayonne

- Créer une méthode affichant le contenu du tableau créé précédemment.
- Créer une méthode affichant les villes commençant par la lettre A du tableau créé précédemment.
- Créer une méthode qui modifie le contenu du tableau en ajoutant un numéro aléatoire à la fin du nom de chaque ville.  

### Technologies | Libraries | Frameworks | Tools  
- Java

### Details | Comments
- This project has been freely made from scratch following global instructions.

### Status
Completed

#### Last update
13/06/2020

#### Last update (README.md)
13/06/2020
</details>