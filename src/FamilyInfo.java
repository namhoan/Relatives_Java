/**Namho An
 * PA07
 * 4/24/2015
 * COSI12b
**/
import java.util.*;

public class FamilyInfo {
    private ArrayList<Person> family;

    public FamilyInfo(Scanner console) {
        this.family = new ArrayList<Person>();
        String names = console.nextLine();
        while (names.length() > 0) {
            this.family.add(new Person(names));
            names = console.nextLine();
        }
        processAncestors(console);
    }

    //searching for the name it typed and return the name and returns null
    //when the name is not in the list
    public Person search(String name) {
        for (Person s: this.family) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }
   //method to processing the words divided in to person, mother and father
    private void processAncestors(Scanner input) {
        while (input.hasNextLine()) {
            String personName = input.nextLine();
            String motherName = input.nextLine();
            String fatherName = input.nextLine();
            Person s = search(personName);
            if (!motherName.equals("none")) {
                Person mother = search(motherName);
                s.setMother(mother);
                mother.addChild(s);
            }
            if (!fatherName.equals("none")) {
                Person father = search(fatherName);
                s.setFather(father);
                father.addChild(s);
            }
        }
    }               
}