public class Newspaper implements Resource {
    private String newspaper;

    public Newspaper(String newspaperParam) {
        this.newspaper = newspaperParam;
    }

    @Override
    public void borrow() {
        System.out.println("A student has borrowed the newspaper titled '" + newspaper + '"');

    }
}