package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class MinmaxFinderTest {

    @org.junit.jupiter.api.Test
    void findMinMax() {
        assertAll(
                new Executable() {
					public void execute() throws Throwable {
						assertArrayEquals(new int[]{0, 34}, MinmaxFinder.findMinMax(new int[]{0, 1, 2, 34, 5, 6}));
					}
				},
                new Executable() {
					public void execute() throws Throwable {
						assertArrayEquals(new int[]{1, 10}, MinmaxFinder.findMinMax(new int[]{1, 2, 10, 5, 6}));
					}
				},
                new Executable() {
					public void execute() throws Throwable {
						assertArrayEquals(new int[]{2, 100}, MinmaxFinder.findMinMax(new int[]{ 100, 2, 34, 5, 6}));
					}
				});
    }

    @org.junit.jupiter.api.Test
    void findMinMax2() {
        assertAll(
                new Executable() {
					public void execute() throws Throwable {
						assertEquals("Min is 0 Max is 34", MinmaxFinder.findMinMax2(new int[]{0, 1, 2, 34, 5, 6}));
					}
				},
                new Executable() {
					public void execute() throws Throwable {
						assertEquals("Min is 1 Max is 10", MinmaxFinder.findMinMax2(new int[]{1, 2, 10, 5, 6}));
					}
				},
                new Executable() {
					public void execute() throws Throwable {
						assertEquals("Min is 2 Max is 100", MinmaxFinder.findMinMax2(new int[]{ 100, 2, 34, 5, 6}));
					}
				});
    }
}