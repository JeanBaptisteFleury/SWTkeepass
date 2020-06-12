package com.jbfleury.swtkeepass;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridLayout;

public class MainWindow {

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
		shlSwtkeepass.setSize(450, 300);
		shlSwtkeepass.setText("SWTKeepass");
		shlSwtkeepass.setLayout(new GridLayout(1, false));
		
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

	}
}
