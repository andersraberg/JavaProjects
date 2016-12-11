package layout;

import java.awt.GridBagConstraints;

public class ConstraintUtils {

	private ConstraintUtils() {
	}

	public static GridBagConstraints simpleConstraints(int x, int y, int width, int height) {
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = x;
		c.gridy = y;
		c.gridwidth = width;
		c.gridheight = height;
		return c;
	}
}
