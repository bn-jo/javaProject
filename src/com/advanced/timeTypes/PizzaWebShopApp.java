package com.advanced.timeTypes;

import java.time.*;
import java.time.chrono.HijrahDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class PizzaWebShopApp {
    public static void main(String[] args) {
        LocalTime openingHour =LocalTime.of(11,0);
        LocalTime closingTime =LocalTime.of(22,0);
        System.out.println("The restaurant open from : "+openingHour + "to "+ closingTime+" Every day");

        LocalDate orderDate = LocalDate.now().minusDays(3);
        System.out.println("The pizza ordered on: "+orderDate);



        LocalDateTime orderDateTime = LocalDateTime.from(orderDate.atStartOfDay()).withHour(17);
        System.out.println("I submitted the order : "+ orderDateTime);

        LocalTime deliveryTime =LocalTime.of(11,10);


        LocalDateTime estimetedDeliveryTime = orderDateTime.plusHours(deliveryTime.getHour())
                .plusMinutes(deliveryTime.getMinute());
        System.out.println("Estimated delivery time : "+ estimetedDeliveryTime);


        LocalDateTime realDiliveryDateTime = orderDateTime.plusMinutes(90);
        System.out.println("Real delivery Time : "+ realDiliveryDateTime);

        long differenceBitweenEstimetdAndReal = ChronoUnit.MINUTES.between(estimetedDeliveryTime,realDiliveryDateTime);
        System.out.println("Difference : "+differenceBitweenEstimetdAndReal+" minutes");

        if (estimetedDeliveryTime.isBefore(realDiliveryDateTime)) {
            System.out.println("The pizza arrived in time");
        }else {
            System.out.println("The pizza didn't arrived in time");
        }

        HijrahDate hijrahDate = HijrahDate.from(orderDate);
        DateTimeFormatter dataTimeFormater =  DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Based on hijrah calender i ordered my pizza on : "+dataTimeFormater.format(hijrahDate));

        ZonedDateTime myLocalDateTime = orderDateTime.atZone(ZoneId.of("Europe/Budapest"));
        System.out.println("THe time I orderd pizza was "+myLocalDateTime+ " in budapest");
        ZonedDateTime TokyoDateTime = myLocalDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println("The time i ordered pizza was"+TokyoDateTime + " in Tokyo");
        System.out.println();
        System.out.println();
        System.out.println("Zone Id available : ");
        for (String zoneId : ZoneId.getAvailableZoneIds()){
            System.out.println(zoneId);
        }


    }
}
