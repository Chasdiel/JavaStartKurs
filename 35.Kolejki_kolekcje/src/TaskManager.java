import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Chasdiel on 2018-02-27.
 */
public class TaskManager {
    public static void main(String[] args) {
        TaskManager tm = new TaskManager();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            tm.mainLoop(br);
        } catch (Exception e){
            System.err.println("Coś poszło nie tak.");
        }
    }

    private void printOptions(){
        for (Option o : Option.values()){
            System.out.println(o);
        }
    }

    private void mainLoop(BufferedReader br) throws IOException {
        Queue<Task> taskQueue = new PriorityQueue<>();

        Option next = null;
        while (next == null || next != Option.EXIT) {
            printOptions();
            next = Option.createFromInt(Integer.parseInt(br.readLine()));
            switch (next) {
                case ADD:
                    taskQueue.offer(readAndCreateTask(br));
                    break;
                case TAKE:
                    takeTask(taskQueue.poll());
                    break;
                case EXIT:
                    System.out.println("Papa!");
            }
        }
    }

    private Task readAndCreateTask(BufferedReader br) throws IOException {
        System.out.println("Podaj nazwę zadania: ");
        String name = br.readLine();
        System.out.println("Podaj opis zadania: ");
        String desc = br.readLine();
        System.out.println("Podaj priorytet (LOW, MODERATE, HIGH): ");
        Task.Priority priority = Task.Priority.valueOf(br.readLine().toUpperCase());
        System.out.println("Zadanie zostało dodane\n");

        return new Task(name, desc, priority);
    }

    private void takeTask(Task task) {
        System.out.println("Zadanie do wykonania: ");
        System.out.println(task);
    }

    private enum Option{
        ADD(0, "Dodaj zadanie"), TAKE (1, "Zrób kolejne zadanie"), EXIT(2, "Wyjdź");

        int option;
        String desc;
        Option(int opt, String desc) {
            this.option = opt;
            this.desc = desc;
        }

        static Option createFromInt(int option){
            return Option.values()[option];
        }

        @Override
        public String toString() {
            return option + " - " + desc;
        }
    }
}
