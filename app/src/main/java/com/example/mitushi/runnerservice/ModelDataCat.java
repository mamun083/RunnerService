package com.example.mitushi.runnerservice;

public class ModelDataCat {

    private String modelcat_name;
    //private String modelcat_details;
    private String modelcat_photo;
    static String model_name;
    public ModelDataCat() {
    }

    //===== GET Information Methode Creation
    public String getModelcat_name() {
        return modelcat_name;
    }

    //public String getModelcat_details() { return modelcat_details; }

    public String getModelcat_photo() { return modelcat_photo; }

    public String getModel_name() {
        return model_name;
    }


    //===== SET Information Methode Creation
    public void setModelcat_name(String modelcat_name) { this.modelcat_name = modelcat_name; }

    //public void setModelcat_details(String modelcat_details) { this.modelcat_details = modelcat_details; }

    public void setModelcat_photo(String modelcat_photo) { this.modelcat_photo = modelcat_photo; }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }


}
