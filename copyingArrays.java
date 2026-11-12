import java.util.Arrays;

// Copying an array using a for loop.
public class copyingArrays {
    static void main() {
        int[] sourceArray = {2, 3, 1, 5, 10};
        int[] targetArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }
        System.out.println("Original Array: " + Arrays.toString(sourceArray));
        System.out.println("New Array: " + Arrays.toString(targetArray));
        System.out.println();


// Copying an array using the arraycopy method
        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
        System.out.println("Original Array: " + Arrays.toString(sourceArray));
        System.out.println("New Array: " + Arrays.toString(targetArray));
    }
}