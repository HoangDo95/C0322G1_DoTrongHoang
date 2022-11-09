package bai_thi.khung.controller;

import java.util.Scanner;

public class Controller {
    public static Scanner scanner = new Scanner(System.in);

    public static void displayMenu(){
        int choose = 0;
        do {
            System.out.println("-------------Chương trình quản lý bệnh nhân-------------------");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách");
            System.out.println("4. Thoát");
            try {
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Thêm mới: 1.Bệnh nhân thường  2.Bệnh nhân VIP");

                        break;
                    case 2:
                        System.out.println("Xóa: 1.Bệnh nhân thường  2.Bệnh nhân VIP");

                        break;
                    case 3:
                        System.out.println("Xem danh sách: 1.Bệnh nhân thường  2.Bệnh nhân VIP");

                        break;
                    case 4:
                        System.out.println("4. Thoát");
                        System.exit(0);
                    default:
                        System.out.println("Nhập từ 1- 4");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số");
            }
        } while (true);
    }
    public static void display(){
        int choose =0;
        do{
            try {
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("1. Bệnh nhân thường");

                        break;
                    case 2:
                        System.out.println("2. Bệnh nhân Vip");

                    default:
                        System.err.println("Nhập từ 1- 2");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số");
            }
        }while (true);
    }
}

