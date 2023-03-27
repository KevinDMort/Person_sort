public class Person implements Comparable <Person> {
    private int stdnr;
    private String fnavn;
    private String enavn;
    private double gennemsnitkar;

    public Person(int stdnr, String fnavn, String enavn, double gennemsnitkar) {
        this.stdnr = stdnr;
        this.fnavn = fnavn;
        this.enavn = enavn;
        this.gennemsnitkar = gennemsnitkar;
    }
    public Person()
    {

    }

    public int getStdnr() {
        return stdnr;
    }

    public void setStdnr(int stdnr) {
        this.stdnr = stdnr;
    }

    public String getFnavn() {
        return fnavn;
    }

    public void setFnavn(String fnavn) {
        this.fnavn = fnavn;
    }

    public String getEnavn() {
        return enavn;
    }

    public void setEnavn(String enavn) {
        this.enavn = enavn;
    }

    public double getGennemsnitkar() {
        return gennemsnitkar;
    }

    public void setGennemsnitkar(double gennemsnitkar) {
        this.gennemsnitkar = gennemsnitkar;
    }
    @Override
    public String toString() {
        return "Person{" +
                "stdnr=" + stdnr +
                ", fnavn='" + fnavn + '\'' +
                ", enavn='" + enavn + '\'' +
                ", gennemsnitkar=" + gennemsnitkar +
                '}';
    }


    @Override
    public int compareTo(Person that) {
        if(this.getGennemsnitkar()>that.getGennemsnitkar())
            return -1;
        if(this.gennemsnitkar == that.gennemsnitkar)
            return 0;
        else
            return 1;
    }
}
