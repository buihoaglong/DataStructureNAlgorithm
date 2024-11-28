package StudentManagement;

import java.util.ArrayList;

public class ArrayListAddStudent {
    final String RED = "\u001B[31m";
    final String RESET = "\u001B[0m";

    public void addStudent(ArrayList<Student> students, Student objectData) {
        //Check Student - O(N)
        for (Student student : students) {
            if (student.getFullName().equalsIgnoreCase(objectData.getFullName())) {
                System.out.println(RED + "Student " + objectData.getFullName() + " already exist." + RESET);
                return;
            }
        }


        // Nếu không tồn tại, thêm sinh viên vào danh sách
        students.add(objectData);
        System.out.println("Added student: " + objectData.getFullName());
    }
}
