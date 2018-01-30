package problemsolving.algo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MultiList {

    private ArrayList<LinkedList<Integer>> lists = null;

    public Iterator<Integer> getIterator() {
        return new MultiListIterator();
    }

    public class MultiListIterator implements Iterator<Integer> {

        private Iterator<Integer> iter = new ArrayList<Integer>().iterator();
        private Iterator<LinkedList<Integer>> lstIter;

        private MultiListIterator() {
            lstIter = lists.iterator();
            if (lstIter.hasNext()) iter = lstIter.next().iterator();
        }

        @Override
        public boolean hasNext() {
            if (!lstIter.hasNext() && !iter.hasNext()) return false;
            return true;
        }

        @Override
        public Integer next() {
            if (hasNext()) {
                if (!iter.hasNext()) {
                    iter = lstIter.next().iterator();
                }
                return iter.next();
            }
            throw new NoSuchElementException();
        }
    }

    public MultiList() {
    }

    @Test
    public void t() {
        ArrayList<LinkedList<Integer>> lists = new ArrayList<>();
        LinkedList<Integer> tmp;
        for (int i = 1; i < 101; i++) {
            tmp = new LinkedList<>();
            while (i % 10 != 0) {
                tmp.add(i);
                i++;
            }
            lists.add(tmp);
        }
        System.out.println(lists);
        MultiList ml = new MultiList();
        ml.lists = lists;
        Iterator<Integer> iter = ml.getIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        ArrayList<Integer> ar = new ArrayList<>();
        Iterator<Integer> iterrr = ar.iterator();
        System.out.println(iterrr.hasNext());
    }
}
