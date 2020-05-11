
package librarysystem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Magazine extends BaseClass {
    public void get_data() {
        name = JOptionPane.showInputDialog("Enter name of magazine ");
        author = JOptionPane.showInputDialog("Enter author of magazine ");
        ID = JOptionPane.showInputDialog("Enter ID of magazine ");
    }
    public void add_file() throws IOException{
        get_data();
        String filename= "G:\\MagazineList.txt";
         BufferedWriter x = new BufferedWriter(new FileWriter (filename));
         x.write(this.name + " ");
         x.write(this.author + " ");
         x.write(this.ID + " ");
         x.close();
       }
}
