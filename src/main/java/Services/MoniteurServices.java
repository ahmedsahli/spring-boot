package Services;

import Repositories.MoniteurRepository;
import com.example.myproject.entities.Moniteur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class MoniteurServices implements  IMoniteurServices{
    MoniteurRepository MoniteurRepository;
    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return null;
    }

    @Override
    public Moniteur addMoniteur(Moniteur e) {
        return null;
    }

    @Override
    public Moniteur updateMoniteur(Moniteur e) {
        return null;
    }

    @Override
    public Moniteur retrieveMoniteur(Integer idMoniteur) {
        return null;
    }

    @Override
    public void deleteMoniteur(Integer idMoniteur) {

    }
}
