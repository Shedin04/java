package com.company; //что-то типа библиотек в си++
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        /*byte num_1 = 127;  //-128 -- 127
        short num_2 = 32767;
        int num_3 = 2147483647;
        long num_4 = 9223372036854775807l;
        float num_5 = 3.4E+38f;
        double num_6 = 1.7E+308d;
        boolean num_7 = false;
        char text_1 = 't';*/

        String first = "Подсчет";
        String two = " среднего";
        String third = " балла";
        String all = first + two + third;
        System.out.println(all + "\n" + "Введите оценки за предмет:");

        Scanner input = new Scanner(System.in);
        System.out.print("АКС: ");
        int aks = input.nextInt();
        System.out.print("ІМ: ");
        int im = input.nextInt();
        System.out.print("ЛМ: ");
        int lm = input.nextInt();
        System.out.print("ОКЗІ (ік): ");
        int okzi = input.nextInt();
        System.out.print("Про: ");
        int pro = input.nextInt();
        System.out.print("ОКЗІ (кр): ");
        int okzi_kr = input.nextInt();
        System.out.print("ІнфТ: ");
        int inft = input.nextInt();
        System.out.print("Птмвс: ");
        int ptvms = input.nextInt();
        System.out.print("ГАС (def. 60): ");
        int gas = input.nextInt();

        byte cr_aks = 4, cr_im = 2, cr_inft = 4, cr_lm = 5, cr_okzi = 6, cr_ptmvs = 3, cr_pro = 4, cr_okzi_kr = 1;
        int count_cr = cr_aks + cr_im + cr_inft + cr_lm + cr_okzi + cr_ptmvs + cr_pro + cr_okzi_kr;
        System.out.println("Всего кредитов: " + count_cr);
        float rate = ((aks*cr_aks)+(im*cr_im)+(inft*cr_inft)+(lm*cr_lm)+(okzi*cr_okzi)+(ptvms*cr_ptmvs)+(pro*cr_pro)+(okzi_kr*cr_okzi_kr));
        rate /=count_cr;
        rate = (rate * 0.9f) + (0.1f * gas);
        System.out.println("Средний балл: " + rate);
    }
}
