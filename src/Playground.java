public class Playground {
    public static void main(String[] args) {
        final String A;
        A = "a";
        String a = A;
        System.out.println(a);
        System.out.println(A);
        System.out.println(a == A);
        a = "b";
        System.out.println(a);
        System.out.println(A);
        System.out.println(a == A);
        final StringBuilder builder = new StringBuilder();
    }
}