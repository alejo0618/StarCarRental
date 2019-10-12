package starcarrental.Model;
// Generated 12/10/2019 10:35:55 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Store generated by hbm2java
 */
public class Store  implements java.io.Serializable {


     private int id;
     private String name;
     private String address;
     private String subUrb;
     private String zipcode;
     private String estate;
     private Set cars = new HashSet(0);
     private Set storeCampaings = new HashSet(0);
     private Set carFeeByCategories = new HashSet(0);
     private Set employees = new HashSet(0);

    public Store() {
    }

	
    public Store(int id, String name, String address, String subUrb, String zipcode, String estate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.subUrb = subUrb;
        this.zipcode = zipcode;
        this.estate = estate;
    }
    public Store(int id, String name, String address, String subUrb, String zipcode, String estate, Set cars, Set storeCampaings, Set carFeeByCategories, Set employees) {
       this.id = id;
       this.name = name;
       this.address = address;
       this.subUrb = subUrb;
       this.zipcode = zipcode;
       this.estate = estate;
       this.cars = cars;
       this.storeCampaings = storeCampaings;
       this.carFeeByCategories = carFeeByCategories;
       this.employees = employees;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getSubUrb() {
        return this.subUrb;
    }
    
    public void setSubUrb(String subUrb) {
        this.subUrb = subUrb;
    }
    public String getZipcode() {
        return this.zipcode;
    }
    
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    public String getEstate() {
        return this.estate;
    }
    
    public void setEstate(String estate) {
        this.estate = estate;
    }
    public Set getCars() {
        return this.cars;
    }
    
    public void setCars(Set cars) {
        this.cars = cars;
    }
    public Set getStoreCampaings() {
        return this.storeCampaings;
    }
    
    public void setStoreCampaings(Set storeCampaings) {
        this.storeCampaings = storeCampaings;
    }
    public Set getCarFeeByCategories() {
        return this.carFeeByCategories;
    }
    
    public void setCarFeeByCategories(Set carFeeByCategories) {
        this.carFeeByCategories = carFeeByCategories;
    }
    public Set getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Set employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return name;
    }


}

