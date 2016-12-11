package layout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public ButtonPanel() {
		super(new GridBagLayout());
		Insets insets = new Insets(0, 0, 0, 0);
		add(new JLabel("Alpha"),
				new GridBagConstraints(0, 0, 2, 1, 0, 0, GridBagConstraints.WEST, 0, insets, 0, 0));
		
		add(new JLabel("Beta"), 
				new GridBagConstraints(0, 2, 1, 1, 0, 0, GridBagConstraints.WEST, 0, insets, 0, 0));
		
		add(new JCheckBox("On", false), 
				new GridBagConstraints(1, 2, 1, 1, 0, 0, GridBagConstraints.WEST, 0, insets, 0, 0));
		
		add(new JLabel("Gamma"), 
				new GridBagConstraints(0, 3, 1, 1, 0, 0, GridBagConstraints.WEST, 0, insets, 0, 0));
		
		add(new JCheckBox("Off", false),
				new GridBagConstraints(1, 3, 1, 1, 0, 0, GridBagConstraints.WEST, 0, insets, 0, 0));
		
		setBorder(BorderFactory.createEtchedBorder());
	}
}
