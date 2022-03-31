class linear {
    public static void main(String... args) {
        int arr[] = { 1, 5, 6, 1, 2, 3, 8, 9, 4 };
        int n = arr.length;
        int ele = 80;
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (ele == arr[i]) {
                System.out.println("Element found at position " + (i + 1));
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("Element not found");
        }
    }
}