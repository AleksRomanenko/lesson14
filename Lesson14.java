package ru.geekbrains.ru;

public class Lesson14 {

    public static int[] after4(int[] arr) {
        if (arr.length > 1) {
            int last4index = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 4)
                    last4index = i;
            }
            if (last4index == -1) {
                throw new RuntimeException("Отсутствует число 4");
            } else {
                int[] after4array = new int[arr.length - last4index - 1];
                for (int i = 0; i < after4array.length; i++) {
                    after4array[i] = arr[last4index + 1 + i];
                }
                return after4array;
            }
        } else {
            System.out.println("Нет данных для обработки");
            return arr;
        }
    }

    public static boolean isNum1and4(int[] arr) {
        int count1 = 0, count4 = 0;
        for (int a : arr) {
            if (a == 1)
                count1++;
            else if (a == 4)
                count4++;
            else return false;
        }
        return count1 != 0 && count4 != 0;
    }

    public static void main(String[] args) {
    }
}


