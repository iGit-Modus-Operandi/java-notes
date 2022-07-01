package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// import org.apache.commons.lang3.time.FastDateFormat;
// thread-safe

public class SimpleDateFormatUnsafe {

  private static  final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
  // Possible solution:
  // private static  final FastDateFormat dateFormat = FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ss");

  public static void main(String[] args) {

    String dateString = "2022-07-02T12:55:00";

    ExecutorService executorService = Executors.newFixedThreadPool(10);

    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        try{
          Date date = dateFormat.parse(dateString);
          // Possible solution:
          // Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(dateString);
          // instantiate new SimpleDateFormat every time you use it

          System.out.println("Successfully parsed: " + date);
        }catch (Exception e){
          System.out.println("Exception: ");
          e.printStackTrace();
        }
      }
    };

    for (int i = 0; i < 10; i++){
      executorService.submit(runnable);
    }
    executorService.shutdown();
  }
}
