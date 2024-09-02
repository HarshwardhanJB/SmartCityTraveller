package city.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import city.example.demo.models.AddMoreDetails;

public interface VendorDtRepo extends JpaRepository<AddMoreDetails,Long>{

}
