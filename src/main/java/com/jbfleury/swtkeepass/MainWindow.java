package com.jbfleury.swtkeepass;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridData;
import swing2swt.layout.BorderLayout;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.ArmListener;
import org.eclipse.swt.events.ArmEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormLayout;
import swing2swt.layout.BoxLayout;
import com.jbfleury.swtkeepass.KdbxBrowser;

public class MainWindow {
	
	private Composite main_composite;
	private KdbxBrowser kdbx_browser_composite;

	protected Shell shlSwtkeepass;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainWindow window = new MainWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlSwtkeepass.open();
		shlSwtkeepass.layout();
		while (!shlSwtkeepass.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlSwtkeepass = new Shell();
		shlSwtkeepass.setSize(732, 561);
		shlSwtkeepass.setText("SWTKeepass");
		shlSwtkeepass.setLayout(new StackLayout());
		
		Menu menu = new Menu(shlSwtkeepass, SWT.BAR);
		shlSwtkeepass.setMenuBar(menu);
		
		MenuItem mntmFiles = new MenuItem(menu, SWT.CASCADE);
		mntmFiles.setText("File");
		
		Menu menu_1 = new Menu(mntmFiles);
		mntmFiles.setMenu(menu_1);
		
		MenuItem mntmNewItem = new MenuItem(menu_1, SWT.NONE);
		mntmNewItem.setText("Open File...");
		
		MenuItem mntmNewItem_1 = new MenuItem(menu_1, SWT.NONE);
		mntmNewItem_1.setText("Exit");
		
		MenuItem mntmHelp = new MenuItem(menu, SWT.CASCADE);
		mntmHelp.setText("Help");
		
		Menu menu_2 = new Menu(mntmHelp);
		mntmHelp.setMenu(menu_2);
		
		MenuItem mntmAboutSwtkeepass = new MenuItem(menu_2, SWT.NONE);

		mntmAboutSwtkeepass.setText("About SWTKeepass");
		
		main_composite = new Composite(shlSwtkeepass, SWT.NONE);
		main_composite.setLayout(new BorderLayout(0, 0));
		
		kdbx_browser_composite = new KdbxBrowser(shlSwtkeepass, SWT.NONE);
		kdbx_browser_composite.setLayout(new BorderLayout(0, 0));
		kdbx_browser_composite.setVisible(false);
		
		Label lblNewLabel = new Label(main_composite, SWT.NONE);
		lblNewLabel.setLayoutData(BorderLayout.CENTER);
		lblNewLabel.setText("Welcome");

		mntmAboutSwtkeepass.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("About btn clicked");
				main_composite.setVisible(false);
				main_composite.dispose();
				kdbx_browser_composite.setVisible(true);
			}
		});
	}
}
