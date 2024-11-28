package StudentManagement;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListRemoveStudent {
    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m";

    public void removeStudentById(ArrayList<Student> students, String id) {
        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            if (Objects.equals(students.get(i).getId(), id)) {
                students.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(RED + "Error: Student with ID " + id + " not found." + RESET);
        }
    }
}
