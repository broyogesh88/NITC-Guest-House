package com.example.guesthousebooking;

public class Bill {

    private int billId;
    private String userId;
    private float amount;

    public Bill(){
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float calculatePrice(int no, float price) {
        return no * price;
    }


    public String toString()
    {
        return String.format("Bill Id : " + billId + "\nUser Id : " + userId + "\nAmount : " + amount);
    }
}
