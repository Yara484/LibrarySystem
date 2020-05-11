
package librarysystem;

import java.io.IOException;
import static javafx.application.Platform.exit;
import javax.swing.JOptionPane;

public class Reload {
    public String answer;
    public String answer2;
    public void Reload() throws IOException {
         
            answer2 = JOptionPane.showInputDialog("Do you want to add a new book or magazine or exit?");
            if (answer2.equals("book")) {
                Book book = new Book();
                book.add_file();
            }
            else if (answer2.equals("magazine")){
                Magazine magazine = new Magazine();
                magazine.add_file();
            }
            else exit();
        
             
       }
    }    
   

