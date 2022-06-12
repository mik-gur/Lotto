package org.example.utils;

import java.util.Random;

public class RandomMachineGenerator {
    private Random random = new Random();
    private Integer randomNumber;

    public int[] generateRandomNumbers(Integer rangeNumber, Integer amountNumbers) throws InterruptedException{
        int[] numbers = new int[amountNumbers];
        for(int i = 0; i < amountNumbers; i++) {
            randomNumber = random.nextInt(1, rangeNumber + 1);
            for (int x = 0; x < i; x++) {
                if (numbers[x] == (randomNumber)) {
                    randomNumber = random.nextInt(1, rangeNumber + 1);
                    x = -1;
                }
            }
            numbers[i] = randomNumber;
        }
        return numbers;
    }
}
