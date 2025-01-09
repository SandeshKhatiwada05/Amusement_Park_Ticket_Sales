package org.JSP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//This is logical database for RefactoredLogicForTesting.java which is refactored code of the Logic.java
class LogicTesting {
    @Test
    void testCalculateTotalCost_NoDiscount() {
        RefactoredLogicForTesting logic = new RefactoredLogicForTesting();
        double expected = 400.0 * 3; // 3 persons, no discount
        double actual = logic.calculateTotalCost(3);
        assertEquals(expected, actual, 0.001, "Cost calculation for 3 persons should be correct");
    }

    @Test
    void testCalculateTotalCost_WithDiscount() {
        RefactoredLogicForTesting logic = new RefactoredLogicForTesting();
        double expected = 400.0 * 6 * 0.90; // 6 persons, 10% discount
        double actual = logic.calculateTotalCost(6);
        assertEquals(expected, actual, 0.001, "Cost calculation for 6 persons with discount should be correct");
    }

    @Test
    void testCalculateTotalCost_EdgeCase_NoDiscount() {
        RefactoredLogicForTesting logic = new RefactoredLogicForTesting();
        double expected = 400.0 * 5; // 5 persons, no discount
        double actual = logic.calculateTotalCost(5);
        assertEquals(expected, actual, 0.001, "Cost calculation for 5 persons (no discount edge case) should be correct");
    }

    @Test
    void testCalculateTotalCost_EdgeCase_WithDiscount() {
        RefactoredLogicForTesting logic = new RefactoredLogicForTesting();
        double expected = 400.0 * 6 * 0.90; // 6 persons, discount applies
        double actual = logic.calculateTotalCost(6);
        assertEquals(expected, actual, 0.001, "Cost calculation for 6 persons (discount edge case) should be correct");
    }
}