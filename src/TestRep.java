
public class TestRep {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println("Test Master");
    System.out.println("Test");
    print("Test Feature");
    print("Test Feature 2");

    print("Feature2 Branch Test");
    print("after hotfix");
    print("auto rebase");

    hotfixprint("Hotfix"); //
  }

  public static void print(String input) {
    System.out.println(input); // print
  }
  
  public static void hotfixprint(String input) {
    System.out.println(input); // printer
  }
}
