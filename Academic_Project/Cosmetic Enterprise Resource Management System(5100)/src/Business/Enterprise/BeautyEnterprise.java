/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Customer.CustomerDirectory;
import Business.Product.ProductDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author wuxinyang
 */
public class BeautyEnterprise extends Enterprise {
    
    
    private CustomerDirectory customerDir;
    private ProductDirectory productDir;
    
    
    
     public BeautyEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Beauty);
        this.customerDir= new CustomerDirectory();
        this.productDir = new ProductDirectory();
    }

    public CustomerDirectory getCustomerDir() {
        return customerDir;
    }

    public void setCustomerDir(CustomerDirectory customerDir) {
        this.customerDir = customerDir;
    }

    public ProductDirectory getProductDir() {
        return productDir;
    }

    public void setProductDir(ProductDirectory productDir) {
        this.productDir = productDir;
    }
     
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
