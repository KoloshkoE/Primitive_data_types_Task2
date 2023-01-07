public class Main {
    public static void main(String[] args) {

        int bonusRub = 100;
        int clientAccount = 120;
        int refill = 1500;

        if (refill >= 1100) {
            clientAccount = clientAccount + refill + (refill / bonusRub);
        } else {
            clientAccount = clientAccount + refill;

        }
        System.out.println("На счету " + clientAccount);


    }
}