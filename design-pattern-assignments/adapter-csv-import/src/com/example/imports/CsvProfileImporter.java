package com.example.imports;

import java.nio.file.Path;
import java.util.List;

public class CsvProfileImporter implements ProfileImporter {
    private final NaiveCsvReader naiveCsvReader;
    private final ProfileService profileService;

    public CsvProfileImporter(NaiveCsvReader naiveCsvReader , ProfileService profileService){
        this.naiveCsvReader = naiveCsvReader;
        this.profileService = profileService;
    }
    @Override
    public int importFrom(Path csvFile){
        List<String[]> rows = naiveCsvReader.read(csvFile);
        int count = 0;

        for (String[] row : rows.subList(1, rows.size())) {
            if (row.length < 3) {
                System.out.println("Skipping row (not enough columns)");
                continue;
            }

            String id = row[0].trim();
            String email = row[1].trim();
            String name = row[2].trim();

            if (id.isEmpty() || email.isEmpty() || !email.contains("@")) {
                System.out.println("Skipping row (invalid data): " + String.join(",", row));
                continue;
            }

            try {
                profileService.createProfile(id, email, name);
                count++;
            } catch (Exception e) {
                System.out.println("Skipping row (error: " + e.getMessage() + ")");
            }
        }
        return count;
    }

}