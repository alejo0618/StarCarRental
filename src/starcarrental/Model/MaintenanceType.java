package starcarrental.Model;
// Generated 12/10/2019 10:35:55 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * MaintenanceType generated by hbm2java
 */
public class MaintenanceType  implements java.io.Serializable {


     private int id;
     private String name;
     private int periodicity;
     private int baseNumberDay;
     private String baseName;
     private Set carMaintananceHistories = new HashSet(0);

    public MaintenanceType() {
    }

	
    public MaintenanceType(int id, String name, int periodicity, int baseNumberDay, String baseName) {
        this.id = id;
        this.name = name;
        this.periodicity = periodicity;
        this.baseNumberDay = baseNumberDay;
        this.baseName = baseName;
    }
    public MaintenanceType(int id, String name, int periodicity, int baseNumberDay, String baseName, Set carMaintananceHistories) {
       this.id = id;
       this.name = name;
       this.periodicity = periodicity;
       this.baseNumberDay = baseNumberDay;
       this.baseName = baseName;
       this.carMaintananceHistories = carMaintananceHistories;
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
    public int getPeriodicity() {
        return this.periodicity;
    }
    
    public void setPeriodicity(int periodicity) {
        this.periodicity = periodicity;
    }
    public int getBaseNumberDay() {
        return this.baseNumberDay;
    }
    
    public void setBaseNumberDay(int baseNumberDay) {
        this.baseNumberDay = baseNumberDay;
    }
    public String getBaseName() {
        return this.baseName;
    }
    
    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }
    public Set getCarMaintananceHistories() {
        return this.carMaintananceHistories;
    }
    
    public void setCarMaintananceHistories(Set carMaintananceHistories) {
        this.carMaintananceHistories = carMaintananceHistories;
    }




}


