
package librarysystem;

import java.io.IOException;
import static javafx.application.Platform.exit;
import javax.swing.JOptionPane;

public class Option {
    public String choose;
    public void choice() throws IOException {
        
        choose = JOptionPane.showInputDialog("Do you want to add a book or magazine?");
        if (choose.equals("book")) {
                Book book = new Book();
                book.add_file();
            }
            else if (choose.equals("magazine")){
                Magazine magazine = new Magazine();
                magazine.add_file();
            }
            else exit();
    }  
}
