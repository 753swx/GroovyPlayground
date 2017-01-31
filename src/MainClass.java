import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

/**
 * Created by Artur_Kananchuk on 1/24/2017.
 */
public class MainClass {
//    static void modeGenerator() {
//        Random random = new Random();
//        int indexMode = random.nextInt(2);
//
////        int indexMode = (int)(Math.random()*2);
//        switch (indexMode) {
//            case 0:
//                System.out.println("0");
//                break;
//            case 1:
//                System.out.println("1");
//                break;
//        }
//    }

    public static void main(String[] args) {

        //        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMMyy", Locale.US);
//        String date = (dateFormat.format( new Date() )).toUpperCase();
//        System.out.println(date);
//        System.out.println(new Date());

        for (int i = 0; i < 10; i++) {

            Random random = new Random();
            int daysToReservation = random.nextInt(180);

            LocalDate now = LocalDate.now();
//        System.out.println();
            LocalDate now2 = now.plusDays(daysToReservation);
            DateTimeFormatter ddMMMyy = DateTimeFormatter.ofPattern("ddMMMyy", Locale.US);
//
//        System.out.println(ddMMMyy.format(now).toUpperCase());
//        System.out.println(ddMMMyy.format(now2).toUpperCase());

            String currentDate = ddMMMyy.format(now).toUpperCase();
            String reservationDate = ddMMMyy.format(now2).toUpperCase();
            System.out.println("Current date: " + currentDate + "\nReservation date: " + reservationDate);

            System.out.println("Days to reservation: " + daysToReservation + "\n");
            
        }


    }
}
