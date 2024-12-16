public class UncommonBugSolution {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if(0 <= 4 && 4 < arr.length){
            arr[4] = 10; 
        }
        System.out.println(arr[4]); // Accessing a valid element
    }
}
