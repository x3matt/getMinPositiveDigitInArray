import java.util.Arrays;

public class Controller {
    int getMinPositiveDigitInArray(int[] array){
        int[] positiveDigits = Arrays.stream(array).filter(i -> i > 0).toArray();
        Arrays.sort(positiveDigits);
        return positiveDigits[0];
    }
}
