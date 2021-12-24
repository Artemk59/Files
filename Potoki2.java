package Potoki2;

public class Potoki2 {

	    public static void main(String[] args) {

	        int[] mass = new int[10000000];
	        for (int i = 0; i < mass.length; i++) {
	            mass[i] = i+1;
	        }

	        long startTime = System.currentTimeMillis();
	        
	        //1 thread
	       // Writer thread1 = new Writer(mass);
	       // thread1.start();
	        
	        // 2 thread
	       /* int[] mass1 = new int[mass.length/2];
	        for (int i = 0; i < mass.length/2; i++) {
	            mass1[i] = i+1;
	        }
	        Writer thread1 = new Writer(mass1);
	        thread1.start();
	        
	        int[] mass2 = new int[mass.length/2];
	        for (int i = 0; i < mass.length/2; i++) {
	            mass2[i] = mass.length/2+i;
	        }
	        Writer thread2 = new Writer(mass2);
	        thread2.start();
*/

	        int[] mass1 = new int[mass.length/4];
	        for (int i = 0; i < mass.length/4; i++) {
	        	mass1[i] = i+1;
	        }
	        Writer thread1 = new Writer(mass1);
	        thread1.start();

	        int[] mass2 = new int[mass.length/4];
	        for (int i = 0; i < mass.length/4; i++) {
	            mass2[i] = mass.length/4+i;
	        }
	        Writer thread2 = new Writer(mass2);
	        thread2.start();

	        int[] mass3 = new int[mass.length/4];
	        for (int i = 0; i < mass.length/4; i++) {
	            mass3[i] = mass.length/2+i;
	        }
	        Writer thread3 = new Writer(mass3);
	        thread3.start();

	        int[] mass4 = new int[mass.length/4];
	        for (int i = 0; i < mass.length/4; i++) {
	            mass4[i] = mass.length*3/4+i;
	        }
	        Writer thread4 = new Writer(mass4);
	        thread4.start();

	        try {
	        	thread1.join();
	        	thread2.join();
	        	thread3.join();
	        	thread4.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.println("Total execution time: " + (System.currentTimeMillis() - startTime + " ms"));
	    }
//thread1 time: 2333
//thread2 time: 1613
//thread4 time: 1277
	}
