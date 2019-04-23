import java.util.Scanner;

/**
 * GC-content is an important feature of the genome sequences and is defined as the percentage ratio of the sum of all guanines and cytosines to the overall number of nucleic bases in the genome sequence.
 * Write a program, which calculates the percentage of G characters (guanine) and C characters (cytosine) in the entered string. Your program should be case independent.
 *
 * For example, in the string "acggtgttat" the percentage of characters G and C equals to
 * 4
 * 10
 * ⋅
 * 100
 * =
 * 40.0
 * 10
 * 4
 * ​
 *  ⋅100=40.0, where 4 is the number of symbols G and C, and 10 is the length of the string.
 *
 * Note, answer should be double.
 *
 * int i = …, j = …;
 * double result = i / j; // not correct
 * double result = (double) i / j // correct
 * Remember: characters are case-insensitive(g equals G and c equals C)﻿
 *
 * Input data format
 *
 * The single input line contains a sequence.
 *
 * Output data format
 *
 * The percentage of G an C characters as a double. Do not round/format the value, output it as is.
 *
 * Sample Input 1:
 * acggtgttat
 * Sample Output 1:
 * 40.0
 */
public class ThePercentageOfGAndCCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0;
        for (char ch : str.toUpperCase().toCharArray()){
            if((ch == 'C') || (ch == 'G')){
                count++;
            }
        }
        System.out.println(100 * (double)count/str.length());
    }
}
