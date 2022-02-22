package com.company;

public class Main {

    public static void main(String[] args) {
        double numbers[] = {0.34, 23.4, 5.2, -13.34, 45.8, 6.78, -1.9, -9.789, 3.5, 7.16,
                54.4, 4.0, -12.12, 8.9, 88.6};
        double numbersAll = 0.0;
        int numbers1 = 0;
        boolean proverka = false;
        for (double num : numbers) {

            if (num < 0) {
                proverka = true;
            } else if (num > 0 && proverka) {
                numbersAll += num;
                numbers1++;
            }
        }
        System.out.println("Среднее арифметическое число = " + numbersAll / numbers1);
        System.out.println("Сортировка чисел------------");
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    double temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
            System.out.println(Arrays. toString(numbers));
        }
    }
}




