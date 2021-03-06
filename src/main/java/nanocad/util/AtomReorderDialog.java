package nanocad.util;

import java.awt.*;
/**
 * This type was generated by a SmartGuide.
 */
public class AtomReorderDialog extends Dialog {
	private Panel ivjAtomReorderPane = null;
	private Panel ivjContentsPane = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private Button ivjCancelButton = null;
	private Button ivjCommitButton = null;
	private Button ivjDownButton = null;
	private Button ivjUpButton = null;
	private List ivjPropertyList = null;
	private boolean wasCancelled = true;

class IvjEventHandler implements java.awt.event.ActionListener, java.awt.event.WindowListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == AtomReorderDialog.this.getUpButton()) 
				connEtoC2(e);
			if (e.getSource() == AtomReorderDialog.this.getDownButton()) 
				connEtoC3(e);
			if (e.getSource() == AtomReorderDialog.this.getCancelButton()) 
				connEtoC1(e);
			if (e.getSource() == AtomReorderDialog.this.getCommitButton()) 
				connEtoC5(e);
		};
		public void windowActivated(java.awt.event.WindowEvent e) {};
		public void windowClosed(java.awt.event.WindowEvent e) {};
		public void windowClosing(java.awt.event.WindowEvent e) {
			if (e.getSource() == AtomReorderDialog.this) 
				connEtoC6(e);
		};
		public void windowDeactivated(java.awt.event.WindowEvent e) {};
		public void windowDeiconified(java.awt.event.WindowEvent e) {};
		public void windowIconified(java.awt.event.WindowEvent e) {};
		public void windowOpened(java.awt.event.WindowEvent e) {};
	};
/**
 * Constructor
 * @param parent Symbol
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public AtomReorderDialog(Frame parent) {
	super(parent);
	initialize();
}
	public void addItem(String item)
	{
		int i = -1 ;
		boolean itemFound = false;
		int val = atomicNumberOf(item);
	    while(i+1<ivjPropertyList.getItemCount())
	    {
	        i++;
	        String lItem = ivjPropertyList.getItem(i);
	        int compVal = atomicNumberOf(lItem);
	        if (val < compVal)
	        {
	            ivjPropertyList.addItem(item,i);
	            return;
	        }	        
	    }
	    ivjPropertyList.addItem(item);
		return;
	}
/**
 * Insert the method's description here.
 * Creation date: (6/21/00 3:26:03 PM)
 * @return int
 * @param aListItem java.lang.String
 */
public static int atomicNumberOf(String aListItem) {
	return Integer.parseInt(aListItem.substring(0,aListItem.indexOf(" ")));
}
/**
 * Comment
 */
public void atomReorder_WindowClosing(java.awt.event.WindowEvent windowEvent) {
	wasCancelled = true;
	setVisible(false);
	return;
}
/**
 * Comment
 */
public void commitButton_ActionPerformed(java.awt.event.ActionEvent actionEvent) {
	if(getSelectedIndex() < 0) return;
	atomReorder_WindowClosing(null);
	wasCancelled = false;
	return;
}
/**
 * connEtoC1:  (CancelButton.action.actionPerformed(java.awt.event.ActionEvent) --> AtomReorderDialog.atomReorder_WindowClosing(Ljava.awt.event.WindowEvent;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC1(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.atomReorder_WindowClosing(null);
		// user code begin {2}
		// user code end
	} catch (Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC2:  (UpButton.action.actionPerformed(java.awt.event.ActionEvent) --> AtomReorder.upButton_ActionPerformed(Ljava.awt.event.ActionEvent;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC2(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.upButton_ActionPerformed(arg1);
		// user code begin {2}
		// user code end
	} catch (Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC3:  (DownButton.action.actionPerformed(java.awt.event.ActionEvent) --> AtomReorder.downButton_ActionPerformed(Ljava.awt.event.ActionEvent;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC3(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.downButton_ActionPerformed(arg1);
		// user code begin {2}
		// user code end
	} catch (Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC5:  (CommitButton.action.actionPerformed(java.awt.event.ActionEvent) --> AtomReorderDialog.commitButton_ActionPerformed(Ljava.awt.event.ActionEvent;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC5(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.commitButton_ActionPerformed(arg1);
		// user code begin {2}
		// user code end
	} catch (Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC6:  (AtomReorder.window.windowClosing(java.awt.event.WindowEvent) --> AtomReorderDialog.atomReorder_WindowClosing(Ljava.awt.event.WindowEvent;)V)
 * @param arg1 java.awt.event.WindowEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC6(java.awt.event.WindowEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.atomReorder_WindowClosing(arg1);
		// user code begin {2}
		// user code end
	} catch (Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * Insert the method's description here.
 * Creation date: (6/21/00 11:51:39 AM)
 * @return boolean
 */
public boolean dialogWasCancelled() {
	return wasCancelled;
}
/**
 * Comment
 */
public void downButton_ActionPerformed(java.awt.event.ActionEvent actionEvent) {
	List list = getPropertyList();
	String itemToMove = getSelectedItem();
	int currentIndex = getSelectedIndex();
	if (currentIndex == (list.getItemCount() -1 )) return;
	if (atomicNumberOf(list.getItem(currentIndex + 1 )) != atomicNumberOf(itemToMove))
		return;
	((Frame1) getParent()).getFile().demoteProperty(currentIndex);
	list.delItem(currentIndex);
	list.addItem(itemToMove, currentIndex+1);
	list.select(currentIndex+1);
	return;
}
/**
 * Return the AtomReorderPane property value.
 * @return java.awt.Panel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private Panel getAtomReorderPane() {
	if (ivjAtomReorderPane == null) {
		try {
			ivjAtomReorderPane = new Panel();
			ivjAtomReorderPane.setName("AtomReorderPane");
			ivjAtomReorderPane.setLayout(null);
			getAtomReorderPane().add(getPropertyList(), getPropertyList().getName());
			getAtomReorderPane().add(getUpButton(), getUpButton().getName());
			getAtomReorderPane().add(getDownButton(), getDownButton().getName());
			getAtomReorderPane().add(getCommitButton(), getCommitButton().getName());
			getAtomReorderPane().add(getCancelButton(), getCancelButton().getName());
			// user code begin {1}
			// user code end
		} catch (Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjAtomReorderPane;
}
/**
 * Return the CancelButton property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private Button getCancelButton() {
	if (ivjCancelButton == null) {
		try {
			ivjCancelButton = new Button();
			ivjCancelButton.setName("CancelButton");
			ivjCancelButton.setBounds(258, 209, 56, 23);
			ivjCancelButton.setLabel("Cancel");
			// user code begin {1}
			// user code end
		} catch (Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjCancelButton;
}
/**
 * Return the CommitButton property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private Button getCommitButton() {
	if (ivjCommitButton == null) {
		try {
			ivjCommitButton = new Button();
			ivjCommitButton.setName("CommitButton");
			ivjCommitButton.setBounds(258, 181, 56, 23);
			ivjCommitButton.setLabel("Commit");
			// user code begin {1}
			// user code end
		} catch (Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjCommitButton;
}
/**
 * Return the ContentsPane property value.
 * @return java.awt.Panel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private Panel getContentsPane() {
	if (ivjContentsPane == null) {
		try {
			ivjContentsPane = new Panel();
			ivjContentsPane.setName("ContentsPane");
			ivjContentsPane.setLayout(new BorderLayout());
			getContentsPane().add(getAtomReorderPane(), "Center");
			// user code begin {1}
			// user code end
		} catch (Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjContentsPane;
}
/**
 * Return the DownButton property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private Button getDownButton() {
	if (ivjDownButton == null) {
		try {
			ivjDownButton = new Button();
			ivjDownButton.setName("DownButton");
			ivjDownButton.setBounds(258, 36, 56, 23);
			ivjDownButton.setEnabled(true);
			ivjDownButton.setLabel("Down");
			// user code begin {1}
			// user code end
		} catch (Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjDownButton;
}
/**
 * Insert the method's description here.
 * Creation date: (6/21/00 12:02:08 PM)
 * @return int
 */
public String getItem(int index) {
	return getPropertyList().getItem(index);
}
/**
 * Insert the method's description here.
 * Creation date: (6/21/00 12:02:08 PM)
 * @return int
 */
public int getItemCount() {
	return getPropertyList().getItemCount();
}
/**
 * Return the List1 property value.
 * @return java.awt.List
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private List getPropertyList() {
	if (ivjPropertyList == null) {
		try {
			ivjPropertyList = new List();
			ivjPropertyList.setName("PropertyList");
			ivjPropertyList.setBounds(10, 10, 245, 224);
			// user code begin {1}
			// user code end
		} catch (Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjPropertyList;
}
/**
 * Insert the method's description here.
 * Creation date: (6/21/00 11:26:13 AM)
 * @return int
 */
public int getSelectedIndex() {
	return getPropertyList().getSelectedIndex();
}
/**
 * Insert the method's description here.
 * Creation date: (6/21/00 11:26:13 AM)
 * @return int
 */
public String getSelectedItem() {
	return getPropertyList().getSelectedItem();
}
/**
 * Return the UpButton property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private Button getUpButton() {
	if (ivjUpButton == null) {
		try {
			ivjUpButton = new Button();
			ivjUpButton.setName("UpButton");
			ivjUpButton.setBounds(258, 8, 56, 23);
			ivjUpButton.setEnabled(true);
			ivjUpButton.setLabel("Up");
			// user code begin {1}
			// user code end
		} catch (Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	}
	return ivjUpButton;
}
/**
 * Called whenever the part throws an exception.
 * @param exception java.lang.Throwable
 */
private void handleException(Throwable exception) {

	/* Uncomment the following lines to print uncaught exceptions to stdout */
	// System.out.println("--------- UNCAUGHT EXCEPTION ---------");
	// exception.printStackTrace(System.out);
}
/**
 * Initializes connections
 * @exception Exception The exception description.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initConnections() throws Exception {
	// user code begin {1}
	// user code end
	getUpButton().addActionListener(ivjEventHandler);
	getDownButton().addActionListener(ivjEventHandler);
	this.addWindowListener(ivjEventHandler);
	getCancelButton().addActionListener(ivjEventHandler);
	getCommitButton().addActionListener(ivjEventHandler);
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
	try {
		// user code begin {1}
		// user code end
		setName("AtomReorder");
		setLayout(new BorderLayout());
		setSize(337, 288);
		setTitle("atomReorder");
		add(getContentsPane(), "Center");
		initConnections();
	} catch (Throwable ivjExc) {
		handleException(ivjExc);
	}
	// user code begin {2}
	// user code end
}
/**
 * Starts the application.
 * @param args an array of command-line arguments
 */
public static void main(String[] args) {
	try {
		/* Create the frame */
		AtomReorderDialog aAtomReorder = new AtomReorderDialog(null);
		/* Add a windowListener for the windowClosedEvent */
		aAtomReorder.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosed(java.awt.event.WindowEvent e) {
				System.exit(0);
			};
		});
		aAtomReorder.setVisible(true);
	} catch (Throwable exception) {
		System.err.println("Exception occurred in main() of AtomReorder");
		exception.printStackTrace(System.out);
	}
}
/**
 * Insert the method's description here.
 * Creation date: (6/23/00 1:47:28 PM)
 */
public void openForReorder() {
		getUpButton().setVisible(true);
		getDownButton().setVisible(true);
		getCancelButton().setVisible(false);
		setVisible(true);
	}
/**
 * Insert the method's description here.
 * Creation date: (6/23/00 1:47:28 PM)
 */
public void openForSelect() {
		getUpButton().setVisible(false);
		getDownButton().setVisible(false);
		getCancelButton().setVisible(true);
		setVisible(true);
	}
public List PropertyList() {
	return getPropertyList();
}
/**
 * Insert the method's description here.
 * Creation date: (6/21/00 12:05:12 PM)
 * @param index int
 */
public void removeItem(int index) {
	getPropertyList().delItem(index);
}
/**
 * Comment
 */
public void upButton_ActionPerformed(java.awt.event.ActionEvent actionEvent) {
	List list = getPropertyList();
	String itemToMove = getSelectedItem();
	int currentIndex = getSelectedIndex();
	if (currentIndex == 0) return;
	if (atomicNumberOf(list.getItem(currentIndex - 1 )) != atomicNumberOf(itemToMove))
		return;
	((Frame1) getParent()).getFile().promoteProperty(currentIndex);
	list.delItem(currentIndex);
	list.addItem(itemToMove, currentIndex - 1);
	list.select(currentIndex -1);
	return;
}
}
