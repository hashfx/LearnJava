# Abstract class in Java (Abstraction)

+ ### `class` which is declared as Abstract is known as an **Abstract Class**

+ ### It can have abstract and non-abstract methods

+ ### We cannot create object of an Abstract class

```java
abstract class Bike{  // abstract class
    abstract void run();  // abstract method
}

class Hero extends Bike{
    // Error if run() methods is undefined: Hero is not abstract and does not override abstract method run() in Bike
    void run(){
        System.out.println("Run from Hero");
    }
}

class test{
    public static void main(String args[]){
        Hero obj = new Hero();  // object of class Hero created
        obj.run();  // Output : Run from Hero
        /* Bike obj2 = new Bike();  // object of abstract class cannot be created
           obj2.run(); // error: Bike is abstract; cannot be instantiated */
    }
}
```


