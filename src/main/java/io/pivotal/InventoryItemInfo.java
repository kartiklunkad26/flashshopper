package io.pivotal;

/**
 * Created by pivotal on 3/15/17.
 */
public class InventoryItemInfo {

    static final String STATUS_ACCEPTED = "ITEM_ACCEPTED";
    static final String STATUS_REJECTED = "ITEM_REJECTED";

    private Integer price;
    private String status;
    private String rejectionReason;

    public InventoryItemInfo(Integer price, String status, String rejectionReason){

        this.price=price;
        this.status=status;
        this.rejectionReason=rejectionReason;
    }

    public Integer getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    public String getRejectionReason() {
        return rejectionReason;
    }

    @Override
    public String toString() {
        return "InventoryItemInfo{" +
                "price=" + price +
                ", status='" + status + '\'' +
                ", rejectionReason='" + rejectionReason + '\'' +
                '}';
    }


}
