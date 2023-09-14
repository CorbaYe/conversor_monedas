package negocio;

import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
/**
 *
 * @author Yeison
 */
public class EventosMause {
    
    
    public void cambiarColor(java.awt.event.MouseEvent evt, javax.swing.JLabel lbl) {
        if (evt.getID() == java.awt.event.MouseEvent.MOUSE_ENTERED && !lbl.getForeground().equals(Color.RED)) {
            lbl.setForeground(Color.GRAY);
        } else if (evt.getID() == java.awt.event.MouseEvent.MOUSE_EXITED && !lbl.getForeground().equals(Color.RED)) {
            lbl.setForeground(Color.BLACK);
        }
    }
    
    public void seleccionarDivisa(MouseEvent evt, JLabel lbl, JLabel[] lbl2) {
        if (evt.getID() == MouseEvent.MOUSE_CLICKED && !lbl.getForeground().equals(Color.RED)) {
            for (JLabel label : lbl2) {
                label.setForeground(Color.BLACK);
            }
            lbl.setForeground(Color.RED);
        } else if (evt.getID() == java.awt.event.MouseEvent.MOUSE_CLICKED && lbl.getForeground().equals(Color.RED)) {
            lbl.setForeground(Color.BLACK);
        }
    } 
}
