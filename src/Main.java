import Lesson9.BankAccount;

// immutable - неизменяемые данные,
// при создании данных не создаём сеттеры

public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("12-3344");
        System.out.println(acc1.getBalance());
        acc1.credit(1000);
        System.out.println(acc1.getBalance());
        acc1.credit(1500);
        acc1.debit(2000);
    }
}