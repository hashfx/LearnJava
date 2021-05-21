# Operators in Java

## Types of Operators in Java

+ ### Unary Operator
  + ### Increment Operator
  + ### Decrement Operator
+ ### Arithmetic Operator
+ ### Shift Operator
+ ### Relational Operator
+ ### Bitwise Operator
+ ### Logical Operator
+ ### Ternary Operator
+ ### Assignment Operator

# Operator

| Operator   | Category             | Precedence                              |
|------------|----------------------|-----------------------------------------|
| Unary      | postfix              | expr++ expr--                           |
|            | prefix               | ++expr --expr +expr -expr ~ !           |
| Arithmetic | multiplicative       | * / %                                   |
|            | additive             | + -                                     |
| Shift      | shift                | << >> >>>                               |
| Relational | comparison           | < > <= >= instanceof                    |
|            | equality             | == !=                                   |
| Bitwise    | bitwise AND          | &                                       |
|            | bitwise exclusive OR | ^                                       |
|            | bitwise inclusive OR | \|                                      |
| Logical    | logical AND          | &&                                      |
|            | logical OR           | \|\|                                    |
| Ternary    | ternary              | ? :                                     |
| Assignment | assignment           | = += -= *= /= %= &= ^= \|= <<= >>= >>>= |

## Increment/Decrement Operator

```java
class Demo(){
    public static void main(){
        int x = 10;
        System.out.println(x++);
        System.out.println(++x);
    }
    /* Output:
    10
    12
    */
}
```

## Arithmetic Operators

Arithmetic Operators are:

+ Addition`+`
+ Subtraction `-`
+ Multiplication `*`
+ Division `/`
+ Modulus `%`

```java
class Arithmetic{
    public static void main(){
        int a = 10;
        int b = 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
    /* Output:
    15
    5
    50
    2
    0
    */
}
```

## Relational Operator

### Relational operators are **<, >, <=, >=, !=, instanceOf()**

```java
class Relational{
    public static void main(String [] args){
        int a, b, c;
        a = 10;
        b = 20;
        c = 25; 
        System.out.println(a > b);  // false
        System.out.println(a < b);  // true
        System.out.println(a = b);  // 20
        System.out.println(a != b);  // false
        System.out.println(a <= b);  // true
        System.out.println(a >= b);  // true
    }
}
```

## Logical Operators

```java
class Logical{
    public static void main(String [] args){
    // && operator
    System.out.println((5 > 3) && (8 > 5));  // true
    System.out.println((5 > 3) && (8 < 5));  // false

    // || operator
    System.out.println((5 < 3) || (8 > 5));  // true
    System.out.println((5 > 3) || (8 < 5));  // true
    System.out.println((5 < 3) || (8 < 5));  // false

    // ! operator
    System.out.println(!(5 == 3));  // true
    System.out.println(!(5 > 3));  // false
    }
}
```
