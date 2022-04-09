public class Exercise5{
    // ужасное название метода, ну да хуй с ним
    public static String recursion(int a, int b) {
        if (a > b) {
            // а придумай пример, при котором a > b и одновременно a == b
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + recursion(a - 1, b);
        }
        else {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + recursion(a + 1, b);
        }
    }
    public static void main(String[] args) {
        System.out.println(recursion(3, 15));
        System.out.println(recursion(15, 3));
        System.out.println(recursion(3, 3));
    }
}
