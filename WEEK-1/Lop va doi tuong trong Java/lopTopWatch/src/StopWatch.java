import java.util.Scanner;

public class StopWatch {

        private long startTime = 0;
        private long stopTime = 0;
        private boolean running = false;

        public void start() {
            this.startTime = System.currentTimeMillis();
            this.running = true;
        }

        public void stop() {
            this.stopTime = System.currentTimeMillis();
            this.running = false;
        }

        public void setStartTime(long startTime) {
            this.startTime = startTime;
        }
        public void setStopTime(long stopTime){
            this.stopTime = stopTime;
        }

        public long getStartTime() {
            return startTime;
        }

        public long getStopTime() {
            return stopTime;
        }

    //elaspsed time in milliseconds
        public long getElapsedTime() {
            long elapsed;
            if (running) {
                elapsed = (System.currentTimeMillis() - startTime);
            } else {
                elapsed = (stopTime - startTime);
            }
            return elapsed;
        }

        //elaspsed time in seconds
        public long getElapsedTimeSecs() {
            long elapsed;
            if (running) {
                elapsed = ((System.currentTimeMillis() - startTime) / 1000);
            } else {
                elapsed = ((stopTime - startTime) / 1000);
            }
            return elapsed;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Start: ");
//        long startTime = sc.nextLong();
//        System.out.println("End:");
//        long stopTime = sc.nextLong();
        StopWatch watch = new StopWatch();
//        watch.setStartTime(startTime);
//        watch.setStopTime(stopTime);
        watch.start();
        watch.stop();
        watch.getElapsedTime();
        watch.getElapsedTimeSecs();
    }
}
