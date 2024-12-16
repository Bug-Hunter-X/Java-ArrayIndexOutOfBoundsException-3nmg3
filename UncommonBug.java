public class UncommonBug {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[5] = 10; // This line causes ArrayIndexOutOfBoundsException
        System.out.println(arr[5]);
    }
}