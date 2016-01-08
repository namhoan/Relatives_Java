/**Namho An
 * PA07
 * 4/24/2015
 * COSI12b
**/
import java.util.*;

public class Person {
    private String name;
    private Person mother;
    private Person father;
    private ArrayList<Person> children;

    public Person(String name) {
        this.name = name;
        this.children = new ArrayList<Person>();
    }
    // return the name
    public String getName() {
        return this.name;
    }
    // return the mother
    public Person getMother() {
        return this.mother;
    }
    //return the father
    public Person getFather() {
        return this.father;
    }
    //return the child list
    public ArrayList<Person> getChildren() {
        return this.children;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void addChild(Person child) {
        this.children.add(child);
    }

}