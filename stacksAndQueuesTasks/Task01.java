package stacksAndQueuesTasks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .forEach(numbers::push);

        while (!numbers.isEmpty()){
            System.out.print(numbers.pop() + " ");
        }
    }
}
