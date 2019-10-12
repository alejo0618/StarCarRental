package starcarrental.Model;
// Generated 12/10/2019 10:35:55 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Payment generated by hbm2java
 */
public class Payment  implements java.io.Serializable {


     private int id;
     private CarRentalManagement carRentalManagement;
     private PaymentType paymentType;
     private Date paymentType_1;
     private Double amount;

    public Payment() {
    }

	
    public Payment(int id, CarRentalManagement carRentalManagement, PaymentType paymentType) {
        this.id = id;
        this.carRentalManagement = carRentalManagement;
        this.paymentType = paymentType;
    }
    public Payment(int id, CarRentalManagement carRentalManagement, PaymentType paymentType, Date paymentType_1, Double amount) {
       this.id = id;
       this.carRentalManagement = carRentalManagement;
       this.paymentType = paymentType;
       this.paymentType_1 = paymentType_1;
       this.amount = amount;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public CarRentalManagement getCarRentalManagement() {
        return this.carRentalManagement;
    }
    
    public void setCarRentalManagement(CarRentalManagement carRentalManagement) {
        this.carRentalManagement = carRentalManagement;
    }
    public PaymentType getPaymentType() {
        return this.paymentType;
    }
    
    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
    public Date getPaymentType_1() {
        return this.paymentType_1;
    }
    
    public void setPaymentType_1(Date paymentType_1) {
        this.paymentType_1 = paymentType_1;
    }
    public Double getAmount() {
        return this.amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }




}

