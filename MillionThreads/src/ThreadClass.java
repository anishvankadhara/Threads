public class ThreadClass {

    public void run()
    {
        int sum = 0;
        try {
            for(int i = 0; i < 1000000; i++)
            {
                sum += i; 
            }

        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}
