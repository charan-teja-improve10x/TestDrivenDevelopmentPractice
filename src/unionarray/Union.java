package unionarray;

import java.util.ArrayList;

import java.util.HashSet;

public class Union {
    public ArrayList<Integer> findUnion(Integer[] num, Integer[] integers) {
        ArrayList<Integer> union = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        if (num == null && integers == null || num.length == 0 && integers.length == 0){
            return new ArrayList<>();
        }
        int n = num.length;
        for (int i = 0; i < n; i++){
            set.add(num[i]);
        }

        int m = integers.length;
        for (int i = 0; i < m; i++){
            set.add(integers[i]);
        }

        for (int u: set) {
           union.add(u);
        }
        return union;
    }
}
