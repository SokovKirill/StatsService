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
       void Sum() {
           assertEquals(180, service.Sum(sales));
       }

       @Test
       void minSales() {
           assertEquals(9, service.minSales(sales));

       }

       @Test
       void Avg() {
           assertEquals(15, service.Avg(sales));
       }
   }

//      @Test
//        void calculateBelowMidSum() {
//            assertEquals(5, service.calculateBelowMidSum(sales));
//        }
//       @Test
//       void calculateAboveMidSum() {
//           assertEquals(5, service.calculateAboveMidSum(sales));
//       }
//}
