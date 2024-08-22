package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationOrJobTest {
    @Test
    public void VacationOrJobTest() {
        VacationOrJob count = new VacationOrJob();
        int expected = 2;
        int actual = count.countVacationMonth(0, 100000, 60000, 150000);
        Assertions.assertEquals(expected,actual);
        System.out.println("Фрилансер может отдыхать " + actual + " месяцев/ца");
    }
    @Test
    public void VacationOrJobTest2() {
        VacationOrJob count = new VacationOrJob();
        int expected = 3;
        int actual = count.countVacationMonth(0, 10000, 3000, 20000);
        Assertions.assertEquals(expected,actual);
        System.out.println("Фрилансер может отдыхать " + actual + " месяцев/ца");
    }
}