package Services;

import com.example.myproject.entities.Moniteur;

import java.util.List;

public interface IMoniteurServices {
    List<Moniteur> retrieveAllMoniteurs();

    Moniteur addMoniteur(Moniteur e);

    Moniteur updateMoniteur (Moniteur e);

    Moniteur retrieveMoniteur (Integer idMoniteur);

    void deleteMoniteur( Integer idMoniteur);
}
