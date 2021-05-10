
# Data Type

## Data type reserve memory for data. They define two things

+ Size
+ Type

## Datatype in Java

+ byte -> -128 TO 127 (inc)  -> 1 byte
+ short -> -32,768 TO 32,767 (inc)  -> 2 bytes
+ long -> 9,223,372,036,854,775,807 TO 9,223,372,036,854,775,807 (inc) [(2^63) TO (2^63)-1]  -> 8 bytes
+ int -> 2147483647 TO 2147483647 (inc) [(2^31) TO (2^31)-1]  -> 4 bytes
+ float -> 3.40282347x10^(38) TO 1.40239846x10^(-45) (inc)  -> 4 bytes
+ char -> '\u0000' OR 0 TO '\uffff' OR 65,535 (inc)  -> 2 bytes
+ Double -> 1.79769313486x10^(308) TO 4.94065645841x10^(-324) (inc) {default val for decimal values}  -> 8 bytes
+ boolean ->  true OR false  -> 1 bit
    key: (inc: included)

### NOTE

+ In Java, there is no signed, unsigned data type because by default here signed is there
+ Size of data type does not change from one OS to another OS
+ (byte, short, int, long) belongs to integer type
+ (Double) belongs to float type
+ In float, 7 decimal digits after decimal point are displayed
+ In Double, 15 decimal digits after decimal point are displayed
+ (char) belongs to character type
  + In Java, size of char is 2 byte; because of this, it supports large range of characters
  + In Java, we can use 18 international languages because of large range of characters
+ (boolean) belongs to boolean type
  + It is used for storing logical values, i.e. either true or false.
  + Java Boolean datatype takes 0 byte of main memory space because it is implemented with general purpose register
        which allows to store 1 bit of information where (1 for true) and (0 for false)

### Default values of datatypes (category wise)

+ integer === 0
+ float === 0.0
+ character === null
+ boolean === false
