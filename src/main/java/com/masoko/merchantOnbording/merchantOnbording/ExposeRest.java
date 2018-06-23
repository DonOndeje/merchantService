//In this class we create a rest end point where all the other microservices are going to talk to this micro service.
// controller class will handle all the HTTP requests for the microservice.
package com.masoko.merchantOnbording.merchantOnbording;

import java.util.List;
import java.util.stream.Collectors;
import model.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.VendorRepository;

@RestController // this enables the class to be automatcally picked as a bean in the application context. 

@RequestMapping(value = "/merchantOnbording")
public class ExposeRest {

   
   private VendorRepository queryRepository;
 @GetMapping(value = "/{vendor_name}")
    public List<String> getMerchants(@PathVariable("vendor_name") final String username){
        System.out.println(username);
         return queryRepository.findByUsername(username)
                .stream()
                .map(vendor ->{
                     return vendor.getVendor_name();
                }).collect(Collectors.toList());
     }

    @PostMapping("/add/{vendor_name}")
    public void addToMerchantList(@PathVariable("vendor_name") final String vendor_name, Vendor vendor) {

        queryRepository.save(vendor);
    }

}
