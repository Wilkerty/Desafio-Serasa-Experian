package adapter.repository;

import adapter.repository.model.VendedorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorRepository extends JpaRepository<VendedorModel, Long> {
}
