public class Q4 {
    public static void main(String[] args) {
        int[] a = {1, 2};
        swap(a[0], a[1]);
        System.out.println(a[0] + ", " + a[1]);
    }
    public static void swap(int x, int y) {
        int temp;
        temp = x;
        x = y;
        y = temp;
    }
}

