import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyNotepad implements ActionListener 
{
	private JFrame f;
	private JScrollPane sp;
	private JPanel p1;

	private JTextArea ta;
	private JButton bLoad, bSave, bClear, bClose;
	
	private static String FileName;

	public MyNotepad() 
	{
	
		f = new JFrame("CJ's Simple Notepad");
		p1 = new JPanel();
		
		ta = new JTextArea(200,175);
		
		bLoad = new JButton("Load " + FileName);
		bSave = new JButton("Save " + FileName);
		bClear = new JButton("Clear " + FileName);
		bClose = new JButton("Close " + FileName);
		
	}

	public void launchFrame() 
	{
	
		sp = new JScrollPane(ta);

		p1.setLayout(new GridLayout(1,4));
		p1.add(bLoad);
		p1.add(bSave);
		p1.add(bClear);
		p1.add(bClose);
		
		f.setSize(640,480);	
		f.add(p1, BorderLayout.SOUTH);
		f.add(sp, BorderLayout.CENTER);
        f.add(sp);
		f.setVisible(true);
		
		bLoad.addActionListener(this);
		bSave.addActionListener(this);
		bClear.addActionListener(this);
		bClose.addActionListener(this);
		
		f.addWindowListener(new MyCloseButtonHandler());
	}
	
	public void actionPerformed(ActionEvent ae) 
	{
	
		Object source = ae.getSource();
		
		try
		{
			if (source == bLoad) 
			{
			
				File myFile = new File (FileName);
				BufferedReader bf = new BufferedReader(new FileReader(myFile));
				String details = bf.readLine();
				
				while (details != null)
				{
					
					ta.setText(ta.getText() + details + "\n");
					details = bf.readLine();
				}
				
				bf.close();
			}
			
			else if (source == bSave) 
			{
			
				File myFile = new File (FileName);
				PrintWriter pr = new PrintWriter(new FileWriter(FileName));
				
				pr.println(ta.getText());
				pr.close();
			}
			
			else if (source == bClear) 
			{
				ta.setText("");
			}
			
			else if (source == bClose) 
			{
				System.exit(0);
			}
		}
		
		catch(IOException ioe){}
	}
	
	private class MyCloseButtonHandler extends WindowAdapter 
	{
	
		public void windowClosing(WindowEvent we) 
		{
			System.exit(0);
		}
	}
	
	public static void main(String args[]) 
	{
		if (args.length != 0) 
		{
			FileName = args[0];
		}
		else 
		{	
			FileName = "noname.txt";
		}
		MyNotepad mn = new MyNotepad();
		mn.launchFrame();
	}
}