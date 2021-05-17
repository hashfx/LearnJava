# First Program in Java (Hello, Java!)

```java
// To import everything from package directory-[java >> lang ]
import java.lang.*;  
// class name same as that of .java file
class HelloJava{  
    // main method
    public static void main(String args[]){
        System.out.println("Hello, Java!");
    }
}
```

## Import Statement

### If programmer wants to use any pre-defined class than it should be imported in the program through *import* statement

### Import statement makes the JVM go to the Java Standard Library, execute the code there and substitute the result ito the program

### In this process, no code was copied into source program; hence no wastage of memory and processor time

```powershell
"""
 To run Program from CLI
 [In: Input] :: [op: Output]
"""
[In]    javac HelloJava.java
[In]    java HelloJava.java
[op]    Hello Java
```

## class

### `class` is a keyword which is used for creating user defined datatype. Each and every java program starts its execution from `main()`

### public

+ Since `main()` method can be accessed by every java programme, hence its access specifier must be `public`

### static

+ Since `main()` method is executing only once throughout the life of entire java program and it is not called with any object hence nature of `main()` is static

### void

+ `main()` method doesn't return anything value hence its datatype is `void`

## String args[ ]

### `String` is a class and each and every `main()` method of java takes **array of objects of String class**

## println( )

### `println()` is a predefined method present in predefined class called **PrintStream** class

+ To access `println()` method, we require an object of **PrintStream** class.

+ An object of **PrintStream** class called **`out`** is created by **SunMicro System** in an another predefined class called **`System`** as a static data member.

+ Hence, to access **`println()`** and **`print()`** method, **`System`** class is used

+ In **`System.out.println()`** : **System** is **class**; **out** is **object**; **println()** is method

+ **_`static`_** **`public void main (String args[]){}`** is same as **_`public`_** **`static void main(){}`**

+ **`String args[]`** is same as **`String something_else[]`**


## Programme to display value of a variable

```java
class Display{
    public static void main(String args[]){
        int a = 100;
        System.out.println("Value of a is: " + a);
    }
}
```

### Output

```powershell
Value of a is: 100
```

## Programme to display sum of two numbers

```java
class Sum{
    public static void main(String args[]){
        int a = 10;
        int b = 80;
        int c = a + b;
        System.out.println("Sum of" + a "and" + b + "is" + c);
    }
}
```

### Output

```powershell
Sum of 10 and 80 is 90
```

### Out of the following classes, the same class will run in the name of which the program has been saved

```java
class One{
    public static void main(){
        class Two{
            public static void main(){
                // code here
            }
        }
    }
}
```

### A programme can not have Two main( ) methods in single main class

```java
class Test{
    public static void main(){
        System.out.println("First main method");
    }
    public static void main(){
        System.out.println("Second main method");
    }
}
```

### Class is a collection of data member and methods

```java
class First{
    int a, b, c;
    void accept(){
        a = 100;
        b = 900;
    }
    void sum(){
        c = a + b;
    }
    void display(){
        System.out.println("Sum is " + c);
    }
}

class Demo{
    public static void main(String args[]){
        First obj1 = new First();
        obj.accept();
        obj.sum();
        obj.display();
    }
}

```
