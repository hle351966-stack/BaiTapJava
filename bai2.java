public class bai2 {
    public static void tinhMangTong(int[] arr1, int[] arr2) {
        int maxLen = Math.max(arr1.length, arr2.length);
        int[] mangTong = new int[maxLen];

        for (int i = 0; i < maxLen; i++) {
            int val1 = (i < arr1.length) ? arr1[i] : 0;
            int val2 = (i < arr2.length) ? arr2[i] : 0;
            mangTong[i] = val1 + val2;
        }

        System.out.print("Mang tong la: ");
        for (int i = 0; i < maxLen; i++) {
            System.out.print(mangTong[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8, 9};
        tinhMangTong(a, b);
    }
}
