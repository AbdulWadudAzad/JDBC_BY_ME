
package com.coderBD;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Util {
  public static void wrightToFile(String filename, List<Student> students) {
      File destfile=new File(filename+".txt");
      try{
          if(destfile.exists()==false){
              System.out.println("Create a new file");
              destfile.createNewFile();
          }
          PrintWriter out=new PrintWriter(new FileWriter(destfile,true));
          for(Student s:students){
              out.append(s.getId()+", "+s.getName()+", "+s.getEmail()+"\n");
          }
          out.close();
          
      }catch(IOException e){
          System.out.println("Could not log!");
      }
              
    }
    
    public static void readFromFile(String filename, DefaultTableModel model) {
        String line;
        BufferedReader reader;
        try{
            reader=new BufferedReader(new FileReader(filename+".txt"));
            while ((line=reader.readLine()) !=null) {
               model.addRow(line.split(", "));
                
            }
            reader.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Buffer reader issue");
        }
    }
 
}
