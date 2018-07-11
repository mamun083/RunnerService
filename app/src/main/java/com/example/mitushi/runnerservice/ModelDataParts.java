package com.example.mitushi.runnerservice;

public class ModelDataParts {
    //private String modelparts_photo;
    private String modelparts_name;
    private String item_id;

    private String item_category_name;
    private  String model_name;
    private String item_sale_price;
    private String origin_id;



    public ModelDataParts() {
    }

    public ModelDataParts(String modelparts_name, String item_id, String item_category_name, String model_name, String item_sale_price, String origin_id) {
        this.modelparts_name = modelparts_name;
        this.item_id = item_id;
        this.item_category_name = item_category_name;
        this.model_name = model_name;
        this.item_sale_price = item_sale_price;
        this.origin_id = origin_id;
    }

    //===== GET Information Methode Creation
    public String getItem_id() {
        return item_id;
    }

    public String getItem_sale_price() {
        return item_sale_price;
    }


    public String getModelparts_name() {
        return modelparts_name;
    }

    //public String getModelparts_photo() { return modelparts_photo; }

    public String getItem_category_name() {
        return item_category_name;
    }

    public String getModel_name() { return model_name; }

    public String getOrigin_id() { return origin_id; }



    //===== SET Information Methode Creation

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public void setItem_sale_price(String item_sale_price) {
        this.item_sale_price = item_sale_price;
    }



    public void setModelparts_name(String modelparts_name) {
        this.modelparts_name = modelparts_name;
    }

    //public void setModelparts_photo(String modelparts_photo) { this.modelparts_photo = modelparts_photo; }

    public void setItem_category_name(String item_category_name) {
        this.item_category_name = item_category_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }


    public void setOrigin_id(String origin_id) {
        this.origin_id = origin_id;
    }

}
