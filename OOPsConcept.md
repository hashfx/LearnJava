# Encapsulation

## Wrapping of data and methods in a single unit is called **Encapsulation**

```java
class Sample{
    int x = 10;
    int y = 20;
}

class Demo{
    public static void main(String args[]){
        Sample obj = new Sample();
        System.out.println(obj.x);
        System.out.println(obj.y);
    }
}  // output: 10 20
```

### A class is called encapsulated if all the data members are private and setter and getter methods are available for all the data members

```java
class Sample{
    private int x = 10;
    private int y = 20;

    void setX(int a){
        x = a;
    }
    void setY(int b){
        y = b;
    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
}

class Demo{
    public static void main(String args[]){
        Sample obj = new Sample();
        obj.setX(100);
        obj.setY(200);
        System.out.println(obj.getX());
        System.out.println(obj.getY);
        // System.out.println(obj.x);  // would through an error
    }
}  // output: 100 200
```

<!-- Wap to create a class called Student which contain 3 data members {ID, marks, mobile number}. This class must be
encapsulated. -->

# POLYMORPHISM

## writing the method with same name by changing the signature is called method overloading

### Signature means either no of param or types of param or order of param

```java
class Sample{
    void fun1(int a){
        System.out.println("This is fun1");
    }
    void fun1(int a, int b){
        System.out.println("This is fun2");
    }
}

class main{
    public static void main(String args[]){
        sample1 obj = obj.fun1(100);
        sample1 obj = obj.fun1(200, 300);
    }
}
```
