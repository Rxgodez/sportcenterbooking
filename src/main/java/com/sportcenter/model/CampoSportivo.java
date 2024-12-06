package com.sportcenter.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class CampoSportivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String disciplina;
    private Boolean disponibile;
    private Boolean CostoOrario;


        @OneToMany(mappedBy = "campoSportivo")
    private List<Prenotazione> Prenotazione;
   
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public Boolean getDisponibile() {
        return disponibile;
    }
    public void setDisponibile(Boolean disponibile) {
        this.disponibile = disponibile;
    }
    public Boolean getCostoOrario() {
        return CostoOrario;
    }
    public void setCostoOrario(Boolean costoOrario) {
        CostoOrario = costoOrario;
    }
    public CampoSportivo save(CampoSportivo campoSportivo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
    public void deleteById(Long id2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }
    public Object findById(Long id2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }
    public List<CampoSportivo> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
}
