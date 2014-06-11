package VM5000;import javax.swing.*;
import java.awt.*;

public class MeinLabel extends JLabel {

    public MeinLabel(String name, boolean opaque, Color color) {

        setText(name);
        setHorizontalAlignment(SwingConstants.CENTER);
        setOpaque(opaque);
        setBackground(color);

    }

    public MeinLabel(Icon icon, boolean opaque, Color color) {

        setIcon(icon);
        setHorizontalAlignment(SwingConstants.CENTER);
        setOpaque(opaque);
        setBackground(color);

    }

}
