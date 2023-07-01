package eckelBook.working_with_objects;

public class StatMethodDemo {
    public static void main(String[] args) {
        StatMethodDemo statMethodDemo = new StatMethodDemo();
        statMethodDemo.run();

    }

    private void run() {
        String text = "values Taylor`s row for sinus:";
        for (int k = 0; k < 8; k++) {
            text += "\nterms "+ (k+1)+": ";
            text += "sin(pi/4)="+MyMath.sin(MyMath.PI/4,k);
        }
        System.out.println(text);
    }
}
