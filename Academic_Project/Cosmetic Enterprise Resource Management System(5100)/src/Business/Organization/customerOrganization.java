/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BeautyCSRRole;
import Business.Role.Role;
import Business.Role.CustomerRole;
import java.util.ArrayList;

/**
 *
 * @author wuxinyang
 */
public class customerOrganization extends Organization{
    public customerOrganization() {
        super(Organization.customerType.customer.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CustomerRole());
        return roles;
    }
}