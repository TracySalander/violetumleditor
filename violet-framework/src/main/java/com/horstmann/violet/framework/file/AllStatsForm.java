package com.horstmann.violet.framework.file;
import com.horstmann.violet.framework.file.PieCharts.*;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AllStatsForm implements ActionListener{
	//this class opens all the required pie chart options
	private JFrame frame;
	private JButton classModel;
	private JButton sequence;
	private JButton cancel;
	AllStatsForm()
	{
		  frame = new JFrame("Select Pie Chart");
		  frame.setLayout(new FlowLayout()); //allows multiple labels/buttons in a jframe
		  frame.setSize(800, 600);
		  Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		  int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
		  int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
		  frame.setLocation(x, y); //setslocation,above code will get it at center
		  classModel = new JButton("ClassModel PieChart");
		  sequence  = new JButton("Sequence Diagram PieChart");
		  cancel = new JButton("Cancel");
		  frame.add(classModel);
		  frame.add(sequence);
		  frame.add(cancel);
		  classModel.addActionListener(this);
		  sequence.addActionListener(this);
		  cancel.addActionListener(this);
		  frame.setVisible(true);
		  
		  
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(classModel)) //class model piechart
		{
			PieChart p = new PieChart("Diagram.txt","ClassModel");
		}
		else if(e.getSource().equals(sequence)) //sequence model pie chart
		{
			PieChart p = new PieChart("Diagram.txt","SequenceModel");
		}
		else //cancel
		{
			frame.setVisible(false);
		}
	}

}
