package assignments;

public class ArraysDouble {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = new int[3];

        for (int i = 0; i < arr1.length; i++) {

            arr2[i] = arr1[i] * 2;
            System.out.print(arr2[i] + "\t");
        }

    }
}
