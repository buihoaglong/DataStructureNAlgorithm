package TimeNSpaceComplexity;

import java.util.ArrayList;

public class SpaceComplexity {
    // O(1) - Constant Space
    public void constantSpaceExample() {
        int count = 0;
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("Count: " + count);
    }

    // O(n) - Linear Space
    public void linearSpaceExample(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        System.out.println("List size: " + list.size());
    }

    public static void main(String[] args) {
        SpaceComplexity sc = new SpaceComplexity();

        System.out.println("Constant Space Example:");
        sc.constantSpaceExample();

        System.out.println("Linear Space Example:");
        sc.linearSpaceExample(5); // Thay đổi số này để kiểm tra với n khác
    }
}
