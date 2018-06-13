//In this class we create a rest end point where all the other microservices are going to talk to this micro service.
package restendpoint;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.QueryRepository;


@RestController
@RequestMapping("/rest/merchantOnbording")

  
public class ExposeRest {
    private QueryRepository queryRepository;
    
     @GetMapping("/{username}")
      public List<String> getQuotes(@PathVariable("username") final String username){
          
          
          
          
          // we need to query the database.
          queryRepository.findByUsername(username);
          return null;
      }
}
