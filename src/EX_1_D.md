# Write a case study on public static void main(250 words).

## Public:

It is an Access modifier, which specifies from where and who can access the method.
Making the main() method public makes it globally available. It is made public so that
JVM can invoke it from outside the class as it is not present in the current class.

## Static:

- It is a keyword which is when associated with a method, makes it a class related method.
- The main() method is static so that JVM can invoke it without instantiating the class.
- This also saves the unnecessary wastage of memory which would have been used by the object
- declared only for calling the main() method by the JVM.

## Void:

It is a keyword and used to specify that a method doesn’t return anything.
As main() method doesn’t return anything, its return type is void. As soon as the
main() method terminates, the java program terminates too. Hence, it doesn’t make any
sense to return from main() method as JVM can’t do anything with the return value of
it.

## main:

It is the name of Java main method. It is the identifier that the JVM looks f
or as the starting point of the java program. It’s not a keyword.

## String[] args:

It stores Java command line arguments and is an array of type java.
lang.String class. Here, the name of the String array is args but it is not fixed and
user can use any name in place of it.

NOTE: Java does not return int implicitly, even if we declare return type of main as int. We will get compile time error
