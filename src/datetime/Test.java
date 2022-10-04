package datetime;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        //Hàm lấy thời gian hiện tại
        long t1 = System.currentTimeMillis();
        for(int i=0;i<1;i++){
            System.out.println("Test");
        }
        long t2 = System.currentTimeMillis();
        System.out.println((t2-t1)+"mls");
        //TimeUnit
        System.out.println("3000 năm ="+ TimeUnit.DAYS.toSeconds(3000*365));
        //Date
        Date d = new Date(System.currentTimeMillis());
        System.out.println(d.getDay()+"/"+d.getMonth()+"/"+d.getYear());
        //Calendar
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));
        c.add(Calendar.HOUR,30);
        System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));
        c.add(Calendar.DATE,14);
        System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));
        //DateFormat
        DateFormat df = new SimpleDateFormat();
        System.out.println(df.format(d));
        df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(d));





    }

}
