public class Capstone implements Resource{
    private String capstoneName;

    public Capstone(String capstoneName) {
        this.capstoneName = capstoneName;
    }

    @Override
    public void borrow() {
        System.out.println("A student has borrowed information regarding the capstone project titled '" + capstoneName + "'.");
    }
}