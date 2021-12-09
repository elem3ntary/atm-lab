package atm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {
    private ATM atm;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        atm = new ATM();
    }

    @Test
    void processWithSumNotDividableBy5() {
        assertThrows(IllegalArgumentException.class, () -> atm.process(126));

    }
    @Test
    void processWithSumDividableBy5() {
        assertDoesNotThrow(() -> atm.process(125));

    }
}