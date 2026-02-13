package Arrays.practice;

public class MergeArray {
    public static void main(String[] args) {

        int[] a = {2, 4, 6};
        int[] b = {1, 3, 5};
        int[] c = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        // Merge while both arrays have elements
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        // Copy remaining elements of a[]
        while (i < a.length) {
            c[k++] = a[i++];
        }

        // Copy remaining elements of b[]
        while (j < b.length) {
            c[k++] = b[j++];
        }

        // Print merged array
        for (int x : c) {
            System.out.print(x + " ");
        }
    }
}
