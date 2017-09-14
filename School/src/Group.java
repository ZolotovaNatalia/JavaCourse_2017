
public class Group {
    private int maxAmountOfChildren;

    private String teacherName;
    private Child[] children;
    private int averageAge;
    private int amountOfChildren = 0;

    public Group(int maxAmountOfChildren, String teacherName, int averageAge){
        this.maxAmountOfChildren = maxAmountOfChildren;
        this.teacherName = teacherName;
        this.averageAge = averageAge;
        children = new Child[maxAmountOfChildren];
    }

    public Boolean addChild(Child child){
        if(amountOfChildren < maxAmountOfChildren){
            if(Math.abs(child.getAge()- averageAge) <= 1){
                children[amountOfChildren] = child;
                amountOfChildren++;
                return true;
            }
            System.out.println(child.getName() + " has a wrong age of the group  of " + teacherName);
            return false;
        }
        return false;
    }

    public String getTeacherName() {
        return teacherName;
    }

}
