import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static Person[] bubblesortfnavn (Person[] input)
    {
        boolean needNextPass = true;
        for (int k = 1; k < input.length && needNextPass; k++) {
            // Array may be sorted and next pass not needed
            needNextPass = false;
            for (int i = 0; i < input.length - k; i++) {
                if (input[i].getFnavn().compareTo(input[i+1].getFnavn())>0) {
                    // Swap list[i] with list[i + 1]
                    Person temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;

                    needNextPass = true; // Next pass still needed
                }
            }
        }
        return input;
    }
    public static Person[] bubblesortKar (Person[] input)
    {
        boolean needNextPass = true;
        for (int k = 1; k < input.length && needNextPass; k++) {
            // Array may be sorted and next pass not needed
            needNextPass = false;
            for (int i = 0; i < input.length - k; i++) {
                if (input[i].getGennemsnitkar()<input[i+1].getGennemsnitkar())
                {
                    // Swap list[i] with list[i + 1]
                    Person temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;

                    needNextPass = true; // Next pass still needed
                }
            }
        }
        return input;
    }
    public static int linearSearch ( ArrayList<Person> liste, int stdnrkey) {
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i).getStdnr() == stdnrkey) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(ArrayList<Person> liste, int stdnrkey)
    {
        int low = 0;
        int high = liste.size() - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (stdnrkey < liste.get(mid).getStdnr())
                high = mid - 1;
            else if (stdnrkey == liste.get(mid).getStdnr())
                return mid;
            else
                low = mid + 1;
        }

        return -low - 1; // Now high < low
    }

    public static void main(String[] args) {

        ArrayList<Person> p1 = new ArrayList<>();

        Person person1 = new Person(10,"Kevin","Mortensen",12);
        Person person2 = new Person(2,"Emil","Emilsen",12);
        Person person3 = new Person(33,"Test","Testermand",4);
        Person person4 = new Person(400,"Søren","Slemmedreng",2.3);
        Person person5 = new Person(5,"Flotte","Fyr",5.6);

        p1.add(person1);
        p1.add(person2);
        p1.add(person3);
        p1.add(person4);
        p1.add(person5);


        Comparator<Person> enavnSort = new Comparator <Person>()
        {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getEnavn().compareTo(o2.getEnavn());
            }
        };

        Collections.sort(p1,enavnSort);
        System.out.println("Listen er sorteret efter enavn: ");
        for(int i=0; i<p1.size();i++)
        {
            System.out.println(p1.get(i).getFnavn());
        }

        /*Collections.sort(p1);
        System.out.println("Listen er sorteret efter Karakter: ");
        for(int i=0; i<p1.size();i++)
        {
            System.out.println(p1.get(i).getFnavn());
        }
            */
        System.out.println("LinearSearch for stdnr 33 : "+linearSearch(p1,33));
        System.out.println("BinarySearch for stdnr 400 : " +binarySearch(p1,400));

        QuickSortMedGennemsnit qs = new QuickSortMedGennemsnit();

        qs.quickSort(p1);
        System.out.println("Quicksort efter karakter");
        for(int i=0; i<p1.size();i++)
        {
            System.out.println(p1.get(i).getFnavn());
        }


    }
}
