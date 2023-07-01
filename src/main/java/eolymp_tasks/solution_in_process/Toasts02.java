package eolymp_tasks.solution_in_process;

public class Toasts02 {
    public static void main(String[] args) {
        Toasts02 toasts = new Toasts02();
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
