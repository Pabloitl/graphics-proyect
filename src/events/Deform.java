package events;

import gui.Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 * Deform
 */
public class Deform implements ActionListener {
    Window w;

    public Deform(Window w) {
        this.w = w;
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
        transforms.Deform.apply(w.figure,
            Integer.parseInt(JOptionPane.showInputDialog("X")),
            Integer.parseInt(JOptionPane.showInputDialog("Y")));

        w.repaint();
	}
}