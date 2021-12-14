
package devj120_lab4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class SimpleEditorListener extends WindowAdapter implements ActionListener, AutoCloseable{
    
    private SimpleEditor editor;
    private File file;
    private FileReader reader;
    private FileWriter writer;

    public SimpleEditorListener(SimpleEditor editor) {
        this.editor = editor;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void close() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
