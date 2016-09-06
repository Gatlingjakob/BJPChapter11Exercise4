import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Jakob on 30-08-2016.
 */
public class partition {

    public static void main (String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(Arrays.asList(15, 1, 6, 12, -3, 4, 8, 21, 2 ,30, -1, 9));

        int E = 5;

        System.out.println(partitions(list, E));


    }
        public static ArrayList<Integer> partitions (ArrayList<Integer> list, int E){

            //Ligemeget hvad E er, så vil alle værdier >E og <E være henholdsvis til højre og venstre for E,
            // så længe man bare sorterer listen
            Collections.sort(list);

return list;

    }




}
