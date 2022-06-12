package org.example.utils;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class NumbersFileWrite {
    public void writeToFile(int[] numbers) throws IOException {
        PrintWriter printWriter = new PrintWriter("Draw.txt");
        for (int number : numbers) {
            printWriter.write(Arrays.toString(new int[]{number}));
        }
        printWriter.close();
    }
}
