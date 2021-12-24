package Potoki2;

import java.io.FileWriter;
import java.io.IOException;

public class Writer extends Thread{
    private int[] mass;

    public Writer(int[] mass) {
    	this.mass = mass;
    }

    public void run() {
        try (final FileWriter writer = new FileWriter("C:/Users/Àðò¸ì/eclipse/Letter.txt", true))
        {
            for (int i = 0; i < mass.length; i++)
            {
                writer.write(mass[i] + " ");    
            }
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}