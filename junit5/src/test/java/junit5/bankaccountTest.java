package junit5;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class bankaccountTest {

	@Test
	 void Withdraw() throws InsufficientBalanceException {
        assertThrows(InsufficientBalanceException.class,new Executable() {
			public void execute() throws Throwable {
				bankaccount.withdraw(800);
			}
		});
        assertEquals(500, bankaccount.withdraw(100));
        System.out.println(bankaccount.withdraw(100));
    }

}