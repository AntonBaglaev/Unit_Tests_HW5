package seminars.five.number;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomNumberModule {

    public int[] generateRandomNumbers(int arraySize) {
        Random random = new Random();
        int[] numbers = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = random.nextInt(100);
        }
        return numbers;
    }

}
