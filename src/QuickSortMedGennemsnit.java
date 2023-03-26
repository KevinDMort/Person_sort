import java.lang.reflect.Array;
import java.util.ArrayList;

public class QuickSortMedGennemsnit {
    public void quickSort(ArrayList<Person> list)  {
        quickSort(list, 0, list.size() - 1);
    }

    private static void quickSort(ArrayList<Person> list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }
    /** Partition the array list[first..last] */
    private static int partition(ArrayList<Person> list, int first, int last) {
        Person pivot = list.get(first); // Choose the first element as the pivot
        int low = first + 1; // Index for forward search
        int high = last; // Index for backward search

        while (high > low) {
            // Search forward from left
            while (low <= high && list.get(low).compareTo(pivot)<0)
                low++;

            // Search backward from right
            while (low <= high && list.get(high).compareTo(pivot) > 0)
                high--;

            // Swap two elements in the list
            if (high > low) {
                Person temp = list.get(high);
                list.set(high,list.get(low));
                list.set(low,temp);
            }
        }

        while (high > first && list.get(high).compareTo(pivot) >= 0)
            high--;

        // Swap pivot with list[high]
        if (pivot.compareTo(list.get(high)) > 0) {
            list.set(first,list.get(high));
            list.set(high,pivot);
            return high;
        }
        else {
            return first;
        }
    }

}
