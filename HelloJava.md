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
