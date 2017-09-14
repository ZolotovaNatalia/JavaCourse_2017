public class School {
    private String name;
    private int maxAmountOfGroups;
    private int amountOfGroups = 0;
    private Group[] groups;

    public School(String name, int maxAmountOfGroups) {
        this.name = name;
        this.maxAmountOfGroups = maxAmountOfGroups;
        groups = new Group[maxAmountOfGroups];
    }

    public void addGroup(Group group) {
        if (amountOfGroups < maxAmountOfGroups) {
            groups[amountOfGroups] = group;
            amountOfGroups++;
        }
    }

    public void addChild(Child child) {
        boolean isAdded = false;
        for (int i = 0; i < groups.length; i++) {
            isAdded = groups[i].addChild(child);
            if (isAdded) {
                System.out.println(child.getName() + " was added to the group of " + groups[i].getTeacherName());
                break;
            }
        }
        if (!isAdded) {
            System.out.println("No group was found for " + child.getName());
        }
    }
}
