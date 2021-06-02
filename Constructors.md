# Constructor

## A constructor is a special method which is automatically called by jvm whenever object is created

+ ### Constructor name is same as class name and it should not return any value

+ ### It cannot be static

+ ### constructor may or may not be private

## Types of constructor
  + ## Default Constructor
  + ## Parametrized Constructor

## Default constructor
  + ### There are 2 types of default constructor:
    + ## System-defined default constructor
      + ### Whenever we are not creating any constructor in the class, then system will define a constructor called: System-defined defined constructor
    + ## User-defined default constructor
      + ### A constructor without any parameter is called User-defined default constructor

```java
/*Without constructor:System-defined def cons*/
class Sample{
    int a, b;
    void accept(){
        a = 100;
        b = 200;
    }
    void display(){
        System.out.println("Value of a: " + a + " Value of b: " + b);
    }
}
class Demo{
    public static void main(String args[]){
        Sample obj = new Sample
        obj.accept()
        obj.display()  // Value of a: 100 Value of b: 200
    }
}
```

```java
/*With constructor:User-defined def cons*/
class Sample{
    int a, b;
    Sample(){
        a = 100;
        b = 200;
    }
    void display(){
        System.out.println("Value of a: " + a + " Value of b: " + b);
    }
}
class Demo{
    public static void main(String args[]){
        Sample obj = new Sample
        obj.accept()
        obj.display()  // Value of a: 100 Value of b: 200
    }
}

```

```java
/*Idea.Definition: None*/
class Demo{
    public static void main(){
        sample obj1 = new sample
        sample obj2 = new sample
        sample obj3 = new sample
        obj1.display()
        obj2.display()
        obj3.display()
}
}
```

+ ## Parametrized constructor

  + ### A constructor is said to be Parametrized Constructor if it takes arguments or parameters

```java
class Sample{
    int a, b;
    Sample(int x, int y){  // constructor
        a = x;
        b = y;
    }
    void display(){
        System.out.println("Value of a: " + a + " Value of b: " + b);
    }
}
class Demo{
    public static void main(String args[]){
        Sample obj1 = new Sample(100, 200)  // object
        Sample obj2 = new Sample(10, 20)  // object
        // Sample obj3 = new Sample()  // without parameter: error
        obj1.display();
        obj2.display();

    }
}
```

## Can we overload constructor 🤔

### Constructor is said to be overloaded if Constructor name is same but signature is different

<!-- Assignment: write a program to create a class called BCA which contain 4 constructor: 
default, single param, two param, 3 param -->

  + ## Object Constructor

    + ### A constructor is said to be object parameter iff it takes object as a parameter

    + ### The purpose of this constructor is to copy content of one source object into another destination object

```java
class Sample{
    int a, b;
    Sample(int x, int y){  // constructor
        a = x;
        b = y;
        System.out.println("Object Parametrized Constructor called!");
    }
    Sample(Sample z){
        a = za;
        b = zb;
        System.out.println("Object Parameter");
    }
    void display(){
        System.out.println(a + " and " + b);
    }
}
class Demo{
    public static void main(String args[]){
        Sample obj = new Sample(10, 20);
        Sample obj2 = new Sample(obj);
        obj.display();
        obj2.display();
    }
}
```
