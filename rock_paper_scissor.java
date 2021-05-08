import java.util.Random;
import java.util.Scanner;

class rock_paper_scissor {

  public static void main(String[] args) {
    Random r = new Random();
    Scanner s = new Scanner(System.in);
    int a, b;
    int c1 = 0, c2 = 0;
    System.out.println(
      "======== Welcome to ROck, PAper & SCissor GAme ========\n\n"
    );
    System.out.println("Enter Your Name :: ");
    String name = s.nextLine();
    for (int i = 0; i < 5; i++) {
      System.out.println("+++++  Round " + (i + 1) + "  +++++");
      System.out.println("            1. Press 1 to choose Rock");
      System.out.println("            2. Press 2 to choose Paper");
      System.out.println("            3. Press 3 to choose Scissor");

      a = s.nextInt();
      b = r.nextInt(3) + 1;

      if (b == 1) System.out.println(
        "\nComputer Chooses -->> \"Rock\""
      ); else if (b == 2) System.out.println(
        "\nComputer Chooses -->> \"Paper\""
      ); else if (b == 3) System.out.println(
        "\nComputer Chooses -->> \"Scissor\""
      );

      if (
        (a == 1 && b == 3) || (a == 2 && b == 1) || (a == 3 && b == 2)
      ) c1++; else if (
        (b == 1 && a == 3) || (b == 2 && a == 1) || (b == 3 && a == 2)
      ) c2++;
      System.out.println("\n\n\n");
    }

    if (c1 > c2) {
      System.out.println(
        "->->->->->  Congratulations !!! You are the Winner <-<-<-<-<-"
      );
      System.out.println(
        "                         Scores                        "
      );
      System.out.println("                  Computer -->> " + c2);
      System.out.printf("                   %s -->> %d", name, c1);
      System.out.println("\n\n\n");
    } else if (c2 > c1) {
      System.out.println("->->->->->  Sorry !!! You LOse the GAme <-<-<-<-<-");
      System.out.println("    ********** Better Luck Next Time **********");
      System.out.println(
        "                         Scores                        "
      );
      System.out.println("                  Computer -->> " + c2);
      System.out.printf("                   %s -->> %d", name, c1);
      System.out.println("\n\n\n");
    } else if (c1 == c2) {
      System.out.println(
        "**********  Wow !!! Match Gets Tied {{.....}}  **********"
      );
      System.out.println(
        "                         Scores                        "
      );
      System.out.println("                  Computer -->> " + c2);
      System.out.printf("                   %s -->> %d", name, c1);
      System.out.println("\n\n\n");
    }
  }
}
