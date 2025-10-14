// Simulates a long-running task
class LongJob implements Runnable {
    private String jobName;
    private int num;

    public LongJob(String jobName, int time) {
        this.jobName = jobName;
        this.num = time;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(jobName + " started on " + threadName);

        try {
            // Simulate a long-running job (5 seconds)
            Thread.sleep(this.num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(jobName + " finished on " + threadName);
    }
}