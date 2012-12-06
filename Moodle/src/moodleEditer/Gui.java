package moodleEditer;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;


public class Gui extends JFrame {
	   
	   // reference for manipulating multiple document interface
	   private JDesktopPane desktop;

	   // references to Actions
	   Action newAction, saveAction, deleteAction, 
	      searchAction, exitAction;
	   
	   // set up database connection and GUI
	   public Gui() 
	   {
	      super( "Main Pan" );

	      // database connection successful, create GUI
	      JToolBar toolBar = new JToolBar();
	      JMenu fileMenu = new JMenu( "File" );
	      fileMenu.setMnemonic( 'F' );
	      

	      exitAction = new ExitAction();
	      fileMenu.add( exitAction );
	      
	      // set up menu bar
	      JMenuBar menuBar = new JMenuBar();
	      menuBar.add( fileMenu );
	      setJMenuBar( menuBar );
	      
	      // set up desktop
	      desktop = new JDesktopPane();
	      
	      // get the content pane to set up GUI
	      Container c = getContentPane();
	      c.add( toolBar, BorderLayout.NORTH );
	      c.add( desktop, BorderLayout.CENTER );
	      
	      // register for windowClosing event in case user 
	      // does not select Exit from File menu to terminate
	      // application
	      addWindowListener( 
	         new WindowAdapter() {
	            public void windowClosing( WindowEvent event )
	            {
	               shutDown();
	            }
	         }
	      );
	      
	      // set window size and display window
	      Toolkit toolkit = getToolkit();
	      Dimension dimension = toolkit.getScreenSize();
	      
	      // center window on screen
	      setBounds( 100, 100, dimension.width - 200, 
	         dimension.height - 200 );
	      
	      setVisible( true );
	   }  // end AddressBook constructor
	     
	   // close database connection and terminate program
	   private void shutDown()
	   {
	      System.exit( 0 );   // terminate program
	   }

	   private class ExitAction extends AbstractAction {
	      
	      // set up action's name, descriptions and mnemonic
	      public ExitAction()
	      {
	         putValue( NAME, "Exit" );
	         putValue( SHORT_DESCRIPTION, "Exit" );
	         putValue( LONG_DESCRIPTION, "Terminate the program" );
	         putValue( MNEMONIC_KEY, new Integer( 'x' ) );
	      }
	      
	      // terminate program
	      public void actionPerformed( ActionEvent e )
	      {
	         shutDown();  // close database connection and terminate
	      }     
	      
	   }  // end inner class ExitAction 
	}
