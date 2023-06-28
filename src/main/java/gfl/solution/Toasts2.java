package gfl.solution;

public class Toasts2 {
    public static void main(String[] args) {
        Toasts2 toasts = new Toasts2();
        toasts.doToasts(3, 2);
    }

    private void doToasts(int toasts, int panCapacity) {

        int amountFrying = 0;
        if(toasts<=panCapacity){
            amountFrying++;
            int time = (amountFrying*2)*2;
            System.out.println("int = "+time);
        }
        if (toasts>panCapacity){

            double countFry = (double) toasts/panCapacity;
            System.out.println("double countFry = "+countFry);

            double amountMulti = (countFry*2)*2;
            System.out.println("double = "+amountMulti);
            int time = (int) amountMulti;
            System.out.println("int = "+time);



        }


    }
}
