package Repositories;

import com.example.myproject.entities.Abonnement;
import com.example.myproject.entities.Moniteur;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AbonnementRepository extends PagingAndSortingRepository<Abonnement,Long> {
}
