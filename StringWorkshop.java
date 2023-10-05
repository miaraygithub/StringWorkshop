import java.util.Scanner;
public class StringWorkshop {
    //Scanner sc = new Scanner(System.in);
    public static int menu() {
        System.out.println("Pick an option:");
        System.out.println("1. Add content");
        System.out.println("2. Check if string contains substring");
        System.out.println("3. Output length");
        System.out.println("4. Output substring after prefix");
        System.out.println("5. Output substring before suffix");
        System.out.println("6. Output substring between prefix and suffix");
        System.out.println("7. Exit");

        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static String stringAdd(String baseStr) {
        Scanner sc = new Scanner(System.in);
        baseStr += sc.nextLine();
        System.out.println("Current string: " + baseStr);
        return baseStr;
    }
    public static void stringCheck(String baseStr) {
        Scanner sc = new Scanner(System.in);
    }

    public static void stringLen(String baseStr) {

    }

    public static void stringPre(String baseStr) {
        Scanner sc = new Scanner(System.in);
    }

    public static void stringPost(String baseStr)  {
        Scanner sc = new Scanner(System.in);
    }

    public static void stringMid(String baseStr)  {
        Scanner sc = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a starting off string: ");
        String baseStr = sc.nextLine();

        int option = menu();
        while (option != 7) {
            if (option == 1) {
                baseStr += stringAdd(baseStr);
            } else if (option == 2) {
                stringCheck(baseStr);
            } else if (option == 3) {
                stringLen(baseStr);
            } else if (option == 4) {
                stringPost(baseStr);
            } else if (option == 5) {
                stringPre(baseStr);
            } else if (option == 6) {
                stringMid(baseStr);
            }
            option = menu();
        }

    }
}