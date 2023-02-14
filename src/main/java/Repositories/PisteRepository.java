package Repositories;

import com.example.myproject.entities.Moniteur;
import com.example.myproject.entities.Piste;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PisteRepository extends PagingAndSortingRepository<Piste,Integer> {
}
