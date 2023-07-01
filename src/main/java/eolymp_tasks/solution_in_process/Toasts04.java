package eolymp_tasks.solution_in_process;

public class Toasts04 {
    public static void main(String[] args) {
        Toasts04 toasts = new Toasts04();
        toasts.doToasts(3, 2);
    }

    private void doToasts(int toasts, int panCapacity) {

        int amountFrying = 0;
        if(toasts<=panCapacity){
            amountFrying++;
            int time = (amountFrying*2)*2;
            System.out.println("int = "+time);
        }else {
            int fullPanCount = toasts/panCapacity;
            int reminderToasts = toasts%panCapacity;
            if(reminderToasts == 0){
                int time = (fullPanCount*2)*2;
                System.out.println("time = "+time);
            }else {
                int reminderTime = 6;
                int fullTime = (fullPanCount-1)*4;
                int time = reminderTime+fullTime;
                System.out.println("time + reminder = "+time);
            }
        }
    }
}
