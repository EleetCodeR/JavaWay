public class DeclarationInitialization {
    static  int staticVariable;
    int instanceVariable;
    public static void main(String[] args) {
        int x;
        int a, b, c;
        String str1, str2;


        System.out.println("instanceVariable: " + new DeclarationInitialization().instanceVariable);
        System.out.println("staticVariable: " + staticVariable);

        int m = 20;
        int n = m = 10;

        int p, q = 10, r;

        Object obj = null;
        String str3 = str2 = "initialized";

        // Not Allowed:
        int a = 10, int b = 20; // CTE : only one datatype allowed per statement.
        int q = 10, Object obj = null; // CTE : only one datatype allowed per statement.
        int x = y = 20; // y is undefined.
    }
}
