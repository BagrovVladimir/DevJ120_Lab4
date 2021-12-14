
package devj120_lab4;

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class SimpleEditor extends JFrame{
    
    //String title;
    private Container cp;
    private JLabel fileName;
    private JTextArea text;
    private JMenuBar bar;
    private JMenu[] menu;
    private JMenuItem[] commandMenu;
    private JButton commandButton;
    private SimpleEditorListener listener;
    
    protected SimpleEditor(){
    //setTitle("Simple text editor");
    setTitle("Simple text editor");
    setSize(800, 500);
    setLocation(400, 300);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    init();
    createMenu();
    setVisible(true);
    }

//    public void setTitle(String title) {
//        this.title = title;
//    }
    
    private void init(){
        
    }
    
    private void createMenu(){
        
    }
    
    void apppendText(String str, boolean append){
        
    }
    
    String getText(){
        return null;
    }
    

    public static void main(String[] args) {
        SimpleEditor simpleEditor = new SimpleEditor();
    }

    
}
