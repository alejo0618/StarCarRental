package starcarrental.Model;
// Generated 12/10/2019 05:34:53 PM by Hibernate Tools 4.3.1



/**
 * Employee generated by hbm2java
 */
public class Employee  implements java.io.Serializable {


     private int id;
     private EmployeeRol employeeRol;
     private Store store;
     private User user;
     private Integer contractNumber;
     private String email;

    public Employee() {
    }

	
    public Employee(int id, EmployeeRol employeeRol, Store store, User user) {
        this.id = id;
        this.employeeRol = employeeRol;
        this.store = store;
        this.user = user;
    }
    public Employee(int id, EmployeeRol employeeRol, Store store, User user, Integer contractNumber, String email) {
       this.id = id;
       this.employeeRol = employeeRol;
       this.store = store;
       this.user = user;
       this.contractNumber = contractNumber;
       this.email = email;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public EmployeeRol getEmployeeRol() {
        return this.employeeRol;
    }
    
    public void setEmployeeRol(EmployeeRol employeeRol) {
        this.employeeRol = employeeRol;
    }
    public Store getStore() {
        return this.store;
    }
    
    public void setStore(Store store) {
        this.store = store;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public Integer getContractNumber() {
        return this.contractNumber;
    }
    
    public void setContractNumber(Integer contractNumber) {
        this.contractNumber = contractNumber;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }




}


