
package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticServiceTest {

    @Test
    void findMax() {
        StatisticService service = new StatisticService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    public void findSecondMax() {
        StatisticService service = new StatisticService();

        long[] incomesInBillions = {12, 15, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 15;
        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}