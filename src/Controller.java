import java.util.Arrays;

public class Controller {
    int getMinPositiveDigitInArray(int[] array){
        int[] positiveDigits = Arrays.stream(array).filter(i -> i > 0).toArray();
        Arrays.sort(positiveDigits);
        int digit = 1;
        for (int num : positiveDigits) {
            if (digit == num) {digit++;}
            else break;
        }
        return digit;
    }
}
