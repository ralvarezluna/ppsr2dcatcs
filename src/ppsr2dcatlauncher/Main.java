package ppsr2dcatlauncher;

import java.io.File;
import java.io.IOException;

import javax.xml.datatype.DatatypeConfigurationException;

public class Main {

    public static void main(String[] args) throws IOException {
        Runner runner;
        try {
            String pathroute = new File("").getAbsolutePath();

            runner = new Runner(pathroute);
            Thread t1 = new Thread(new Runnable() {
                public void run() {
                    try {
                        runner.part1();
                    } catch (IOException | DatatypeConfigurationException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            });
            Thread t2 = new Thread(new Runnable() {
                public void run() {
                    try {
                        runner.part2();
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            });
            Thread t3 = new Thread(new Runnable() {
                public void run() {
                    try {
                        runner.part3();
                    } catch (IOException  e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            });
            Thread t4 = new Thread(new Runnable() {
                public void run() {
                    try {
                        runner.part4();
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                       
                    }
                }
            });
            t1.start();
            t2.start();
            Thread.sleep(1000);
            t3.start();
            t4.start();

            long startTime = System.currentTimeMillis();
            while (true) {
                if (System.currentTimeMillis() - startTime > 3000)
                    t4.interrupt();
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
           
        }

    }
}
