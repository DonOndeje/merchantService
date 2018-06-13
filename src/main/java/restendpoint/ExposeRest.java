//In this class we create a rest end pooint where all the other microservices are going to talk to this micro service.
package restendpoint;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/merchantOnbording")

public class ExposeRest {
     @GetMapping("/{username}")
      public List<String> getQuotes(@PathVariable("username") final String username){
          
          
          return null;
      }
}
