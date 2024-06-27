package academy.digitallab.store.service_product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class Controller {

  @GetMapping("/Test")
  public String StoreTest() {
    return "Test";
  }
}
