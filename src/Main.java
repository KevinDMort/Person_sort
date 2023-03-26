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


    public static void main(String[] args) {

        Person[] p1 = new Person[5];

        Person person1 = new Person(1,"Kevin","Mortensen",12);
        Person person2 = new Person(2,"Emil","Emilsen",12);
        Person person3 = new Person(3,"Test","Testermand",4);
        Person person4 = new Person(4,"Søren","Slemmedreng",2.3);
        Person person5 = new Person(5,"Flotte","Fyr",5.6);

        p1[0] =person1;
        p1[1] =person2;
        p1[2] =person3;
        p1[3] =person4;
        p1[4] =person5;

        bubblesortKar(p1);

        for(int i=0; i<p1.length; i++)
        {
            System.out.println(p1[i].getFnavn());
        }
    }
}
