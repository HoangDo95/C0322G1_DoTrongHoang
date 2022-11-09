package bai_thi.ten_bai_lam.service.Impl;

import bai_thi.ten_bai_lam.service.Service1;

import java.util.Scanner;

public class Impl1 implements Service1 {
    public static Scanner scanner = new Scanner(System.in);
//  public static List<Student> studentList = new ArrayList<>();
//  final String PATH_STU = "src/giai_de/school/data/student.csv";


    @Override
    public void display() { //Double.parseDouble(item[1])
//        List<String[]> list = ReadAndWrite.readToFile(PATH_STU);
//        studentList.clear();
//        for (String[] item : list) {
//            Student student = new Student(Integer.parseInt(item[0]),
                                                //            item[1],
                                                //            item[2],
                                                //            item[3],
                                                //            item[4],
                                                //            item[5],
                                                //            item[6]);
//            studentList.add(student);
//        }
//        for (Student item : studentList) {
//            System.out.println(item);
//        }
    }

    @Override
    public void add() {
//        List<String[]> list = ReadAndWrite.readToFile(PATH_STU);
//        studentList.clear();
//        for (String[] item : list) {
//            Student student = new Student(Integer.parseInt(item[0]),
        //            item[1],
        //            item[2],
        //            item[3],
        //            item[4],
        //            item[5],
        //            item[6]);
//            studentList.add(student);

//        int count;
//        int max = 0;
//        if (studentList.isEmpty()) {
//            count = 1;
//        } else {
//            for (Student item : studentList) {
//                if (item.getId() > max) {
//                    max = item.getId();
//                }
//            }
//            count = max + 1;
//        }
//        System.out.println("Nhập tên: ");
//        String name = scanner.nextLine();
//
//        System.out.println("Nhập giới tính: ");
//        String gender = scanner.nextLine();
//
//        System.out.println("Nhập ngày sinh: ");
//        String dayOfBirth = RegexException.inputDayOfBirth();
//
//        System.out.println("Nhập địa chỉ: ");
//        String address = scanner.nextLine();
//
//        System.out.println("Nhập mã học sinh: ");
//        String studentCode = RegexException.inputNumber();
//
//        System.out.println("Nhập điểm : ");
//        String points = scanner.nextLine();
//
//        Student student = new Student(count, name, gender, dayOfBirth, address, studentCode, points);
//        studentList.add(student);
//
//        String str = "";
//        for (Student item : studentList) {
//            str += item.getInfo() + "\n";
//        }
//        ReadAndWriteFile.writeToFile(PATH_STU, str);

    }

    @Override
    public void edit() {
        //        List<String[]> list = ReadAndWrite.readToFile(PATH_STU);
//        studentList.clear();
//        for (String[] item : list) {
//            Student student = new Student(Integer.parseInt(item[0]),
        //            item[1],
        //            item[2],
        //            item[3],
        //            item[4],
        //            item[5],
        //            item[6]);
//            studentList.add(student);

//        System.out.println("Nhập vị trí id cần update: ");
//        int inputId = Integer.parseInt(scanner.nextLine());
//        for (int i = 0; i < studentList.size(); i++) {
//            if (studentList.get(i).getId() == inputId) {
//
//                System.out.println("Nhập tên: ");
//                String name = scanner.nextLine();
//
//                System.out.println("Nhập giới tính: ");
//                String gender = scanner.nextLine();
//
//                System.out.println("Nhập ngày sinh: ");
//                String dayOfBirth = RegexException.inputDayOfBirth();
//
//                System.out.println("Nhập địa chỉ: ");
//                String address = scanner.nextLine();
//
//                System.out.println("Nhập mã học sinh: ");
//                String studentCode = RegexException.inputNumber();
//
//                System.out.println("Nhập điểm : ");
//                String points = scanner.nextLine();
//
//                studentList.get(i).setId(inputId);
//                studentList.get(i).setName(name);
//                studentList.get(i).setGender(gender);
//                studentList.get(i).setDayOfBirth(dayOfBirth);
//                studentList.get(i).setAddress(address);
//                studentList.get(i).setStudentCode(studentCode);
//                studentList.get(i).setPoints(points);
//            }
//        }
//        String str = "";
//        for (Student item : studentList) {
//            str += item.getInfo() + "\n";
//        }
//        ReadAndWriteFile.writeToFile(PATH_STU, str);

    }

    @Override
    public void delete() {
        //        List<String[]> list = ReadAndWrite.readToFile(PATH_STU);
//        studentList.clear();
//        for (String[] item : list) {
//            Student student = new Student(Integer.parseInt(item[0]),
        //            item[1],
        //            item[2],
        //            item[3],
        //            item[4],
        //            item[5],
        //            item[6]);
//            studentList.add(student);

//        System.out.println("Nhập id muốn xóa: ");
//        int inputId = Integer.parseInt(scanner.nextLine());
//        int choose = 0;
//        int count = 0;
//        for (int i = 0; i < studentList.size(); i++) {
//            if (inputId == studentList.get(i).getId()) {
//                System.out.println("Bạn muốn xóa: 1.Yes  2.No");
//                choose = Integer.parseInt(scanner.nextLine());
//                switch (choose) {
//                    case 1:
//                        System.out.println("Yes");
//                        studentList.remove(i);
//                        System.out.println("Delete Done");
//                        String str = "";
//                        for (Student item1 : studentList) {
//                            str += item1.getInfo() + "\n";
//                        }
//                        ReadAndWriteFile.writeToFile(PATH_STU, str);
//                        display();
//                        count++;
//                        break;
//                    case 2:
//                        count++;
//                        break;
//                }
//            }
//        }
//        if (count == 0) {
//            System.out.println("Mã id không tồn tại");
//        }


    }

    @Override
    public void find() {
        //        List<String[]> list = ReadAndWrite.readToFile(PATH_STU);
//        studentList.clear();
//        for (String[] item : list) {
//            Student student = new Student(Integer.parseInt(item[0]),
        //            item[1],
        //            item[2],
        //            item[3],
        //            item[4],
        //            item[5],
        //            item[6]);
//            studentList.add(student);

//        System.out.println("Nhập từ cần tìm: ");
//        String search = scanner.nextLine();
//        boolean check = false;
//        for (int i = 0; i < managementList.size(); i++) {
//            if (managementList.get(i).getName().contains(search)) {
//                System.out.println(managementList.get(i));
//                check = true;
//            } else {
//                check = false;
//            }
//
//        }
//        if (check == false) {
//            System.out.println("Không thấy tên cần tìm");
//        }
//    }

    }

    @Override
    public void sort() {
        //        List<String[]> list = ReadAndWrite.readToFile(PATH_STU);
//        studentList.clear();
//        for (String[] item : list) {
//            Student student = new Student(Integer.parseInt(item[0]),
        //            item[1],
        //            item[2],
        //            item[3],
        //            item[4],
        //            item[5],
        //            item[6]);
//            studentList.add(student);

//        Collections.sort(studentList, new NameComparator());
//        for (Student item : studentList) {
//            System.out.println(item);
//        }

    }

//    public String inputStr(){
//        String check;
//        do{
//            check =  scanner.nextLine();
//            if(check.trim().equals("")){
//                System.out.println("Không được bỏ trống");
//            }else {
//                return check;
//            }
//        }while (true);
//    }
//    public int inputPoint(){
//        int point;
//        do{
//            point =  Integer.parseInt(scanner.nextLine());
//            if(point >= 0 && point <= 10){
//                System.out.println("Điểm số từ 0~10");
//            }else {
//                return point;
//            }
//        }while (true);
//    }
//public String roomType() {
//    String choose;
//    do {
//        System.out.println("1. Presidential 2.Five star 3.Normal");
//        try {
//            choose = scanner.nextLine();
//            switch (choose) {
//                case "1":
//                    return "Presidential";
//                case "2":
//                    return "Five star";
//                case "3":
//                    return "Normal";
//                default:
//                    System.out.println("Nhập 1-3");
//                    roomType();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    } while (true);
//}
}
