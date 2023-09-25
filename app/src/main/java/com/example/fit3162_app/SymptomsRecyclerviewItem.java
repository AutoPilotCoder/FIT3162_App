package com.example.fit3162_app;

public class SymptomsRecyclerviewItem {
    String symptom_name;
    String short_description;

    public SymptomsRecyclerviewItem(String symptom_name, String short_description) {
        this.symptom_name = symptom_name;
        this.short_description = short_description;
    }

    public String getSymptom_name() {
        return symptom_name;
    }

    public void setSymptom_name(String symptom_name) {
        this.symptom_name = symptom_name;
    }

    public String getShort_description() {
        return short_description;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }
}
