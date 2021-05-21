
# Java reserved words

<pre>
        keywords                        reserved literals
___________|____________               (true, false, null)
|                       |
Used keywords       unused keywords
                    (goto, const)

</pre>

## Keywords related to data types

+ byte -> -128 TO 127 (inc)
+ int -> 2147483647 TO 2147483647 (inc) [(2^31) TO (2^31)-1]
+ float -> 3.40282347x10^(38) TO 1.40239846x10^(-45) (inc)
+ long -> 9,223,372,036,854,775,807 TO 9,223,372,036,854,775,807 (inc) [(2^63) TO (2^63)-1]
+ char -> '\u0000' OR 0 TO '\uffff' OR 65,535 (inc)
+ Double -> 1.79769313486x10^(308) TO 4.94065645841x10^(-324) (inc) {default val for decimal values}
+ boolean ->  true OR false
+ short -> -32,768 TO 32,767 (inc)

## Keywords related to control structure

+ if
+ else
+ break
+ continue
+ while
+ do
+ for
+ switch
+ case
+ default

## Keywords related to modifiers

+ public
+ private
+ protected
+ abstract
+ final
+ static
+ transient
+ volatile
+ synchronized

## Keywords related to classes

+ class
+ interface
+ enum

## Keywords related to inheritance

+ extends
+ implements

## Keywords related to package

+ package
+ import

## Keywords related to exceptional handelling

+ try
+ catch
+ throw
+ finally

## Keywords related to references

+ this
+ super

### NOTE

#### goto is unused keyword because

+ goto makes program unstructured
+ goto never lets program to stored in cache
+ if goto is used in program then it will not work with cache memory

## Identifiers

### Identifiers are user defined words

+ In Java, Identifiers contain alphabets, digits, and two special char ($, _)
+ Rules for naming identifiers :
  + Class name should start with capital letter (PascalNotation)
    + If class name have multiple words, then separate with capital letters
  + Variable names should start with small letters (var)
    + If variable name has multiple words, then separate with capital letter (varName)
  + Method name should start with small letter
    + If method name has multiple word then separate with capital letters
  + Constant name must be given in capital letters
    + If constant name has multiple word, separate with underscore(_)
