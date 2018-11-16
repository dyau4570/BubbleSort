package DarrenYau;

public class Main {
    public static void main(String[] args) {
        public static void swap(int x, int y) {
            int temp = x;
            x = y;
            y = temp;
        }

        public static void bubbleSort(String[] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; i < arr.length-1; j++) {
                    if (arr[j] > arr[j+1]) {
                        swap(arr[j], arr[j+1]);
                    }
                }
            }
        }
    }
}