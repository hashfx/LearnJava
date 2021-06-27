# Initialization

## There are 2 types of initialization block

+ ### Instance Initialization Block

  + ### For every object creation **Instance Initialization Block** will be created

```java
class A{
    static int count;
    A(){
        System.out.println("default");
    }
    {
        count++;
        System.out.println("instance block");
    }
    A(int x){
        //
    }
    A(int x, int y){
        //
    }
    void display(){
        System.out.println(count);
    }
}
class Demo{
    public static void main(String args[]){
        A obj = new A();  // default constructor
        A obj2 = new A(100);  // single param
        A obj3 = new A(100, 200);  // double param
        obj3.display();
    }
}
/* Output
instance block
default
instance block
instance block
3
*/
```

### We can have more than one initialization block

+ ### Static Initialization Block

  + ### Whenever class is loaded in memory then static initialization block will be created

  + ### Whenever we call any executable block then class is loaded in memory

```java
class A{
    static int count;
    A(){
        System.out.println("default");
    }
    {
        count++;
        System.out.println("instance block");
    }
    A(int x){
        //
    }
    A(int x, int y){
        //
    }
    static{
        System.out.println("static block");
    }
    // void display(){
    //     System.out.println(count);
    // }
}
class Demo{
    public static void main(String args[]){
        A obj = new A();  // default constructor
        A obj2 = new A(100);  // single param
        // A obj3 = new A(100, 200);  // double param
        // obj3.display();
    }
}
/* Output
static block
instance block
default
instance block
*/
```
