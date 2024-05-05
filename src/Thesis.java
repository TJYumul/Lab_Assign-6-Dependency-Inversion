public class Thesis implements Resource{
    private String thesisName;

    public Thesis(String thesesName) {
        this.thesisName = thesesName;
    }

    @Override
    public void borrow() {
        System.out.println("A student has borrowed the thesis named '" + thesisName + '"');

    }
}