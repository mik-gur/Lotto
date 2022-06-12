package org.example.utils;

public class BubbleSorter {
    private Integer temp;
    public int[] bubbleSort(int[] numbers){
        for (int i = 0; i < numbers.length - 1; i++){
            for (int j = 0; j < numbers.length - 1; j++){
                if(numbers[j] > numbers[j + 1]){
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }
}
