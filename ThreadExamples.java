// A Class can utilize threads by extending the thread class
// A run method needs to be provided

// Threads can also implement runnable and override the run method
public class ThreadExamples extends Thread {

    public ThreadExamples(String name) {
        super(name);
    }

    public void run() {
        System.out.println("ThreadID = " + Thread.currentThread().getId());
        System.out.println(this.getName());
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.run();
    }

    public static void main(String[] args) {
        // create Thread objects by passing out Thread class to Thread object, as well as thread name
        Thread t1= new Thread(new ThreadExamples("Thread1"));
        Thread t2= new Thread(new ThreadExamples("Thread2"));
        Thread t3= new Thread(new ThreadExamples("Thread3"));
        Thread t4= new Thread(new ThreadExamples("Thread4"));
        Thread t5= new Thread(new ThreadExamples("Thread5"));
        
        // start threads
        // order of threads is not preserved
        // threads may run in any order, and that order may change each time 
        System.out.println("Starting Threads...");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();        
    }
}
