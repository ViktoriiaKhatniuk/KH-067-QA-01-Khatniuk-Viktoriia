import java.util.Arrays;

public class GroupDescription {

    public static void main(String[] args) {
        UniversityGroup Group2006 = new UniversityGroup("Group2006", 2006);
        UniversityGroup Group2011 = new UniversityGroup("Group2011", 2011, new String[]{"Pam", "Joy", "Dave"});
        String[] studentArray = new String[]{};
        Group2006.addStudents(studentArray);
        Group2011.addStudents(studentArray);
        Group2006.getGroupDescription();
        Group2011.getGroupDescription();
    }
}