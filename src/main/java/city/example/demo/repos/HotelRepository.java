package city.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import city.example.demo.models.AddHotel;

public interface HotelRepository extends JpaRepository<AddHotel,Long>{

}
