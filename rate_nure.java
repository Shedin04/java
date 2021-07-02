package com.company; //что-то типа библиотек в си++
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Расчет среднего балла");
        System.out.print("- Введите к-во предметов: ");
        int count = input.nextInt();
        boolean check;

        int[] sub_rate = new int[count];
        int[] sub_cr = new int[count];
        int[] sub_mult = new int[count];
        String[] sub_name = new String[256];

        System.out.println("Введите названия: ");
        sub_name = name(count);

        System.out.println("Введите оценки и кредиты [Предмет - 100 3]: ");
        for (int i = 0; i < count; i++) {
            check = false;
            while (!check) { // !check это check == false
                System.out.print(sub_name[i] + " - ");
                sub_rate[i] = input.nextInt();
                sub_cr[i] = input.nextInt();
                check = sub_rate[i] <= 100 && sub_rate[i] >= 0 && sub_cr[i] > 0;
                if (!check)
                    System.out.println("[Ошибка]");
            }
        }
            check = false;
            int gas = 0;
            System.out.print("Есть доп. баллы? [0-нет; 1-есть]: ");
            int dop = input.nextInt();
            switch (dop) {
                case 1:
                    while (!check) {
                        System.out.print("Введите к-во доп. баллов [1-40]: ");
                        gas = input.nextInt();
                        check = gas <= 40 && gas > 0;
                    }
                    break;
                default:
            }
        gas += 60;

        float count_cr = 0;
            float mult = 0;
        for (int i = 0; i < count; i++)
        {
            sub_mult[i] = sub_rate[i]*sub_cr[i];
            count_cr += sub_cr[i];
            mult += sub_mult[i];
        }
        float result = (mult/count_cr) * 0.9f + (gas*0.1f);
        System.out.print("Средняя оценка: " + result);
    }

        public static String[] name(int n) { // метод ввода предметов
        Scanner text = new Scanner(System.in);
        String[] name_sub = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Предмет [" + (i+1) + "] - ");
            name_sub[i] = text.nextLine();
        }
            return name_sub;
        }
}
