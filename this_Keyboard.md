# `this` Keyword

```java
// Programme without this keyword
class Sample{
    int a, b;
    Sample(int a, int b){  // constructor
        a = a;
        b = b;
    }
    void display(){
        System.out.println("a is " + a + " b is " + b);
    }
}
class Demo{
    public static void main(String args[]){
        Sample obj = new Sample(100, 200);  // object of class Sample
        obj.display();
    }  // Output: a is 0 b is 0
}
```

### In the above example, data members of a class are not initialized because the name of local variable and data members are same. To solve the above problem, `this` keyword is used

+ ## `this` is a keyword created by JVM and supplied to each and every java program

+ ## `this` keyword is used to point current class object whenever the formal parameter and data member of the class are same

```java
// Programme with this keyword
class Sample{
    int a, b;
    Sample(int a, int b){  // constructor
        this.a = a;
        this.b = b;
    }
    void display(){
        System.out.println("a is " + a + " b is " + b);
    }
}
class Demo{
    public static void main(String args[]){
        Sample obj = new Sample(100, 200);  // object of class Sample
        obj.display();
    }  // Output: a is 100 b is 200
}
```
