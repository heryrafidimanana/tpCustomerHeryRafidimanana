/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.mbds.tpcustomerheryrafidiamana.jsf;

import jakarta.ejb.EJB;
import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import mg.mbds.tpcustomerheryrafidiamana.ejb.CustomerManager;
import mg.mbds.tpcustomerheryrafidiamana.entities.Customer;

/**
 *
 * @author Hery Andrianirina
 */
@Named(value = "customerBean")
@ViewScoped
public class CustomerBean implements Serializable {
    
    private List<Customer> customerList;
    
    @EJB
    private CustomerManager customerManager;

    /**
     * Creates a new instance of CustomerBean
     */
    public CustomerBean() {
    }
    
    public List<Customer> getCustomers() {
        if (customerList == null) {
            customerList = customerManager.getAllCustomers();
        }
        return customerList;
    }
    
}
