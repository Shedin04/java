package com.company; //что-то типа библиотек в си++
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        String first = "Подсчет";
        String two = " среднего";
        String third = " балла";
        String all = first + two + third;
        System.out.println(all + "\n" + "Введите оценки за предмет:");

        int aks = 0, im = 0, lm = 0, okzi = 0, pro = 0, okzi_kr = 0, inft = 0, ptvms = 0, gas = 0;
        boolean check = false;
        Scanner input = new Scanner(System.in);
        while (!check) { // !check это check == false
            System.out.print("АКС: ");
            aks = input.nextInt();
            check = aks <= 100 && aks >= 0;
            if (!check)
                System.out.println("[Ошибка]");
        }
        check = false;
        while (!check) {
            System.out.print("ІМ: ");
            im = input.nextInt();
            check = im <= 100 && im >= 0;
            if (!check)
                System.out.println("[Ошибка]");
        }
        check = false;
        while (!check) {
            System.out.print("ЛМ: ");
            lm = input.nextInt();
            check = lm <= 100 && lm >= 0;
            if (!check)
                System.out.println("[Ошибка]");
        }
        check = false;
        while (!check) {
            System.out.print("ОКЗІ: ");
            okzi = input.nextInt();
            check = okzi <= 100 && okzi >= 0;
            if (!check)
                System.out.println("[Ошибка]");
        }
        check = false;
        while (!check) {
            System.out.print("ПРО: ");
            pro = input.nextInt();
            check = pro <= 100 && pro >= 0;
            if (!check)
                System.out.println("[Ошибка]");
        }
        check = false;
        while (!check) {
            System.out.print("ОКЗІ (кр): ");
            okzi_kr = input.nextInt();
            check = okzi_kr <= 100 && okzi_kr >= 0;
            if (!check)
                System.out.println("[Ошибка]");
        }
        check = false;
        while (!check) {
            System.out.print("ІнфТ: ");
            inft = input.nextInt();
            check = inft <= 100 && inft >= 0;
            if (!check)
                System.out.println("[Ошибка]");
        }
        check = false;
        while (!check) {
            System.out.print("Птмвс: ");
            ptvms = input.nextInt();
            check = ptvms <= 100 && ptvms >= 0;
            if (!check)
                System.out.println("[Ошибка]");
        }
        check = false;
        while (!check) {
            System.out.print("ГАС (def. 60): ");
            gas = input.nextInt();
            check = gas <= 100 && gas >= 60;
            if (!check)
                System.out.println("[Ошибка]");
        }

        System.out.print("Кредиты: по-ум. - '0'; ввести - '1': ");
        int cr = input.nextInt();
        int cr_aks, cr_im, cr_inft, cr_lm, cr_okzi, cr_ptmvs, cr_pro, cr_okzi_kr;
        switch (cr) {
            case 1:
                System.out.println("Введите к-во кредитов:");
                System.out.print("АКС: "); cr_aks = input.nextInt();
                System.out.print("ІМ: "); cr_im = input.nextInt();
                System.out.print("ЛМ: "); cr_lm = input.nextInt();
                System.out.print("ОКЗІ: "); cr_okzi = input.nextInt();
                System.out.print("ПРО: "); cr_pro = input.nextInt();
                System.out.print("ОКЗІ (кр): "); cr_okzi_kr = input.nextInt();
                System.out.print("ІнфТ: "); cr_inft = input.nextInt();
                System.out.print("Птмвс: "); cr_ptmvs = input.nextInt();
                break;
            default:
                cr_aks = 4; cr_im = 2; cr_inft = 4; cr_lm = 5; cr_okzi = 6; cr_ptmvs = 3; cr_pro = 4; cr_okzi_kr = 1;
        }
        float count_cr = cr_aks + cr_im + cr_inft + cr_lm + cr_okzi + cr_ptmvs + cr_pro + cr_okzi_kr;
        System.out.println("Всего кредитов:" + (int)count_cr);
        float rate = ((aks * cr_aks) + (im * cr_im) + (inft * cr_inft) + (lm * cr_lm) + (okzi * cr_okzi) + (ptvms * cr_ptmvs) + (pro * cr_pro) + (okzi_kr * cr_okzi_kr)) / count_cr;
        rate = (rate * 0.9f) + (0.1f * gas);
        System.out.println("Средний балл: " + rate);
    }
}
