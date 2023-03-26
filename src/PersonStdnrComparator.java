import java.util.Comparator;

public class PersonStdnrComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getStdnr() - (o2.getStdnr());
    }
}