package pp.d;

import java.util.*;

public class FindLargest {

    static int findLargest(int[] numbers){
        int max = numbers[0];
        for(int item : numbers){
            if(item > max)
                max = item;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,5,6};
        System.out.println(findLargest(nums));

        System.out.println(0001 & 0001);

        HashMap m = new HashMap();
        Object obj1 = new Object();
        Object obj2 = obj1;
        m.put(obj1, 1);
        m.put(obj2,2);
        System.out.println(m.get(obj1));

        ArrayList a = new ArrayList(2);
        a.add(1);
        a.add(1);
        a.add(1);
        System.out.println(a.size());

        HashSet h = new HashSet();
        h.add(new Integer(1));
        h.add(new Integer(1));
        h.add(new Integer(2));
        System.out.println(h.size());

        TreeMap tm = new TreeMap();
        tm.put(3,3);
        tm.put(2,1);
        tm.put(1,2);
        System.out.println(tm.values());

        StringBuilder sb = new StringBuilder();

      //  OuterClass o = new OuterClass();

//        public Node find(int v) {
//            Node current = this;
//            while (current != null) {
//                if (current.value == v) {
//                    return current;
//                }
//                // This will drop out of the loop naturally if there's no appropriate subnode
//                current = v < current.value ? current.left : current.right;
//            }
//            return null;
//        }
    }

     class OuterClass{
        private int i;

        OuterClass(){
            i=0;
        }

//        class InnerClass{
//             {
//                System.out.println(i);
//            }
//        }
    }
}
