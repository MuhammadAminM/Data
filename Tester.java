import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Choose one :\n 1. Student \n 2. Teacher");
        String pilih = input.nextLine();

        if (pilih.equals("1")) {
            System.out.print("Masukkan Nama : ");
            String name = input.nextLine();
            System.out.print("Masukkan Major : ");
            String major = input.nextLine();
            System.out.print("Masukkan Umur : ");
            int age = input.nextInt();
            System.out.print("Masukkan ID : ");
            int id = input.nextInt();
            System.out.print("Masukkan Score : ");
            int score = input.nextInt();
            Student student = new Student(id, name, age, score, major);
            student.print();
        } else if (pilih.equals("2")) {
            System.out.println("Chosse one :\n 1. Full Time \n 2. Part Time");
            String pilih2 = input.nextLine();
            if (pilih2.equals("1")) {
                System.out.print("Masukkan Nama : ");
                String name = input.nextLine();
                System.out.print("Masukkan Subject : ");
                String subject = input.nextLine();
                System.out.print("Masukkan Unit : ");
                String unit = input.nextLine();
                System.out.print("Masukkan Umur : ");
                int age = input.nextInt();
                System.out.print("Masukkan Anual Salary : ");
                int anualSalary = input.nextInt();
                FullTime fullTime = new FullTime(name, age, subject, anualSalary, unit);
                fullTime.print();
            } else if (pilih2.equals("2")) {
                int salary = 20000;
                System.out.print("Masukkan Nama : ");
                String name = input.nextLine();
                System.out.print("Masukkan Subject : ");
                String subject = input.nextLine();
                System.out.print("Masukkan Umur : ");
                int age = input.nextInt();
                System.out.print("Masukkan Hours Worked : ");
                int hoursworked = input.nextInt();
                PartTime partTime = new PartTime(name, age, subject, hoursworked,salary*hoursworked);
                partTime.print();
            }
        }
        input.close();
    }
}
