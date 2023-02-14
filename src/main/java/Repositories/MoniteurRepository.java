package Repositories;

import com.example.myproject.entities.Moniteur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MoniteurRepository extends PagingAndSortingRepository<Moniteur,Long> {
}
