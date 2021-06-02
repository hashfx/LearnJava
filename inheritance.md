# Inheritance in Java

## The mechanism of getting the data members and methods of base class into derived class is called **Inheritance**

## Syntax

```java
class ChildClassName extends BaseClassName
```

## `extends` is a keyword used for inheriting the features of base class into child class

```java
// inheriting properties of class A into class B
class A{
    // code here
}
class B extends A{
    // code here
}
```

## Multiple inheritance in Java is not allowed

```java
// Multiple inheritance in Java is not allowed
class A{
    // code here
}
class B{
    // code here
}
class C extends A, B{  // !ERROR!
    // code here
}
```

### The above program gives an error because multiple inheritance is not supported

+ ### If you don't want to give the features of BaseClass to the DerivedClass then the definition of the BaseClass must be made as Final. Hence, Final class never participates in Inheritance

```java
final class A{
    // code here
}
class B extends A{
    // code here
}  // Error: final class cannot be inherited
```

+ ### If you don't want to give some of the features to the ChildClass then it should be made `private`

```java
class A{
    private int dataMember;
}
class B extends A{
    // code here
}  // var dataMember of class A can't be accessed by class B, being private
```

### **Note:** For every class of Java, there exists some predefined SuperClass whose name is called `java.lang.object`

+ ### The object class provides the garbage collection facility and many other functions to its sub-classes

```java
class A{
    int a;
    void display(){
        System.out.println("Base Class");
    }
}
class B extends A{
    int b;
    void display1(){
        System.out.println("Derived Class");
        a = 100;
        b = 200;
        System.out.println(a + b));
    }
}
class Demo{
    public static void main(String args[]){
        B obj = new B();
        obj.display();
        obj.display1();
        /* ParentClass can't access ChildClass properties
        A obj = new A();
        obj.display();
        obj.display1();  // Error!
        */
    }
}  // Output: Base Class \n Derive Class \n 300
```
