package kata3v2;

import org.jfree.ui.ApplicationFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import java.awt.Dimension;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;

public class HistogramDisplay extends ApplicationFrame{
    private final Histogram<String> histogram;

    HistogramDisplay(Histogram<String> histogram){
        super("HISTOGRAMA");
        this.histogram = histogram;
        setContentPane(createPanel());
        pack();
    }
    void execute() {
        setVisible(true);
    }
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        return ChartFactory.createBarChart("Histograma JFreeChart" , "Dominios",
                "Nº de emails", dataSet, PlotOrientation.VERTICAL, false, false,
                rootPaneCheckingEnabled);
    }

    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        histogram.keySet().forEach(key -> {
            dataSet.addValue(histogram.get(key),"",key);
        });
        return dataSet;
    }
}