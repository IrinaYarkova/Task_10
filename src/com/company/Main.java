package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        System.out.print("Количество строк: ");
        int row = in.nextInt();

        System.out.print("Количество столбцов: ");
        int collum = in.nextInt();

        int array[][] = new int[row][collum];

        System.out.print("Введите элементы массива:\n");
        for (int i = 0; i < row; i++) {
            System.out.println("Строка " + (i+1));
            for(int j = 0; j < collum; j++){
                array[i][j] = in.nextInt();
            }
        }
        System.out.println("Первая строка массива умноженная на 3:");
        for (int i = 0; i < collum; i++) {
            System.out.print(array[0][i]*3 + " ");
        }
        in.close();
    }
}
