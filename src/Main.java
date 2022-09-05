public class Main {
    public static void main(String[] args) {
        int currentAccount = 100;
        int refill = 100;
        int bonus = refill / 100;
        int total;

        if (refill >= 1000) {
            total = currentAccount + bonus + refill;
        } else {
            total = currentAccount + refill;
        }
        System.out.println(total);
    }
}