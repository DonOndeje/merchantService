//In this class we create a rest end point where all the other microservices are going to talk to this micro service.
// controller class will handle all the HTTP requests for the microservice.
package restendpoint;

import java.util.List;
import model.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.VendorRepository;


@RestController // this enables the class to be automatcally picked as a bean in the application context. 
@RequestMapping("/rest/merchantOnbording")

  
public class ExposeRest {
    private VendorRepository queryRepository;

    @Autowired
    public ExposeRest(VendorRepository queryRepository) {
        this.queryRepository = queryRepository; // initialise the private field. 
    }
    
     @GetMapping("/{vendor_name}")
      public List<Vendor> getQuotes(@PathVariable("vendor_name") final String vendor_name){
          
          // we need to query the database.
         List<Vendor> vendorList =  queryRepository.findByVendorName(vendor_name);
                     
              
          return vendorList;
      }
      @PostMapping("/{vendor_name}")
      public void addToMerchantList(@PathVariable("vendor_name") final String vendor_name, Vendor vendor){
     
       queryRepository.save(vendor);
      }
      
}
