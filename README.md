
## Note :

1. Is having `static` keyword in the main function, a compulsory thing in JAVA ?
   **`static` is compulsory** in standard Java for the JVM to launch your program using `public static void main(String[] args)`.
   `Why is static required?`
   - **No object exists yet:** When your Java program starts, there is no instance of your class in memory yet. Marking `main` as `static` lets the JVM invoke `YourClass.main(args)` directly on the class without instantiating it first.
   - **Avoids constructor ambiguity:** If `main` weren't `static`, the JVM would have to create an object of your class—which could fail or behave unexpectedly if your class has a private constructor, throws exceptions in its constructor, or requires constructor arguments.
