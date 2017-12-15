import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class mainScreen {
	
	private Composite mainComposite;
	private TabFolder tabFolder;
	
	
	
	public mainScreen(Composite composite)
	{
		Device device=Display.getCurrent();
		mainComposite=new Composite(composite,SWT.NONE);
		mainComposite.setBackground(new Color(composite.getDisplay(), 0,0,0));
		mainComposite.setLocation(0,0);
		mainComposite.setSize(composite.getSize());
		
		
		tabFolder=new TabFolder(mainComposite,SWT.NONE);
		tabFolder.setLocation(20,20);
		tabFolder.setSize(800, 600);
		
		
		//to do 
		//create method for adding a new tab item
		
		MyTabItem item1=new MyTabItem(tabFolder,SWT.None,"ab");
		
		MyTabItem item2=new MyTabItem(tabFolder,SWT.None,"cd");
		item2.setBackground(new Color(Display.getCurrent(),0,0,0));
		tabFolder.getSelection();
	}
		

}
