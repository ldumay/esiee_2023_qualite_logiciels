# esiess_2023_qualite_logiciels
 
## Principaux outils de tests unitaires

- assertEquals / assertArraysEquals
  - But : comparer 2 valeurs (méthode `equals` de la classe `Object`)
  - Ne retourne rien
  - 2 paramètres minimum :
    - 1er = valeur attendue - **excepted**
    - 2ème = valeur réelle - **actual**
  - 3ème paramètre facultatif :
    - delta = tolérance de comparaison
  - 4ème paramètre facultatif :
    - message = message
- assertTrue / assertFalse
  - But : vérifier une condition
  - Ne retourne rien
  - 1 paramètre minimum :
    - 1er = valeur booléenne - **condition**
  - 2ème paramètre facultatif :
    - message = message
- assertSame / assertNotSame
  - But : comparer 2 références (adresse mémoire de l'objet)
  - Ne retourne rien
  - 2 paramètres minimum :
    - 1er = valeur attendue - **excepted**
    - 2ème = valeur réelle - **actual**
  - 3ème paramètre facultatif :
    - message = message

## Autres outils de tests unitaires

- assertNull / assertNotNull
  - But : vérifier si une variable est nulle ou non
- assertArrayHasKey
  - But : vérifier si une clé existe dans un tableau
- fail
  - But : forcer un test à échouer