package crawley.james.RotateArray;

import java.util.*;

/**
 * Created by jamescrawley on 9/14/16.
 */
public class RotatableArray extends ArrayList {


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
