import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    Account account;


    @BeforeEach
    public void init() {
        account = new Account();
    }


    @Test
    @DisplayName("Se añade un double y funciona")
    public void setBalance_doublePositive_works() {
        account.setBalance(100.0);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    @DisplayName("Se añade un double negativo y lanza excepción")
    public void setBalance_doubleNegative_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> account.setBalance(-100.0));
    }

    //Se añade un cero y funciona
    @Test
    @DisplayName("Se añade un cero y funciona")
    public void setBalance_cero_works() {
        account.setBalance(0.0);
        assertEquals(0.0, account.getBalance());

    }
}
