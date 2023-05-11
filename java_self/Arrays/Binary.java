public class Binary {
    public static int func(int number[], int key) {
        int start = 0, end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == number[mid]) {
                return mid;
            }
            if (number[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int number[] = { 2, 4, 6, 8, 10 };
        int key = 9;
        System.out.println("The nmber is found at" + func(number, key));

    }

}
