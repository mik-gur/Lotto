package org.example.container;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RangeNumberContainer {
    private Integer rangeNumber;
    private Scanner scanner;
        public void obtainRangeNumber(){
            while(rangeNumber == null || rangeNumber <= 0){
                scanner = new Scanner(System.in);
                try {
                    rangeNumber = scanner.nextInt();
                    if(rangeNumber <= 0)
                        System.out.println("Enter a positive number!");
                } catch (InputMismatchException e) {
                    System.out.println("Enter an integer!");
                }
            }
        }

    public Integer getRangeNumber() {
        return rangeNumber;
    }
}
