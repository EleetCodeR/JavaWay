public class CompileTimeConstant {
    static  int staticVariable;
    int instanceVariable;
    public static void main(String[] args) {
        int x;
        int a, b, c;
        String str1, str2;
        Object obj = null;

        int m = 20;
        int n = m = 10;

        int p, q = 10, r;

        System.out.println("x: " + x); // CTE variable uses without initialization.

        System.out.println("instanceVariable: " + new CompileTimeConstant().instanceVariable);
        System.out.println("staticVariable: " + staticVariable);


        x = 10;
        if (x == 10) { // Compiler has no way of knowing that this condition is always TRUE.
            a = 10;
            System.out.println("a: " + a); // VALID.
        }
        System.out.println("a: " + a); // CTE
        // (Compiler identifies an execution path where the variable is accessed without being initialized).

        final int compileTimeConst = 10; // by using FINAL this is now constant.
        if (compileTimeConst == 10) { // Compiler has no way of knowing that this condition is always TRUE.
            a = 10;
            System.out.println("a: " + a); // VALID.
        }
        System.out.println("a: " + a); // NOW VALID.

    }
}