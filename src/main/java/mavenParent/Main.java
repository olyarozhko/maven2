package mavenParent;

import mavenChild.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", 25);
        person1.whoAmI();
    }
}
