package Repositories;

import com.example.myproject.entities.Cours;
import com.example.myproject.entities.Moniteur;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CoursRepository extends PagingAndSortingRepository<Cours,Long> {
}
