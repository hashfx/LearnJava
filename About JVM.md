# **JVM (Java Virtual MAchine)**

## JVM is responsible for creating `.class` file and converting each byte code instruction in machine language instruction and that can be executed by micro-processor <br>

.JAVA<br>
&nbsp;&nbsp;&nbsp;   |<br>
javac<br>
&nbsp;&nbsp;&nbsp;   |<br>
.class (byte code) <br>
&nbsp;&nbsp;&nbsp;   |<br>
JVM <br>

![JVM](https://imgr.whimsical.com/object/XJ15gXSMAWE8mTSZmuNHs)

+ First, Java program  (`.java`) is converted by `javac` compiler into `.class` file by `javac` compiler which contains byte code instructions. **This Java compiler is outside of JVM**
+ Now this `.class` file is given to JVM.

+ **Class Loader Subsystem**

  + In JVM, there is a module called **Class Loader Subsystem** which perform following task
    + It loads `.class` file into memory then verifies if all the byte code instructions are proper or not. If it find any instruction suspicious then execution is rejected immediately.
    + If byte code is proper then it allocate the necessary memory to execute the program. This memory is divided into 5 parts called **Run Time Data Areas**

      + **Method area**
        + This area store `class code`, `method code` of the Java program
      + **Heap area:**
        + It stores the object of the program
      + **Java Stack:**
        + While running a method, there is a need of some more memory to store temporary data and result. This memory is allocated in Java Stack
      + **PC Registers**
        + These are the registers which contain memory address of the instructions of the methods
      + **Native Method Stack**
        + All the Native Methods are stored here. Native Methods are those _whose implementation are written in other programming language like C, C++ etc._

+ **Execution Engine**
  + Execution Engine contains Interpreter and JIT Compiler which are responsible for converting the byte code instructions into Machine Code. In Java, Compiler and Interpreter works together. For simple statements Interpreter is used and for looping statement JIT Compiler is used.
  + JIT Compiler is a part of JVM which increase the speed for the execution of Java Program

+ **Garbage Collector**
  + JVM is also capable of deallocating the memory when it is not used.
  + Suppose a variable or an object is created in memory and if it is not used then after sometime it is automatically removed by the **Garbage Collector**.
    + **Garbage Collector** is a form of memory management that checks the memory time-to-time and mark the object which are not used and after sometime it deletes them.
    + Garbage Collector uses **Mark and Sweep Algorithm**.
    + Garbage Collector is automatically called when the program is being run.
    + It can also be called explicitly by **GC Method of RunTime Class** or **System Class** in Java.
