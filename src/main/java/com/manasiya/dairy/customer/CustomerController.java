package com.manasiya.dairy.customer;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/api/customers")
@CrossOrigin
public class CustomerController {
  private final CustomerRepository repo;
  public CustomerController(CustomerRepository repo){this.repo=repo;}
  @GetMapping public List<Customer> all(){return repo.findAll();}
  @PostMapping public Customer add(@RequestBody Customer c){return repo.save(c);}
  @PutMapping("/{id}") public Customer update(@PathVariable Long id,@RequestBody Customer c){
    Customer old=repo.findById(id).orElseThrow();
    old.setName(c.getName()); old.setPhone(c.getPhone()); old.setAddress(c.getAddress()); old.setRate(c.getRate());
    return repo.save(old);
  }
  @DeleteMapping("/{id}") public void delete(@PathVariable Long id){repo.deleteById(id);}
}
