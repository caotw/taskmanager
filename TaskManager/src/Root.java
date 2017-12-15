import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Root {




	private final static Point shellSize=new Point(1080,720);
	
	
	
	/**
	 * Launch the application.
	 * @param args
	 */

	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(shellSize);
		shell.setText("");

		shell.open();
		shell.layout();

		createMainWindow(shell);
		
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}

		
	}
	

	static void createMainWindow(Shell shell)
	{
		 mainScreen mainScreen=new mainScreen((Composite)shell);
	}
	
	public Point getSize()
	{
		return shellSize;
	}

}
