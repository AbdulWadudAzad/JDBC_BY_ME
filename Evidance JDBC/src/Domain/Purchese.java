
package Domain;

import java.sql.Date;


public class Purchese {
    private int id;
    private String code;
    private String Name;
    private Double qty;
    private Double unitPrice;
    private Date purchaseDate;

    public Purchese() {
    }

    public Purchese(int id, String code, String Name, Double qty, Double unitPrice, Date purchaseDate) {
        this.id = id;
        this.code = code;
        this.Name = Name;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.purchaseDate = purchaseDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @Override
    public String toString() {
        return "Purchese{" + "id=" + id + ", code=" + code + ", Name=" + Name + ", qty=" + qty + ", unitPrice=" + unitPrice + ", purchaseDate=" + purchaseDate + '}';
    }
    
}
