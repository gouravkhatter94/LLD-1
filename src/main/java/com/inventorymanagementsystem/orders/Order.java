package com.inventorymanagementsystem.orders;

public class Order implements Comparable<Order> {
//    orderId (String) and isExpress (boolean)
    private String orderId;
    private boolean isExpress;

    public Order(String orderId, boolean isExpress) {
        this.orderId = orderId;
        this.isExpress = isExpress;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    @Override public int compareTo(Order o) {
        if (this.isExpress == true && o.isExpress == true) {
            return o.orderId.compareTo(this.orderId);
        } else if(this.isExpress == false && o.isExpress == false) {
            return o.orderId.compareTo(this.orderId);
        } else {
            if(this.isExpress == true) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}
