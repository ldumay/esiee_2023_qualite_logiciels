# esiess_2023_qualite_logiciels

## Assertions

### Principaux outils de tests unitaires

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

### Autres outils de tests unitaires

- assertAll
  - But : vérifier plusieurs conditions 
- assertNull / assertNotNull
  - But : vérifier si une variable est nulle ou non
- assertThrows / assertDoesNotThrow
  - But : vérifier si une exception est levée ou non
- assertInstanceOf
  - But : vérifier si une variable est une instance d'une classe
- assertArrayHasKey
  - But : vérifier si une clé existe dans un tableau
- assertTimeout / assertTimeoutPreemptively
  - assertTimeout
    - But : vérifier si un test dépasse un temps imparti mais ne l'interrompt pas
  - assertTimeoutPreemptively
    - But : vérifier si un test dépasse un temps imparti et l'interrompt
  - formats - pour assertTimeout et assertTimeoutPreemptively : 
    - assertTimeout(Duration.ofSeconds(1), () -> { ... })
    - assertTimeout(Duration.ofMillis(100), () -> { ... })
    - assertTimeout(Duration.ofNanos(100000000), () -> { ... })
    - assertTimeout(Duration.of(1, ChronoUnit.SECONDS), () -> { ... })
    - assertTimeout(Duration.of(100, ChronoUnit.MILLIS), () -> { ... })
    - assertTimeout(Duration.of(100000000, ChronoUnit.NANOS), () -> { ... })
- assertIterableEquals
  - But : comparer 2 itérables
- fail
  - But : forcer un test à échouer

## Assomptions

### Principaux outils de tests unitaires

- assumeFalse / assumeTrue
  - But : vérifier une condition
  - Ne retourne rien
  - Arrête et annule le test si la condition est fausse
  - 1 paramètre minimum :
    - 1er = valeur booléenne - **condition**
  - 2ème paramètre facultatif :
    - message = message
- assumeingThat
  - But : vérifier une condition
  - Ne retourne rien
  - Exécute une fonction anonyme que si la condition est vraie
  - 2 paramètres minimum :
    - 1er = valeur booléenne - **condition**
    - 2ème = fonction anonyme - **lambda**
  - 3ème paramètre facultatif :
    - message = message