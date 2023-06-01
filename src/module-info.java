import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        
        List<Integer> randomNumbers = getRandomNumbers(numbers, 5);
        
        System.out.println("Dãy số ngẫu nhiên là:");
        for (int number : randomNumbers) {
            System.out.println(number);
        }
    }
    
    public static List<Integer> getRandomNumbers(List<Integer> numbers, int count) {
        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        
        for (int i = 0; i < count; i++) {
            int index = random.nextInt(numbers.size());
            randomNumbers.add(numbers.get(index));
            numbers.remove(index);
        }
        
        return randomNumbers;
    }
}
