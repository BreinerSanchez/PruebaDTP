package com.appgate.dtp.l2;
import java.io.*;

import javax.sound.midi.Soundbank;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        File archivo=new File("/workspaces/L2-Test-main/data/dominios.txt");
        String cadena;
        System.out.println( archivo.exists());

        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        int CTLD1 = 0;
        while ((cadena = b.readLine())!=null) {

            String TLD1="";
            String TLD2="";
            System.out.println(cadena);
            
            int Longitud=cadena.length();
            System.out.println(Longitud);
            
            int pos=cadena.indexOf('.');
            System.out.println(pos);
            
            String TLD = cadena.substring(pos+1, Longitud-1);
            System.out.println(TLD);
            
            if (TLD == TLD1) {

                CTLD1 = CTLD1 + 1;
                TLD1 = TLD;
            } else {
                TLD1 = TLD;
            }

        }
        b.close();
        System.out.println(CTLD1 +" " );
    }
}
