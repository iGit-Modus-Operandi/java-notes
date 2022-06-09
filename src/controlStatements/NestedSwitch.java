package controlStatements;

public class NestedSwitch {

  public static void main(String[] args) {
    int count = 1;
    int target = 1;

    switch(count) {
      case 1:
        switch (target) { // nested switch
          case 0:
            System.out.println("target is zero");
            break;
          case 1: // no conflicts with outer switch
            System.out.println("target is one");
            break;
        }
        break;
      case 2: // ...
    }
  }
}
