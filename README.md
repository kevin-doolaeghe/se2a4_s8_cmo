# SE2A4 | Semestre n°8 - Conception & modélisation objet

## Auteur

Kevin Doolaeghe

## Résumé de cours

### Objet :
Un objet est une entité qui contient :
* un état (variables)
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

### Redéfinition
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
