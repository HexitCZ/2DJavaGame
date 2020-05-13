package UI;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Window
{
	public static StringBuilder mapToRender = new StringBuilder();
	private static String map;
	public static JTextArea txt = new JTextArea();
	public static JTextField input = new JTextField();

	public static void RenderMap()
	{
		map = null;
		map = mapToRender.toString();

		txt.setText(null);
		txt.selectAll();
		txt.replaceSelection("");
		txt.setText(map);
		txt.setFocusable(false);

		txt.setAlignmentY(JTextArea.CENTER_ALIGNMENT);
	}

}
