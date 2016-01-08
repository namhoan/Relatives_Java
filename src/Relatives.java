/**Namho An
 * PA07
 * 4/24/2015
 * COSI12b
**/
import java.util.*;
import java.io.*;

public class Relatives{

   public static void main(String[] args) throws FileNotFoundException {
    Scanner scan = new Scanner(System.in);
    System.out.print("What is the input file?:");
    String fileName = scan.nextLine();
    Scanner input = new Scanner(new File(fileName));
    FamilyInfo family = new FamilyInfo(input);
	process(family);
  }
   //user prompt that type the person's name and it prints out the result from showAncestor method and showDescendant method
   public static void process(FamilyInfo family) {
	   Scanner console = new Scanner(System.in);
       System.out.print("Person's name ('quit' to end)? ");
       String name = console.nextLine();
       while (name.length() > 0) {
           Person next = family.search(name);
           if (next == null) {
               System.out.println("Not matching");
           }else {
               showAncestor(next);;
               showDescendant(next);
           }
       }
   }

   //method for the ancestors including the printing ancestors list
   public static void showAncestor(Person current) {
       System.out.println("Ancestor:");
       int level = 1;
       while (current != null) {
           for (int i = 0; i < level; i++)
               System.out.print("    ");
           System.out.println(current.getName());
           current = current.getMother();
           level++;
           current = current.getFather();
           level++;
       }
   }


   //method for the dscendants and including the printing descendants list
   public static void showDescendant(Person current) {
       ArrayList<Person> kids = current.getChildren();
       System.out.println("Descendants:");
       if (kids.size() == 0) {
           System.out.println(" ");
       } else {
           for (Person kid: kids) {
               System.out.println("    " + kid.getName());
           }
       }
   }
}
  