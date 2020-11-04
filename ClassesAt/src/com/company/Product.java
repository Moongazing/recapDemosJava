package com.company;

public class Product {
    public Product(int _id,String _name,String _description
    ,double _price,int _stock,String _renk){
        this._id=_id;
        this._description=_description;
        this._name=_name;
        this._price=_price;
        this._renk=_renk;
        this._stock=_stock;

    }
    public Product(){

    }
    //attribute
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stock;
    private String _renk;
    private String _kod;

    public int _getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;//this bu class demek
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        this._name = name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String description) {
        this._description = description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double price) {
        this._price = price;
    }

    public int get_stock() {
        return _stock;
    }

    public void set_stock(int stock) {
        this._stock = stock;
    }

    public String get_renk() {
        return _renk;
    }

    public void set_renk(String renk) {
        this._renk = renk;
    }

    public String get_kod() {
        return this._name.substring(0,1)+_id;
    }


}
