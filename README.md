# SE2A4 | Semestre n°8 - Conception & modélisation objet

## Auteur

Kevin Doolaeghe

## Résumé de cours

### Objet :
Un objet est une entité qui contient :
* un état (variables d'instance)
* un comportement (méthodes)
* une identité

Le receveur est l'objet qui exécute le comportement.

Des objets peuvent être comparés :
- `==` : Comparaison des états
- `equals()` : Comparaison des objets

Un objet peut être instancié grâce à l'opérateur `new` :
```java
Rectangle rectangle = new Rectangle(10, 20);
```

### Message :
Un objet collabore avec d'autres entités au travers de messages.  
Un message est un échange entre deux objets.  
Il peut s'agir du lancement du comportement d'un objet depuis un autre objet.  
Le lookup de la méthode appelée s'effectue depuis la classe actuelle vers les super-classes.  
Un objet appelant une méthode avec :
* `this` commence le lookup depuis sa classe.
* `super` commence le lookup depuis sa super-classe.

### Classe :
La classe définit la structure de l'objet (variables et méthodes).  
Elle permet de créer des instances d'ojets.  
Chaque instance est une identité distincte.

Une classe contient un **constructeur** et un **destructeur** pour respectivement initialiser et finaliser l'objet :
* le constructeur est une méthode qui possède le même nom que la classe.
* le destructeur en `java` est la méthode `finalize()`.

Le mot clef `this` permet d'accéder aux variables et aux méthodes de la classe actuelle.

Les variables et les méthodes peuvent être définies statiques grâce au mot clef `static`.  
Une caractéristique statique est déclarée une seule fois et est commune à toutes les instances de la classe. 

```java
class Rectangle {
    /* States */
    int width;
    int height;
    
    /* Constructor */
    void Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /* Methods */
    int calculArea() { /* ... */ }
}
```

### Encapsulation :
Définition des accès aux données (public, private, protected).  
L'accès par défaut est défini dans le cas où aucun type d'accès n'est spécifié.  
Les accesseurs (**getters** & **setters**) sont utilisés pour intéragir avec les états.

```java
class Rectangle {
    /* States */
    private int width;
    private int height;
    
    /* Constructor */
    public void Rectangle(int width, int height) { /* ... */ }

    /* Methods */
    protected int calculArea() { /* ... */ }

    /* Gettters */
    protected int getWidth() { /* ... */ }
    protected int getHeight() { /* ... */ }

    /* Setters */
    protected void setWidth(int width) { /* ... */ }
    protected void getHeight(int height) { /* ... */ }
}
```

### Polymorphisme :
Des objets de nature différente peuvent répondre aux mêmes comportements.

### Héritage :
L'héritage permet à une classe de récupérer toutes les caractéristiques d'une autre classe.  
La classe qui hérite n'a accès qu'aux états & comportements encapsulés avec les accès `public` et `protected`.  
La classe et ses super-classes forment une hierarchie (un arbre) de classes.

La super-classe de toutes les classes est la classe `Object`.
* Les sous-classes de la classe `Object` sont une spécialisation (ou implémentation) de cette classe.
* Une classe mère est une généralisation (ou abstraction, inclusion) de la classe enfant.

Le mot clef `super` permet l'accès aux caractéristiques de la super-classe.
La méthode `super()` permet d'appeler le constructeur de la super-classe.  

```java
class Square extends Rectangle {
    // Inherits width and height states
    
    public void Square(int width, int height) {
        super(width, height);
    }

    // Inherits calculArea() method

    // Inherits getters & setters
}
```

### Redéfinition :
Une méthode peut être redéfinie et avoir des paramètres différents :
```java
class Rectangle {
    private int width;
    private int height;

    public void Rectangle() { }

    public void Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // ...
}
```

### Classes abstraites :
Une classe abstraite défini les comportements que devront implémenter les classes qui dériveront de cette classe :
```java
public abstract class A { 
    
    public abstract void sayHello();
    
}
```

Pour dériver d'une classe abstraite, il faut utiliser le code ci-dessous :
```java
public abstract class B extends A { 
    
    public void sayHello() {
        // ...
    };
    
}
```

## Java Virtual Machine - JVM :
Le code Java est compilé en bytecode.
La JVM est une infrastructure d'exécution des programmes Java.

La JVM fournit des abstractions pour effectuer l'accès au fichiers, aux E/S, au réseau..  

## Spécificités Java

### 1. Variables :
Les types primitifs ne sont pas des objets :
* boolean
* char
* byte
* short
* int
* long
* float
* double

Les types primitifs ont des classes Wrapper auquelles ils sont associés.  
Par exemple, la classe Wrapper du type `double` est la classe `Double`.

Une variable statique est accessible de partout selon le scope défini.

Les variables globales sont définies par :
```java
private static int gInteger;
```

Les constantes sont définies par :
```java
private static final int INTEGER;
```

Les tableaux sont instanciés dynamiquement :
```java
int[] t1 = new int[10];
float[][] t2 = new int[5][];
```

Dans le code précédent, la variable `t2` est un tableau de 5 colonnes avec des lignes allouées dynamiquement plus tard.

Depuis Java 5, il est possible de faire un `foreach` :
```java
for (char c : str) { /* ... */ }
```

Les chaines de caractères sont aussi des objets du type `String` ou `StringBuffer`.  
Il est possible de concaténer les chaines de caractères à l'aide de l'opérateur `+` :
```java
int nb = 4;
String str = "nb = " + nb;
```

### 2. Méthodes :
Les méthodes peuvent aussi être définies comme statiques :
```java
private static void function() { /* ... */ }
```

### 3. E/S
Les flux d'E/S standards sont `in`, `out` et `err` et sont inclus dans la classe `System`.

Ainsi, pour imprimer des messages sur la console (sortie standard `out`), il faut faire :
```java
System.out.println("Hello World !");
```

Pour lire sur l'entrée standard `in`, il faut utiliser la classe `Scanner` :
```java
Scanner s = new Scanner(System.in);
int nb = s.nextInt();
```

### 4. Structures de contrôle
* Condition `if` :
```java
int i = 4;
if (i < 4) {
    // ...
} else if (i == 4)
    // ...
else {
    // ...
}
```

* Boucle `for` :
```java
int i;
for (i = 0; i < 10; i++) {
    // ...
}
```

* Boucle `while` :
```java
int i = 2;
while (i <= 9) {
    // ...
}
```

* Boucle `do... while` :
```java
int i = 2;
do {
    // ...
} while (i != 12);
```

## Test Driven Development - TDD :
Il s'agit d'une technique de développement consistant à développer les fonctionnalités à partir des tests à effectuer.