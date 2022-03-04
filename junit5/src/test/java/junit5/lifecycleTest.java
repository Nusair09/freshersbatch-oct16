/**
 * 
 */
package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class lifecycleTest {
	 int a = 20;
	    int b = 30;
	    @BeforeAll
	    static void printd(){
	        System.out.println("Started Testing");
	    }
	    @AfterEach
	    void printc(){
	        System.out.println("Test case completed");
	    }
	    @AfterAll
	    static void printall(){
	        System.out.println("Finished");
	    }
	    @BeforeEach
	    void setUp() {
	        System.out.println("Executing test class");
	    }
	    @Test
	    void add() {
	        assertEquals(50,lifecycle.add(a,b));
	    }

	    @Test
	    void sub() {
	        assertEquals(-10,lifecycle.sub(a,b));

	    }
	}