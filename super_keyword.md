# `super` keyword

### `super` is a keyword created by JVM and supplied to each and every Java program to differentiate between BaseClass feature and DerivedClass feature

### If BaseClass feature and DerivedClass feature is same, then `super` keyword is used

## `super` at variable level

### If data member of BaseClass and DerivedClass are same then JVM gets an ambiguity. To solve the above problem `super` keyword is used

```java
class A{
    int a;
}
class B extends A{
    int a;
    int b;
    void set(int x, int y){
        // a = x;  // base class variable
        super.a = x;  // parent class variable
        a = y;  // child class variable
    }
    void add(){
        // b = a + a;  // adds the a's of 
        b = super.a + a;  // ParentClassVar + ChildClassVar
        System.out.println(b);
    }
}
class Demo{
    public static void main(String args[]){
        B obj = new B();
        obj.set(100, 200);
        obj.add();
    }
}
```

<!-- todo super keyword at method level -->
