package atm;

public class DefaultTray implements Tray {
    private int bill;
    private Tray nextTray;

    public DefaultTray(int bill) {
        this.bill = bill;
    }

    public void process(int amount) {

        if (nextTray != null) {
            nextTray.process(remainderAfterProcessing(amount));
        } else if (nextTray == null && remainderAfterProcessing(amount) > 0) {
            throw new IllegalArgumentException();
        }
        System.out.println("Extracting " + amount / bill + " with amount of " + bill);

    }

    private int remainderAfterProcessing(int amount) {
        return amount % bill;
    }

    public void setNext(Tray tray) {
        this.nextTray = tray;
    }
}
