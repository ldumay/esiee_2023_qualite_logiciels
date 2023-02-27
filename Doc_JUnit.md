[Retour](../../)

# Documentation JUnit

## Assertions

### Les principaux

- **assertEquals** / **assertArraysEquals**
  - But : comparer 2 valeurs (méthode `equals` de la classe `Object`)
  - Ne retourne rien
  - 2 paramètres minimum :
    - 1er = valeur attendue - **excepted**
    - 2ème = valeur réelle - **actual**
  - 3ème paramètre facultatif :
    - delta = tolérance de comparaison
  - 4ème paramètre facultatif :
    - message = message
- **assertTrue** / **assertFalse**
  - But : vérifier une condition
  - Ne retourne rien
  - 1 paramètre minimum :
    - 1er = valeur booléenne - **condition**
  - 2ème paramètre facultatif :
    - message = message
- **assertSame** / **assertNotSame**
  - But : comparer 2 références (adresse mémoire de l'objet)
  - Ne retourne rien
  - 2 paramètres minimum :
    - 1er = valeur attendue - **excepted**
    - 2ème = valeur réelle - **actual**
  - 3ème paramètre facultatif :
    - message = message

### Les autres

- **assertAll**
  - But : vérifier plusieurs conditions 
- **assertNull** / **assertNotNull**
  - But : vérifier si une variable est nulle ou non
- **assertThrows** / **assertDoesNotThrow**
  - But : vérifier si une exception est levée ou non
- **assertInstanceOf**
  - But : vérifier si une variable est une instance d'une classe
- **assertArrayHasKey**
  - But : vérifier si une clé existe dans un tableau
- **assertTimeout** / **assertTimeoutPreemptively**
  - **assertTimeout
    - But : vérifier si un test dépasse un temps imparti mais ne l'interrompt pas
  - **assertTimeoutPreemptively**
    - But : vérifier si un test dépasse un temps imparti et l'interrompt
  - formats - pour assertTimeout et assertTimeoutPreemptively : 
    - assertTimeout(Duration.ofSeconds(1), () -> { ... })
    - assertTimeout(Duration.ofMillis(100), () -> { ... })
    - assertTimeout(Duration.ofNanos(100000000), () -> { ... })
    - assertTimeout(Duration.of(1, ChronoUnit.SECONDS), () -> { ... })
    - assertTimeout(Duration.of(100, ChronoUnit.MILLIS), () -> { ... })
    - assertTimeout(Duration.of(100000000, ChronoUnit.NANOS), () -> { ... })
- **assertIterableEquals**
  - But : comparer 2 itérables
- fail
  - But : forcer un test à échouer

## Assomptions

- **assumeFalse** / **assumeTrue**
  - But : vérifier une condition
  - Ne retourne rien
  - Arrête et annule le test si la condition est fausse
  - 1 paramètre minimum :
    - 1er = valeur booléenne - **condition**
  - 2ème paramètre facultatif :
    - message = message
- **assumeingThat**
  - But : vérifier une condition
  - Ne retourne rien
  - Exécute une fonction anonyme que si la condition est vraie
  - 2 paramètres minimum :
    - 1er = valeur booléenne - **condition**
    - 2ème = fonction anonyme - **lambda**
  - 3ème paramètre facultatif :
    - message = message

## L'éxécution conditionnelle

- **@EnabledOnOs** / **@DisabledOnOs**
    - But : Activer ou désactiver un test en fonction de l'OS
  - 1 paramètre minimum :
    - 1er = OS - **OS**
  - 2ème paramètre facultatif :
    - message = message
- **@EnabledOnJre** / **@DisabledOnJre**
    - But : Activer ou désactiver un test en fonction de la version de Java
  - 1 paramètre minimum :
    - 1er = version de Java - **JRE**
  - 2ème paramètre facultatif :
    - message = message
- **@EnabledIfSystemProperty** / **@DisabledIfSystemProperty**
    - But : Activer ou désactiver un test en fonction d'une propriété système
  - 2 paramètres minimum :
    - 1er = nom de la propriété - **name**
    - 2ème = valeur de la propriété - **value**
  - 3ème paramètre facultatif :
    - message = message
- **@EnabledIfEnvironmentVariable** / **@DisabledIfEnvironmentVariable**
    - But : Activer ou désactiver un test en fonction d'une variable d'environnement
  - 2 paramètres minimum :
    - 1er = nom de la variable - **name**
    - 2ème = valeur de la variable - **value**
  - 3ème paramètre facultatif :
    - message = message
- **@EnabledIf** / **@DisabledIf**
    - But : Activer ou désactiver un test en fonction d'une expression
  - 1 paramètre minimum :
    - 1er = expression - **expression**
  - 2ème paramètre facultatif :
    - message = message

## La fabrique de tests

- **@TestFactory**
  - But : créer une fabrique de tests
  - Retourne une liste de tests
  - @BeforeEach / @AfterEach
    - Exécuter seulement une fois avant et après chaque test
  - 1 paramètre minimum :
    - 1er = fonction anonyme - **lambda**
  - 2ème paramètre facultatif :
    - message = message

## Les tests paramétrés

- **@ParameterizedTest**
  - But : créer un test paramétré
  - 1 paramètre minimum :
    - 1er = fonction anonyme - **lambda**
  - 2ème paramètre facultatif :
    - message = message