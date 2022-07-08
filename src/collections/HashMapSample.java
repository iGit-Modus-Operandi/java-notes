package collections;
import java.util.HashMap;

public class HashMapSample {

  public static void main(String[] args) {
    HashMap <String, String> crypto = new HashMap <> ();

    // basic use of hashmap, adding inputs through put method
    crypto.put("Bitcoin", "BTC");
    crypto.put("Etherium", "ETH");
    crypto.put("XRP", "XRP");

    System.out.println(crypto);

    // getting a specific value from the whole collection
    System.out.println(crypto.get("Etherium"));

  }
}
