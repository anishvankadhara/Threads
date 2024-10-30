import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<ThreadClass> Alist = new ArrayList<>();
        for (int i = 0; i < 1000 ; i++) {
            ThreadClass thread = new ThreadClass();
            Alist.add(thread);
        }
    }
}