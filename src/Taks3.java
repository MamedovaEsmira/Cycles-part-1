public class Taks3 {
    public static void main(String[] args) {
        System.out.println("Задача1");
        int Savings = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + Savings;
            System.out.println("Месяц " + i + ", сумма накоплений равна" + total + " рублей");
        }
            System.out.println("Задача2");
            int Salary = 29000;
            double General =0;
            for (int i = 1; i <= 12; i++) {
                General = General + General / 100;
                General = General + Salary;
                System.out.println("Месяц " + i + ", сумма накоплений равна" + General + " рублей");
            }
        }
    }