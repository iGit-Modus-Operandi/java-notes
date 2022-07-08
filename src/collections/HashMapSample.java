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

    // getting a specific value from the collection
    System.out.println(crypto.get("Etherium"));

    // checking if a certain key is existent on the collection
    System.out.println(crypto.containsKey("SLP"));

    // checking if a certain value is existent on the collection
    System.out.println(crypto.containsValue("BTC"));

    // put method tries to overwrite the previous value once a certain key is already existing
    crypto.put("Etherium", "ETC");
    System.out.println(crypto);

    // replace method will do the same with put method but will not change record of the key is still not yet existing in the collection
    crypto.replace("Etherium", "ETH");
    System.out.println(crypto);
    crypto.replace("Avalance", "AVAX");

    // putIfAbsent method only adds a key-value if it is still not yet existing in the collection
    crypto.putIfAbsent("Polkadot", "DOT");
    System.out.println(crypto);

    // remove a certain key
    crypto.remove("Polkadot");
    System.out.println(crypto);
  }
}
