package Domain;

import java.util.Date;

public class Summary {

    private int id;
    private String code;
    private String name;
    private int totalQty;
    private int soldQty;
    private int availableQty;
    private Date lastUpdate;
    Purchese purchese;

    public Summary() {
    }

    public Summary(int id, String code, String name, int totalQty, int soldQty, int availableQty, Date lastUpdate, Purchese purchese) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.totalQty = totalQty;
        this.soldQty = soldQty;
        this.availableQty = availableQty;
        this.lastUpdate = lastUpdate;
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
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(int totalQty) {
        this.totalQty = totalQty;
    }

    public int getSoldQty() {
        return soldQty;
    }

    public void setSoldQty(int soldQty) {
        this.soldQty = soldQty;
    }

    public int getAvailableQty() {
        return availableQty;
    }

    public void setAvailableQty(int availableQty) {
        this.availableQty = availableQty;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Purchese getPurchese() {
        return purchese;
    }

    public void setPurchese(Purchese purchese) {
        this.purchese = purchese;
    }

    @Override
    public String toString() {
        return "Summary{" + "id=" + id + ", code=" + code + ", name=" + name + ", totalQty=" + totalQty + ", soldQty=" + soldQty + ", availableQty=" + availableQty + ", lastUpdate=" + lastUpdate + ", purchese=" + purchese + '}';
    }

}
