import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Wector vr = new Wector(new int[] {9, 4, 5});
        System.out.println(vr.getLength());
        System.out.println(vr.getMax());
        System.out.println(vr.getMin());
        vr.sortAscending();
        System.out.println(Arrays.toString(vr.getVector()));
        vr.multiplyByNumber(3);
        System.out.println(Arrays.toString(vr.getVector()));
        vr.addVector(new int[]{2,3,5});
        System.out.println(Arrays.toString(vr.getVector()));
        System.out.println(vr.scalarProduct(new int[]{2,3,5}));
        System.out.println(vr.evkl());
    }
}
