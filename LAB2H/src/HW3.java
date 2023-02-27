import java.util.ArrayList;
import java.util.Random;

public class HW3 {   public static void main(String[] args) {
    ArrayList<Integer> A=new ArrayList();
    Random random = new Random();
    A.add(1);
    A.add(2);
    A.add(3);
    A.add(4);
    A.add(5);
    A.add(6);
    A.add(7);
    A.add(8);
    int removedIndex;
    while (!A.isEmpty()) {
        removedIndex = random.nextInt(A.size());
        System.out.println(A);
        A.remove(removedIndex);
    }
}
}
