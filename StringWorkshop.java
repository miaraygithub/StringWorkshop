import java.util.Scanner; //import scanner objects
public class StringWorkshop { //class with all our shit
    public static int menu() { //method to show menu and get user selection, returns int
        //Print out the options
        System.out.println("Pick an option:");
        System.out.println("1. Add content");
        System.out.println("2. Check if string contains substring");
        System.out.println("3. Output length");
        System.out.println("4. Output substring after prefix");
        System.out.println("5. Output substring before suffix");
        System.out.println("6. Output substring between prefix and suffix");
        System.out.println("7. Exit");
        //returns user's choice
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static String stringAdd(String baseStr) { //method to add onto strings, replaces baseStr with new baseStr
        Scanner sc = new Scanner(System.in); //new scanner object
        System.out.print("Enter addition: "); //prompt user for add on string
        baseStr += sc.nextLine(); //update base string with addition
        System.out.println("Current string: " + baseStr); //print out changes
        return baseStr; //return new base
    }
    public static void stringCheck(String baseStr) { //method to check if substring is present
        Scanner sc = new Scanner(System.in); //new scanner object
        System.out.print("Enter substring: "); //prompt user for substring
        String subString = sc.nextLine(); //save nextline in String subString
        if (baseStr.contains(subString)) { //if subString is contained
            System.out.println(subString + " is contained in " + baseStr); //let the user know
        } else { //if not
            System.out.println(subString + " is not contained in " + baseStr); //let the user know
        }
    }

    public static void stringLen(String baseStr) { //method to output the length of input string(kinda redundant but whatever)
        System.out.println("Lenghth = " + baseStr.length()); //print out length
    }

    public static void stringPre(String baseStr) { //method to print out everything after a given substring
        Scanner sc = new Scanner(System.in); //new scanner object
        System.out.print("Enter prefix: "); //prompt user for input
        String pre = sc.nextLine(); //save prefix as pre
        System.out.println("Substring  = " + baseStr.substring(baseStr.indexOf(pre) + pre.length())); //print out everything after
    }

    public static void stringPost(String baseStr)  { //method to print out everything before a given substring
        Scanner sc = new Scanner(System.in); //new scanner object
        System.out.print("Enter suffix: "); //prompt user for substring
        String post = sc.nextLine(); //save substring in post
        System.out.println("Substring  = " + baseStr.substring(0, baseStr.indexOf(post))); //print out everything before
    }

    public static void stringMid(String baseStr)  { //method to print out everything between substrings
        Scanner sc = new Scanner(System.in); //new scanner object
        //prompt user for prefix and suffix
        System.out.print("Enter prefix: ");
        String pre = sc.nextLine();
        System.out.print("Enter suffix: ");
        String post = sc.nextLine();
        //print out substring in between those
        System.out.println("Substring = " + baseStr.substring(baseStr.indexOf(pre) + pre.length(), baseStr.indexOf(post)));
    }

    public static void main(String[] args) { //MAIN METHOD WOOT WOOT
        Scanner sc = new Scanner(System.in); //new scanner object

        System.out.print("Enter a starting off string: "); //prompt user for starting string
        String baseStr = sc.nextLine(); //save response in string baseStr

        int option = menu(); //get the user's choice (menu method) and save it in variable option
        while (option != 7) { //while loop for until user picks exit
            //for each option, call the associated method
            if (option == 1) {
                baseStr = stringAdd(baseStr);
            } else if (option == 2) {
                stringCheck(baseStr);
            } else if (option == 3) {
                stringLen(baseStr);
            } else if (option == 4) {
                stringPre(baseStr);
            } else if (option == 5) {
                stringPost(baseStr);
            } else if (option == 6) {
                stringMid(baseStr);
            }
            option = menu(); //get user's input to change options or exit
        }

    }
}