package org.example;

import org.example.container.AmountNumbersContainer;
import org.example.container.RangeNumberContainer;
import org.example.utils.BubbleSorter;
import org.example.utils.NumbersFileWrite;
import org.example.utils.RandomMachineGenerator;

import java.io.IOException;

public class Menu {
    private RangeNumberContainer rangeNumberContainer = new RangeNumberContainer();
    private AmountNumbersContainer amountNumbersContainer = new AmountNumbersContainer();
    private RandomMachineGenerator randomMachineGenerator = new RandomMachineGenerator();
    private BubbleSorter bubbleSorter = new BubbleSorter();
    private NumbersFileWrite numbersFileWrite = new NumbersFileWrite();

    public void runLotto() throws InterruptedException, IOException {
        System.out.print("Enter the range from which I should draw the numbers: ");
        rangeNumberContainer.obtainRangeNumber();
        System.out.print("Enter how many numbers should I draw: ");
        amountNumbersContainer.obtainAmountNumber();
        while (rangeNumberContainer.getRangeNumber() < amountNumbersContainer.getAmountNumber()) {
            System.out.println("The number of random numbers cannot exceed the range!");
            amountNumbersContainer.resetAmountNumber();
            amountNumbersContainer.obtainAmountNumber();

        }
        int[] numbers = randomMachineGenerator.generateRandomNumbers(rangeNumberContainer.getRangeNumber(), amountNumbersContainer.getAmountNumber());
        showResult(numbers);
        numbersFileWrite.writeToFile(numbers);
        int[] sortedNumbersTable = bubbleSorter.bubbleSort(numbers);
        showSortedResult(sortedNumbersTable);
    }
    public void showResult(int[] numbers) throws InterruptedException {
        System.out.println("Warning...Warning...lottery..drawing..is..started " + amountNumbersContainer.getAmountNumber() + "..numbers..from.." + rangeNumberContainer.getRangeNumber() + "..");
        System.out.println("The drawn numbers are: ");
        for (Number number : numbers) {
            System.out.println(number);
            Thread.sleep(1000);
        }
    }
    public void showSortedResult(int[] numbersTable){
        System.out.println("Sorted table: ");
        for (Number number : numbersTable) System.out.print(number + " ");
    }
}
