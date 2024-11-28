package StudentManagement;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListEditStudent {
    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m";

    public void editStudent(ArrayList<Student> students, int position, Student object) {
        students.set(position, object);
    }

    public void editStudentById(ArrayList<Student> students, String id, Student data) {
        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            if (Objects.equals(students.get(i).getId(), id)) {
                students.set(i, data);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(RED + "Error: Student with ID " + id + " not found." + RESET);
        }
    }
}
