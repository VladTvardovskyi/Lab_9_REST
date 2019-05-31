package ua.lviv.iot.zoo.shop.models;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ShopAnimal")
public class ShopAnimalControler {
  @Autowired
  ShopAnimalRepository shopAnimalRepository;
 
  @GetMapping("/ShopAnimal")
  public List getAllShopAnimal() {
    return  (List) shopAnimalRepository.findAll();
  }

  @GetMapping("/ShopAnimal/{id}")
  public ShopAnimal getShopAnimal(@PathVariable Integer id) {
    return shopAnimalRepository.findById(id).get();
  }

  
  @PostMapping("/ShopAnimal")
    public ShopAnimal createShopAnimal(@RequestBody ShopAnimal shopAnimal) {
	  ShopAnimal savedShopAnimal = shopAnimalRepository.save(shopAnimal);
    return savedShopAnimal;
  }
  
  @PutMapping("/ShopAnimal/{id}")
   public  ShopAnimal updateShopAnimal(
      @RequestBody ShopAnimal changedShopAnimal, @PathVariable Integer id) {
	  shopAnimalRepository.save(changedShopAnimal);
    return changedShopAnimal;
  }
  
  @DeleteMapping("/ShopAnimal/{id}")
  public String deleteShopAnimal(@PathVariable Integer id) {
	  shopAnimalRepository.deleteById(id);
    return String.format("ShopAnimal id #%d successfully deleted", id);
  }
  
}
