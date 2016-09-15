package crawley.james.RotateArray;

import java.util.*;

/**
 * Created by jamescrawley on 9/14/16.
 */
public abstract class RotateArray implements List {



    public static void main(String[] args) {

        ArrayList<Integer> list0 = new ArrayList<Integer>();

        list0.add(1);
        list0.add(3);
        list0.add(5);
        list0.add(7);
        list0.add(9);
        list0.add(11);

        System.out.println(list0);
        RotateArray.shift(list0, 3);
        System.out.println(list0);


    }

    public static ArrayList<Integer> shift (ArrayList<Integer> arrList, int k) {

        for (int i = 0; i < k; i++) {
            arrList.add(arrList.get(i));
        }


        for (int i = 0; i < k; i++) {
            arrList.remove(0);

        }

        return null;
    }

}
