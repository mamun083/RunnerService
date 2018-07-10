package com.example.mitushi.runnerservice;

public class ModelData {

    private String model_name;
    private String model_photo;

    public ModelData() {
    }

    //===== GET Information Methode Creation
    public String getModel_name() {
        return model_name;
    }

    public String getModel_photo() {
        return model_photo;
    }


    //===== SET Information Methode Creation
    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public void setModel_photo(String model_photo) {
        this.model_photo = model_photo;
    }
}
