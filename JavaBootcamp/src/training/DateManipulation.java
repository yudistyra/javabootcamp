/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

/**
 *
 * @author Yudistyra_OP355
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateManipulation {
    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println(dateFormat.format(currentDate));
        
        // convert date to Calendar
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);
        
        // proses manipulasi dengan menambah 1 hari pada tahun, bulan, tanggal dan waktu
        c.add(Calendar.YEAR, 1);
        c.add(Calendar.MONTH, 1);
        c.add(Calendar.DATE, 1);
        c.add(Calendar.HOUR, 1);
        c.add(Calendar.MINUTE, 1);
        c.add(Calendar.SECOND, 1);
        
        Date currentDatePlus = c.getTime();
        
        System.out.println(dateFormat.format(currentDatePlus));
    }
}
