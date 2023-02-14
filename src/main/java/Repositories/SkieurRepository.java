package Repositories;

import com.example.myproject.entities.Moniteur;
import com.example.myproject.entities.Skieur;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SkieurRepository extends PagingAndSortingRepository<Skieur,Long> {
}
