package com.isi.ms3.web;

import com.isi.ms3.entities.Etudiant;
import com.isi.ms3.repository.EtudiantRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class EtudiantGraphQLController {

    private final EtudiantRepository etudiantRepository;

    public EtudiantGraphQLController(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

    @QueryMapping
    public List<Etudiant> etudiantList(){
        return etudiantRepository.findAll();
    }

    @QueryMapping
    public long nbrEtudiant() {
        return etudiantRepository.count();
    }
}
