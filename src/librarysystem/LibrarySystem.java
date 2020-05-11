package librarysystem;

import java.io.IOException;
import javax.swing.JOptionPane;

public class LibrarySystem {
    
    public static void main(String[] args) throws IOException {
        
        Option obj = new Option();
        obj.choice();
        
        String ans;
        String ans2;
        
        ans = JOptionPane.showInputDialog("Do you want to continue adding to your library?");
        while (ans.equals("yes")) {
            Reload x = new Reload();
            x.Reload();
            ans = JOptionPane.showInputDialog("Do you want to continue adding to your library?");
        }
                
        
    }
    
}
