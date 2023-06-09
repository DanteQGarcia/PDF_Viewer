

package pdf_viewer;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import static java.awt.Frame.HAND_CURSOR;
import javax.swing.JScrollBar;


public class ScrollBarCustomTabla extends JScrollBar{
public ScrollBarCustomTabla() {
        setUI(new ModernScrollBarUITabla());
        setPreferredSize(new Dimension(9, 9));
        setForeground(new Color(197, 197, 197));
        setBackground(new Color(242, 242, 242));
        setCursor(new Cursor(HAND_CURSOR));
        
        setUnitIncrement(10); //velocidad de scroll
    }
}
