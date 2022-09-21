/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PracticaTeclado;
import java.io.*;
/**
 *
 * @author danic
 */
public class Teclado {

    /**
     *@return 
     */

    public static char LeeCaracter() {
        // TODO code application logic here
        char ch;
        try {
            ch = LeeCadena().charAt(0);
        } 
        catch(Exception e){
            ch =0;
        }
        return ch;
    }
    
    public static String LeeCadena(){
        BufferedReader br = new BufferedReader(new InputStreamReader
        (System.in));
        String str;
        try {
            str = br.readLine();
        }
        catch (IOException e){
            str = "";
        }
        return str;
    }
    public static int LeeEntero(){
        int num;
        try {
            num = Integer.parseInt(LeeCadena().trim());
        }
        catch (Exception e){
            num = 0;
        }
        return num;
    }
}
   
    

