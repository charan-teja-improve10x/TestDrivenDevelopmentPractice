package movezerostoend;

import java.util.ArrayList;

public class MoveZeros {
    public int[] moveZerosToTheEnd(int[] a, int n) {
        if (a == null || a.length == 0){
            return new int[]{};
        }
        ArrayList<Integer> temp = new ArrayList<>();
        n = a.length;
        for (int i = 0; i < n; i++){
            if (a[i] != 0){
                temp.add(a[i]);
            }
        }

        int nz = temp.size();
        for (int i = 0; i < nz; i++){
            a[i] = temp.get(i);
        }

        for (int i = nz; i< n; i++){
            a[i] = 0;
        }
        return a;
    }
}
