package com.example.report;
import java.nio.file.Path;
 import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String,Object> data = Map.of("name", "Quarterly");
        // JsonWriter jw = new JsonWriter(); 
        // Zipper z = new Zipper(); 
        // AuditLog log = new AuditLog();
        // Path json = jw.write(data, Path.of("out"), "report");
        // Path zip = z.zip(json, Path.of("out", "report.zip"));
        // log.log("exported " + zip);
        ReportBundleFacade facade = new ReportBundleFacade(new JsonWriter(),new Zipper(),new AuditLog());
        Path zip = facade.export(data, Path.of("out"), "report");
        System.out.println("DONE " + zip);
        // TODO: Replace the above with a single call to ReportBundleFacade.export(...)
    }
}
