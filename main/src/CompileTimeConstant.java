public class CompileTimeConstant {

    public static void main(String[] args) {

        // Example 1 ========================================================================================
        int x = 10, a;
        if (x == 10) { // Compiler has no way of knowing that this condition is always TRUE.
            a = 10;
            System.out.println("a: " + a); // VALID.
        }
        System.out.println("a: " + a); // CTE
        // (Compiler identifies an execution path where the variable is accessed without being initialized).
        // Compiler can not make inferences based on results of execution of expressions that are NOT compile time constants.

        // Example 2 ========================================================================================

        final int compileTimeConst = 10; // by using FINAL, this variable is now compile time constant.
        if (compileTimeConst == 10) {
            a = 10;
            System.out.println("a: " + a); // VALID.
        }
        System.out.println("a: " + a); // VALID.

        // Example 3 ========================================================================================

        int var = 10, b;
        if (var == 10) {
            b = 10;
            System.out.println("b: " + b); // VALID.
        } else {
            b = 20;
        }
        System.out.println("b: " + b); // VALID.

        // Example 4 ========================================================================================

        int var2 = 10, c;
        if (var2 == 10) {
            c = 10;
            System.out.println("c: " + c); // VALID.
        }
        if (var2 != 10) {
            c = 20;
        }
        System.out.println("c: " + c); // NOT VALID : Same problem as Ex.1
    }
}