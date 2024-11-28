import StudentManagement.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    // Mã màu ANSI cho màu đỏ
    final static String RED = "\u001B[31m";
    final static String RESET = "\u001B[0m";

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayListAddStudent st = new ArrayListAddStudent();
        System.out.println("****** Add Student ********");

        // Add Student
        try {
            st.addStudent(students, new Student("BH001", "Bui Hoang Long", 8.0));
            st.addStudent(students, new Student("BH001", "Bui Hoang Long", 8.0));
            st.addStudent(students, new Student("BH002", "Nguyen Tien Manh", 7.5));
            st.addStudent(students, new Student("BH003", "Nguyen Minh Hieu", 7.0));
            // Gây lỗi bằng cách thêm sinh viên đã tồn tại
            st.addStudent(students, new Student("BH001", "Bui Hoang Long", 9.0)); // Sinh viên đã tồn tại
        } catch (Exception e) {
            // Hiển thị thông báo lỗi
            System.out.println(RED + "Error adding student: " + e.getMessage() + RESET);
        }

        System.out.println("********* List data of students **********");
        for (Student s : students) {
            System.out.println("ID = " + s.id + " , fullName = " + s.fullName + " , mark = " + s.mark + " , rank = " + s.rank);
        }

        System.out.println("********************** Edit Student ****************************");
        ArrayListEditStudent edit = new ArrayListEditStudent();
//        try {
//            edit.editStudent(students, 1, new Student("BH005", "Teo", 4));
//        } catch (Exception e) {
//            System.out.println(RED + "Error editing student: " + e.getMessage() + RESET);
//        }

        System.out.println("********* List data of students after updated **********");
        for (Student s : students) {
            System.out.println("ID = " + s.id + " , fullName = " + s.fullName + " , mark = " + s.mark + " , rank = " + s.rank);
        }

        System.out.println("********* Edit Student By Id **********");
        try {
            edit.editStudentById(students, "BH001", new Student("BH001", "Bui Hoang Long", 9.0));
            edit.editStudentById(students, "BH002", new Student("BH005", "Tom", 8.5));
            edit.editStudentById(students, "BH003", new Student("BH003", "Jerry", 7.0));
            edit.editStudentById(students, "BH008", new Student("BH008", "Tom", 9.0));
        } catch (Exception e) {
            System.out.println(RED + "Error editing student by ID: " + e.getMessage() + RESET);
        }

        System.out.println("********* List data of students after updated by ID **********");
        for (Student s : students) {
            System.out.println("ID = " + s.id + " , fullName = " + s.fullName + " , mark = " + s.mark + " , rank = " + s.rank);
        }

        System.out.println("********************* Remove Student ***************************");
        ArrayListRemoveStudent removeSt = new ArrayListRemoveStudent();
        try {
            removeSt.removeStudentById(students, "BH001");
            removeSt.removeStudentById(students, "BH009");
        } catch (Exception e) {
            System.out.println(RED + "Error removing student: " + e.getMessage() + RESET);
        }

        System.out.println("********* List data of students after removed by ID **********");
        for (Student s : students) {
            System.out.println("ID = " + s.id + " , fullName = " + s.fullName + " , mark = " + s.mark + " , rank = " + s.rank);
        }

        System.out.println("********************* Binary Search Student By Id ***************************");
        ArrayListSearchStudent searchSt = new ArrayListSearchStudent();
        String numberId = "BH008";
        int findSt = searchSt.binarySearch(students, numberId);
        if (findSt == -1) {
            System.out.println(RED + "Cannot find id = " + numberId + RESET);
        } else {
            System.out.println("Found id = " + numberId);
        }

        System.out.println("************** Sort Student by ID ***************");
        Collections.sort(students, Student.IdStudentComparator);
        System.out.println("********* After sort *************");
        for (Student str : students) {
            System.out.println(str);
        }

        System.out.println("************** Sort Student by Full name ***************");
        Collections.sort(students, Student.FullNameStduComparator);
        System.out.println("********* After sort *************");
        for (Student str : students) {
            System.out.println(str);
        }

        System.out.println("************** Sort Student by mark ***************");
        Collections.sort(students, Student.MarkStduComparator);
        System.out.println("********* After sort *************");
        for (Student str : students) {
            System.out.println(str);
        }

        // Thêm sinh viên mới (sử dụng phương thức addStudent)
        System.out.println("****** Adding more students ********");
        try {
            st.addStudent(students, new Student("BH001", "Bui Hoang Long", 9.0)); // Sinh viên đã tồn tại
            st.addStudent(students, new Student("BH002", "Nguyen Minh Hieu", 7.8));
            st.addStudent(students, new Student("BH004", "Nguyen Tien Manh", 6.5));
            st.addStudent(students, new Student("BH005", "Nguyen Van A", 10));
            st.addStudent(students, new Student("BH006", "Bui Van B", 4.0));
        } catch (Exception e) {
            System.out.println(RED + "Error adding new students: " + e.getMessage() + RESET);
        }

        // Using Bubble Sort
        System.out.println("Sorting using Bubble Sort by ID:");
        students.sort(StudentManagement.Student.IdStudentComparator);
        System.out.println("********* After sort *************");
        for (Student str : students) {
            System.out.println(str);
        }

        // Using Insertion Sort
        System.out.println("Sorting using Insertion Sort by Mark:");
        students.sort(Student.MarkStduComparator);
        System.out.println("********* After sort *************");
        for (Student str : students) {
            System.out.println(str);
        }
    }
}
