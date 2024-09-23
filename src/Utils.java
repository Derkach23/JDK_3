import java.util.Arrays;

public class Utils {

    public static <T> boolean compareArrays(T[] arr1, T[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        return Arrays.equals(arr1, arr2);
    }
}