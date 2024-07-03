package dip1.model.util;

import java.util.List;

import dip1.model.PrintOut;
import dip1.model.ReportItem;

public class ReportConsole extends PrintOut{

    @Override
    public void output(List<ReportItem> items) {
        System.out.println("Output to console:");
        for (ReportItem item : items) {
            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
    
}
