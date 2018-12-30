package fp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class nameController {

    @RequestMapping("/namemode")
    public name sayWelcome(@RequestParam(value = "firstName" , defaultValue = "new user fname") String firstName,@RequestParam(value = "lastName", defaultValue = "new user lname") String lastName){
        return new name(firstName,lastName);
    }

}
