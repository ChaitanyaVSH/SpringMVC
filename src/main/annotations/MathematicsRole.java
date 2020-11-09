package main.annotations;

public @interface MathematicsRole {

    String role() default "Arithmetic";
    int numberOfOperations() default 1;
}
