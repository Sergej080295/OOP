package dip1.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;



public class ReportService {

    private Report report;
    private PrintOut reportPrint;

    public ReportService(Report report, PrintOut reportPrint) {
        this.report = report;
        this.reportPrint = reportPrint;
    }

    public void calculate(){
        report.items =  new ArrayList<ReportItem>();
        report.items.add(new ReportItem("First", (float)5));
        report.items.add(new ReportItem("Second", (float)6));
    }

    public void output(){
        reportPrint.output(report.items);
    }

    public void add(ReportItem... items){//... значит, что можно добавлять много аргументов от 0 до бесконечности(должно быть последнее в очережи)
        this.report.items.addAll(Arrays.asList(items));
        
    }
}
