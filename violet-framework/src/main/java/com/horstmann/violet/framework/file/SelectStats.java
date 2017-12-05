package com.horstmann.violet.framework.file;
import javax.swing.*;

import com.horstmann.violet.framework.file.Statistics.*; //open class model frame
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class SelectStats implements  ActionListener
{
	private JFrame frame;
	private JButton classModel,sequence,allStats,cancel;
  public SelectStats() 
  {
	  frame = new JFrame("Select Statistics to View");
	  frame.setLayout(new FlowLayout()); //allows multiple labels/buttons in a jframe
	  frame.setSize(800, 600);
	  Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	  int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
	  int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
	  frame.setLocation(x, y); //setslocation,above code will get it at center
	  classModel = new JButton("Class Model");
	  sequence  = new JButton("Sequence Diagram");
	  allStats = new JButton("Visualization");
	  cancel = new JButton("Cancel");
	  frame.add(classModel);
	  frame.add(sequence);
	  frame.add(allStats);
	  frame.add(cancel);
	  classModel.addActionListener(this);
	  sequence.addActionListener(this);
	  cancel.addActionListener(this); 
	  allStats.addActionListener(this);
	  frame.setVisible(true);
	  
  }
  public void actionPerformed(ActionEvent e) 
  {
	 if(e.getSource().equals(classModel)) //class model statistics
	 {
		  ClassModelStatisticsUI cm = new ClassModelStatisticsUI("Diagram.txt");//here will need to grab from a the file system rather then hard coded input

	
	 }
	 else if(e.getSource().equals(sequence)) //sequence diagram statistics
	 {
		  SequenceStatisticsUI seq = new SequenceStatisticsUI("Diagram.txt");
	 }
	 else if(e.getSource().equals(allStats))//piecharts 
	 {
		  AllStatsForm form = new AllStatsForm();
	 }
	 else //cancel
	 {
	  frame.setVisible(false);
	 }
  }
}
