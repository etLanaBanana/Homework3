// Найти сумму всех целых чисел от 100 до 500;
public class Main {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 100; i < 501; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}