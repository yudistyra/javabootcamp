/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Yudistyra_OP355
 */
public class DateManipulation2 {
    private static final String DATE_FORMAT = "yyyy/MM/dd HH:mm:ss";
    private static final DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
    private static final DateTimeFormatter dateFormat8 = DateTimeFormatter.ofPattern(DATE_FORMAT);
    
    public static void main(String[] args) {
        // Get Current date
        Date currentDate = new Date();
        System.out.println("date : " + dateFormat.format(currentDate));
        
        // convert date to local time
        LocalDateTime localTime = currentDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("local datetime : " + dateFormat8.format(localTime));
        
        // plus one
        localTime = localTime.plusYears(1).plusMonths(1).plusDays(1);
        localTime = localTime.plusHours(1).plusMinutes(2).minusMinutes(1).plusSeconds(1);
        
        // convert local time to date
        Date curreDatePlus = Date.from(localTime.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("output : " + dateFormat.format(curreDatePlus));
    }
}
