package atm;

public class ATM {
    private Tray firstTrayInChain;

    public ATM() {
        Tray tray20 = new Tray20();
        Tray tray10 = new Tray10();
        Tray tray5 = new Tray5();

        tray20.setNext(tray10);
        tray10.setNext(tray5);

        firstTrayInChain = tray20;
    }

    public void process(int amount) {
        firstTrayInChain.process(amount);
    }
}
