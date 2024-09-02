package city.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import city.example.demo.models.LegalInfo;

public interface LegalInfoRepo extends JpaRepository<LegalInfo,Long>{

}
