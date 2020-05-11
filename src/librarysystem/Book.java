
package librarysystem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Book extends BaseClass  {
    
    public void get_data() {
        name = JOptionPane.showInputDialog("Enter name of book ");
        author = JOptionPane.showInputDialog("Enter author of book ");
        ID = JOptionPane.showInputDialog("Enter ID of book ");
    }
    public void add_file() throws IOException{
        get_data();
        String filename= "G:\\BookList.txt";
         BufferedWriter x = new BufferedWriter(new FileWriter (filename));
         x.write(this.name + " ");
         x.write(this.author + " ");
         x.write(this.ID + " ");
         x.close();
       }
}
