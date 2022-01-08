
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
    private JMenuItem[] commandMenuFile;
    private JMenuItem[] commandMenuEdit;
    private JButton[] commandButton;
    private SimpleEditorListener listener;
    
    protected SimpleEditor(){
    //setTitle("Simple text editor");
    setTitle("Simple text editor");
    setSize(800, 500);
    setLocation(400, 300);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    
    
    
    
    init();
    setJMenuBar(createMenu());
    createMenu();
    setVisible(true);
    }

//    public void setTitle(String title) {
//        this.title = title;
//    }
    
    private void init(){
        cp=getContentPane();
        cp.setLayout(new BorderLayout());
        JPanel buttonPanel= new JPanel(new FlowLayout());
        cp.add(buttonPanel, BorderLayout.NORTH);
        
        commandButton  = new JButton[4];
        commandButton[0] = new JButton("Open");
        commandButton[1] = new JButton("Save");
        commandButton[2] = new JButton("Cancel");
        commandButton[3] = new JButton("Exit");
        buttonPanel.add(commandButton[0]);
        buttonPanel.add(commandButton[1]);
        buttonPanel.add(commandButton[2]);
        buttonPanel.add(commandButton[3]);
        
        text = new JTextArea();
        cp.add(new JScrollPane(text), BorderLayout.CENTER);
    }
    
    private JMenuBar createMenu(){
        bar = new JMenuBar();
        menu = new JMenu[2];
        
        menu[0] = new JMenu("File");
        commandMenuFile = new JMenuItem[2];
        commandMenuFile[0] = new JMenuItem("Open");
        commandMenuFile[1] = new JMenuItem("Exit");
        menu[1] = new JMenu("Edit");
        commandMenuEdit = new JMenuItem[2];
        commandMenuEdit[0] = new JMenuItem("Save");
        commandMenuEdit[1] = new JMenuItem("Cancel");
        
        menu[0].add(commandMenuFile[0]);
        menu[0].add(commandMenuFile[1]);
        menu[1].add(commandMenuEdit[0]);
        menu[1].add(commandMenuEdit[1]);
        
        bar.add(menu[0]);
        bar.add(menu[1]);
        
       return bar;
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
