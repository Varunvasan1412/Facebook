import java.util.*;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
    }
    int[] b = new int[m];
    for (int i = 0; i < m; i++) {
        b[i] = sc.nextInt();
    }
    int[] c = new int[n + m];
    for (int i = 0; i < n; i++) {
        c[i] = a[i];
    }
    for (int i = n; i < n + m; i++) {
        c[i] = b[i - n];
    }
    Arrays.sort(c);
    for (int i = 0; i < n + m; i++) {
        System.out.print(c[i] + " ");
        System.out.println("Messages has been processed by priyanka");
    }
}