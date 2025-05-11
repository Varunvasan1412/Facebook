import java.util.*;

public static void Search(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int p = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
    }
    int[] b = new int[s];
    for (int i = 0; i < s; i++) {
        b[i] = sc.nextInt();
    }
    int[] c = new int[n + s];
    for (int i = 0; i < n; i++) {
        c[i] = a[i];
    }
    for (int i = n; i < n + s; i++) {
        c[i] = b[i - n];
    }
    Arrays.sort(c);