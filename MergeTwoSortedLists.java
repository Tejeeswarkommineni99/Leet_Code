// MergeTwoSortedLists.java

public class MergeTwoSortedLists {
    public static int[] mergeTwoLists(int[] l1, int[] l2) {
        int n1 = l1.length;
        int n2 = l2.length;
        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        // Merge elements of l1 and l2 into merged array while both lists have elements
        while (i < n1 && j < n2) {
            if (l1[i] < l2[j]) {
                merged[k++] = l1[i++];
            } else {
                merged[k++] = l2[j++];
            }
        }

        // Copy remaining elements of l1, if any
        while (i < n1) {
            merged[k++] = l1[i++];
        }

        // Copy remaining elements of l2, if any
        while (j < n2) {
            merged[k++] = l2[j++];
        }

        return merged;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] l1 = {1, 3, 5};
        int[] l2 = {2, 4, 6};

        int[] mergedList = mergeTwoLists(l1, l2);

        System.out.println("Merged List:");
        printArray(mergedList);
    }
}
