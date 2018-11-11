package Product;

import java.sql.Date;

public class Product {

    private int id;
    private String name;
    private int quanty;
    private int unitPrice;
    private double totalPrice;
    private Date purchageDate;

    public Product() {
    }

    public Product(int id, String name, int quanty, int unitPrice, double totalPrice, Date purchageDate) {
        this.id = id;
        this.name = name;
        this.quanty = quanty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.purchageDate = purchageDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuanty() {
        return quanty;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Date getPurchageDate() {
        return purchageDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuanty(int quanty) {
        this.quanty = quanty;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setPurchageDate(Date purchageDate) {
        this.purchageDate = purchageDate;
    }
    
}
