package city.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import city.example.demo.models.Vendor;

public interface VendorRepository extends JpaRepository<Vendor,Long>{

}
