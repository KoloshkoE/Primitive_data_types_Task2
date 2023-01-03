public class Main {
    public static void main(String[] args) {

        int bonus_rub = 100;
        int client_account = 120;
        int refill = 1500;

        if (refill >= 1100) {
            client_account = client_account + refill + (refill / bonus_rub);
        } else {
            client_account = client_account + refill;

        }
        System.out.println("На счету " + client_account);


    }
}