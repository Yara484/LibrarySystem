package librarysystem;

import java.io.IOException;

abstract public class BaseClass {
    public String name;
    public String author;
    public String ID;
    abstract public void get_data(); 
    abstract public void add_file() throws IOException;
}
