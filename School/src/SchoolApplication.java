public class SchoolApplication {
    public static void main(String[] args) {

        School school = new School("Programming school", 3);

        Group group1 = new Group(2,"Bella", 10);
        Group group2 = new Group(2,"Olga", 8);
        Group group3 = new Group(2,"Olga", 15);

        school.addGroup(group1);
        school.addGroup(group2);
        school.addGroup(group3);

        Child child1 = new Child("Mustermann", 10);
        Child child2 = new Child("Peter", 9);
        Child child3 = new Child("Dmitry", 8);
        Child child4 = new Child("Florian", 14);
        Child child5 = new Child("Natalia", 13);
        Child child6 = new Child("Mustafa", 16);

        school.addChild(child1);
        school.addChild(child2);
        school.addChild(child3);
        school.addChild(child4);
        school.addChild(child5);
        school.addChild(child6);
    }

}
