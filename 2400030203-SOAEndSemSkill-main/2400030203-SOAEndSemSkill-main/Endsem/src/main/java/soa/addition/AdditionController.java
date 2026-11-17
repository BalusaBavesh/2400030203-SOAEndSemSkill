package soa.addition;



import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class AdditionController {

    @GetMapping("/add")
    public String add(
            @RequestParam int a,
            @RequestParam int b) {

        int result = a + b;

        return "Addition = " + result;
    }
}
