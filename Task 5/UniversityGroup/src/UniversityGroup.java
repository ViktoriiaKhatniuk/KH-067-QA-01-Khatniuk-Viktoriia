import java.util.Arrays;

public class UniversityGroup {
    private String groupName;
    private int startYear;
    private int endYear;
    private String[] studentArray;

    public String getGroupName() {
        return groupName;
    }

    public int getStartYear() {
        return startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public String[] getStudentArray() {
        return studentArray;
    }
    public UniversityGroup(String groupName, int startYear) {
        this.groupName = groupName;
        this.startYear = startYear;
        endYear = startYear + 5;
    }

    public UniversityGroup(String groupName, int startYear, String[] studentArray) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.studentArray = studentArray;
        endYear = startYear + 5;

    }

    public String[] addStudents(String[] studentArray) {
        if (this.studentArray == null) {
            this.studentArray = new String[]{"Alex", "Dan", "Mathew"};
        }
        return this.studentArray;
    }

    public void getGroupDescription() {
        System.out.println("\n" + "Group description: ");
        System.out.println("\n" + groupName);
        System.out.println("Started: " + startYear);
        System.out.println("Ended: " + endYear);
        System.out.println("Students: " + Arrays.toString(getStudentArray()));

    }
}