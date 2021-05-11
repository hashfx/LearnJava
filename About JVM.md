# **JVM (Java Virtual MAchine)**

## JVM is responsible for creating `.class` file and converting each byte code instruction in machine language instruction and that can be executed by micro-processor <br>

.JAVA<br>
&nbsp;&nbsp;&nbsp;   |<br>
javac<br>
&nbsp;&nbsp;&nbsp;   |<br>
.class (byte code) <br>
&nbsp;&nbsp;&nbsp;   |<br>
JVM <br>

![](https://imgr.whimsical.com/object/XJ15gXSMAWE8mTSZmuNHs)

+ First, Java program  (`.java`) is converted by `javac` compiler into `.class` file by `javac` compiler which contains byte code instructions. <strong>This Java compiler is outside of JVM</strong>
+ Now this `.class` file is given to JVM.
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
    + // todo
