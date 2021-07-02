package com.company; //что-то типа библиотек в си++
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner text = new Scanner(System.in);

        System.out.println("Расчет среднего балла");
        System.out.print("- Введите к-во предметов: ");
        int count = input.nextInt();

        Subject[] s = new Subject[count];
        String name; int rate, cred;
        for (int i = 0; i < count; i++) {
            if (i==0) {
                System.out.print("- Предмет " + (i + 1) + " [название]: ");
            }
            else {
                System.out.print("- Предмет " + (i + 1) + ": ");
            }
            name = text.nextLine();
            if (i==0) {
                System.out.print(name + " [оценка, кол. кред.]: ");
            }
            else {
                System.out.print(name + ": ");
            }
            while (true) {
                rate = input.nextInt();
                cred = input.nextInt();
                if (rate<=100 && rate>=0 && cred>=1)
                break;
                else {
                    System.out.print("Ошибка, введите другие значения: ");
                }
            }
            s[i] = new Subject(name, rate, cred);
        }

        System.out.print("- Есть доп. баллы? [0-нет; 1-есть]: ");
        int gas = 0;
        int dop = input.nextInt();
        switch (dop) {
            case 1:
                while (true) {
                    System.out.print("- Введите к-во [1-40]: ");
                    gas = input.nextInt();
                    if (gas <= 40 && gas > 0)
                    break;
                }
                break;
            default:
        }
        gas += 60;

        if (count>=1)
        System.out.println("\n" + "Предмет-" + "Оценка-" + "Кредиты");
        for (int i=0; i<count; i++) {
            System.out.format(s[i].sub_name + " | " + s[i].sub_rate + " | " + s[i].sub_cr + "\n");
        }
        System.out.println("ГАС: " + gas);


        int[] sub_mult = new int[count];
        float count_cr = 0;
        float mult = 0;
        for (int i = 0; i < count; i++)
        {
            sub_mult[i] = s[i].sub_rate*s[i].sub_cr;
            count_cr += s[i].sub_cr;
            mult += sub_mult[i];
        }
        float result = (mult/count_cr) * 0.9f + (gas*0.1f);
        System.out.print("Средняя оценка: " + result);
    }
}
