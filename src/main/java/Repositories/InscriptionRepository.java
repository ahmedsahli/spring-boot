package Repositories;

import com.example.myproject.entities.Inscription;
import com.example.myproject.entities.Moniteur;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface InscriptionRepository extends PagingAndSortingRepository<Inscription,Long> {
}
