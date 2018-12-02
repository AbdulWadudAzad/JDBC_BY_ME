
package Domain;

import java.sql.Date;


public class Sales {
     private int id;
    private String code;
    private String Name;
    private Double qty;
    private Double unitPrice;
    private Double totalPrice;
    private Date salseDate;
    Purchese purchese;

    public Sales() {
    }

    public Sales(int id, String code, String Name, Double qty, Double unitPrice, Double totalPrice, Date salseDate, Purchese purchese) {
        this.id = id;
        this.code = code;
        this.Name = Name;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.salseDate = salseDate;
        this.purchese = purchese;
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

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getSalseDate() {
        return salseDate;
    }

    public void setSalseDate(Date salseDate) {
        this.salseDate = salseDate;
    }

    public Purchese getPurchese() {
        return purchese;
    }

    public void setPurchese(Purchese purchese) {
        this.purchese = purchese;
    }

    @Override
    public String toString() {
        return "Sales{" + "id=" + id + ", code=" + code + ", Name=" + Name + ", qty=" + qty + ", unitPrice=" + unitPrice + ", totalPrice=" + totalPrice + ", salseDate=" + salseDate + ", purchese=" + purchese + '}';
    }
    
    
}
