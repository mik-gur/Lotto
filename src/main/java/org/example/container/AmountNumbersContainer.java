package org.example.container;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AmountNumbersContainer {
    private Integer amountNumber;
    private Scanner scanner = new Scanner(System.in);
        public void obtainAmountNumber(){
            while(amountNumber == null || amountNumber <= 0) {
                scanner = new Scanner(System.in);
                try {
                    amountNumber = scanner.nextInt();
                    if(amountNumber <= 0) {
                        System.out.println("Enter a positive number!");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Enter an integer!");
                }
            }
        }

    public Integer getAmountNumber() {
        return amountNumber;
    }

    public void resetAmountNumber() {
        this.amountNumber = null;
    }
}
