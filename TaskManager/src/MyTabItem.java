import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class MyTabItem {

	private Composite contentAreaComposite;
	private TabItem tabItem;

	//default constructor used to create a new tab with a tab name
	public MyTabItem(TabFolder parent, int style, Object args) {

		tabItem = new TabItem(parent, style);
		tabItem.setText((String) args);
		
		
		
		contentAreaComposite=new Composite(parent,style);
		tabItem.setControl(contentAreaComposite);

		contentAreaComposite.setBackground(new Color(Display.getCurrent(),0,255,255));
		
		
	}

	
	
	//to do another constructor used to construct a tab with data
	
	
	public void setBackground(Color color)
	{
		contentAreaComposite.setBackground(color);
	}
	
	//todo method used to populate data
	
	
	// a row of buttons to do different things.
	
	
	
	

}
