package unionarray;

import java.util.ArrayList;

import java.util.HashSet;

public class Union {
    public ArrayList<Integer> findUnion(Integer[] num, Integer[] integers) {
        if (num == null && integers == null) {
            return new ArrayList<>();
        } else if (num == null && integers != null) {
            ArrayList<Integer> list = new ArrayList<>();
            HashSet<Integer> integerHashSet = new HashSet<>();
            for (int i = 0; i < integers.length; i++) {
                integerHashSet.add(integers[i]);
            }
            for (int a2 : integerHashSet) {
                list.add(a2);
            }
            return list;
        }else {
            ArrayList<Integer> union = new ArrayList<>();
            HashSet<Integer> set = new HashSet<>();
            int n = num.length;
            for (int i = 0; i < n; i++) {
                set.add(num[i]);
            }

            int m = integers.length;
            for (int i = 0; i < m; i++) {
                set.add(integers[i]);
            }

            for (int u : set) {
                union.add(u);
            }
            return union;
        }
    }
}
