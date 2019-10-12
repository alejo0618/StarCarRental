package starcarrental.Model;
// Generated 12/10/2019 10:35:55 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CreditCard generated by hbm2java
 */
public class CreditCard  implements java.io.Serializable {


     private int id;
     private CreditCardFranchise creditCardFranchise;
     private String cardNumber;
     private String cardHolder;
     private Date expirationDate;
     private String ccv;
     private Set userCreditCards = new HashSet(0);

    public CreditCard() {
    }

	
    public CreditCard(int id, CreditCardFranchise creditCardFranchise, String cardNumber, String cardHolder, Date expirationDate, String ccv) {
        this.id = id;
        this.creditCardFranchise = creditCardFranchise;
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expirationDate = expirationDate;
        this.ccv = ccv;
    }
    public CreditCard(int id, CreditCardFranchise creditCardFranchise, String cardNumber, String cardHolder, Date expirationDate, String ccv, Set userCreditCards) {
       this.id = id;
       this.creditCardFranchise = creditCardFranchise;
       this.cardNumber = cardNumber;
       this.cardHolder = cardHolder;
       this.expirationDate = expirationDate;
       this.ccv = ccv;
       this.userCreditCards = userCreditCards;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public CreditCardFranchise getCreditCardFranchise() {
        return this.creditCardFranchise;
    }
    
    public void setCreditCardFranchise(CreditCardFranchise creditCardFranchise) {
        this.creditCardFranchise = creditCardFranchise;
    }
    public String getCardNumber() {
        return this.cardNumber;
    }
    
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public String getCardHolder() {
        return this.cardHolder;
    }
    
    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }
    public Date getExpirationDate() {
        return this.expirationDate;
    }
    
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
    public String getCcv() {
        return this.ccv;
    }
    
    public void setCcv(String ccv) {
        this.ccv = ccv;
    }
    public Set getUserCreditCards() {
        return this.userCreditCards;
    }
    
    public void setUserCreditCards(Set userCreditCards) {
        this.userCreditCards = userCreditCards;
    }




}


