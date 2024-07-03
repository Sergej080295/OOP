package dip1;

import dip1.model.Report;
import dip1.model.ReportItem;
import dip1.model.ReportService;
import dip1.model.util.ReportConsole;
import dip1.model.util.ReportPrinter;
import logger.Log;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    //private static final Logger log = Log.log(Main.class.getName());
    public static void main(String[] args) {
        //log.log(Level.INFO, "Method main in model package started");
        Report report = new Report(List.of(new ReportItem("item1", 12.5f), new ReportItem("item2", 12.6f)));
        ReportService service = new ReportService(report, new ReportConsole());
        ReportService service2 = new ReportService(report, new ReportPrinter());
        service.output();
        service2.output();
    }
}
