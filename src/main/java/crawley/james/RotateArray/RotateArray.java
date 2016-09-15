package crawley.james.RotateArray;

/**
 * Created by jamescrawley on 9/15/16.
 */
public class RotateArray {

    public static void main (String[] main) {

        RotatableArray list0 = new RotatableArray();

        list0.add(1);
        list0.add(3);
        list0.add(5);
        list0.add(7);
        list0.add(9);
        list0.add(11);

        System.out.println(list0);
        RotatableArray.shift(list0, 3);
        System.out.println(list0);

    }
}
