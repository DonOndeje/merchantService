/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import model.Vendor;

public interface VendorRepository extends JpaRepository<Vendor,Integer>{ // By extending JpaRepository, VendorRepository inherits 18 methods for performing common persistence operations. 
    public abstract List<Vendor> findAllByNameIs(String vendornamename);
    public List<Vendor> findByUsername(String vendor_name);
}
