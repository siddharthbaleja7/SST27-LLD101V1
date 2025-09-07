package com.example.report;

import java.nio.file.Path;
import java.util.Map;
import java.util.Objects;

public class ReportBundleFacade {
    private final JsonWriter jsonWriter;
    private final Zipper zipper;
    private final AuditLog auditLog;
    public ReportBundleFacade(JsonWriter jsonWriter , Zipper zipper , AuditLog auditLog){
        this.jsonWriter = Objects.requireNonNull(jsonWriter, "writer");
        this.zipper = Objects.requireNonNull(zipper, "zipper");
        this.auditLog = Objects.requireNonNull(auditLog, "audit");
    }
    public Path export(Map<String,Object> data, Path outDir , String baseName){
        Objects.requireNonNull(data, "data");
        Objects.requireNonNull(outDir, "outDir");
        Objects.requireNonNull(baseName, "baseName");
        try {
            Path json = jsonWriter.write(data, outDir, baseName);
            Path zipFile = outDir.resolve(baseName + ".zip");
            Path zip = zipper.zip(json, zipFile);
            auditLog.log("exported "+ zip);
            return zip;
        } catch (Exception e) {
            throw  e;
        }
    }
}
