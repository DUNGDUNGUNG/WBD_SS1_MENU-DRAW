package draw;

import java.util.Scanner;

public class veHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("1. Ve hinh tam giac");
        System.out.println("2. ve hinh vuong ");
        System.out.println("3. ve hinh chu nhat");
        System.out.println("0. Exit");
        System.out.println("Nhap su lua chon cua ban");
        while (true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int number = 5;
                    while (number >= 1) {
                        for (int i = number; i >= 1; i--) {
                            System.out.print("x ");
                        }
                        System.out.println();
                        number--;
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();

                    }
                    break;
                case 3:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 4; j++) {
                            System.out.print("o ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println(" khong co su lua chon ");
                    break;
            }
        }
    }
}
