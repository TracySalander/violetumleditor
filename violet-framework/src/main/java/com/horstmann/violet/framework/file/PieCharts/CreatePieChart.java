package com.horstmann.violet.framework.file.PieCharts;
import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

public class CreatePieChart extends JFrame {
	
	
	public CreatePieChart(String appTitle, String title, ArrayList<String>className, ArrayList<Integer>size){
		
		PieDataset Dataset = createDataSet(className,size);
		JFreeChart chart = createChart(Dataset, title);
		ChartPanel char_panel = new ChartPanel(chart);
		char_panel.setPreferredSize(new java.awt.Dimension(500,300));
		setContentPane(char_panel);
	}

	private JFreeChart createChart(PieDataset dataset, String title) {
		
		JFreeChart chr = ChartFactory.createPieChart3D(title, dataset,true,true,false);
		PiePlot3D plot = (PiePlot3D) chr.getPlot();
		plot.setDirection(Rotation.CLOCKWISE);
		plot.setForegroundAlpha(0.5f);
		
		return chr;
	}

	private PieDataset createDataSet(ArrayList<String>className, ArrayList<Integer>ClassSize) {
		
		DefaultPieDataset result = new DefaultPieDataset();
		for(int i= 0; i< className.size(); i++)
			result.setValue(className.get(i),ClassSize.get(i));
		
		return result;
	}

}
