package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

   public class StatsServiceTest {
       StatsService service = new StatsService();

       int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

       @Test
       void maxSales() {
           assertEquals(8, service.maxSales(sales));
       }

       @Test
       void sum() {
           assertEquals(180, service.sum(sales));
       }

       @Test
       void minSales() {
           assertEquals(9, service.minSales(sales));

       }

       @Test
       void avg() {
           assertEquals(15, service.avg(sales));
       }

      @Test
        void aboveMidSum() {
            assertEquals(5, service.aboveMidSum(sales));
       }

       @Test
       void belowMidSum() {
           assertEquals(5, service.belowMidSum(sales));
       }
}
