
package com.sportcenter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportcenter.model.Prenotazione;
import com.sportcenter.repository.PrenotazioneRepository;

@RequestMapping("/api/Prenotazioni")
@RestController
public class PrenotazioneController {
    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    @GetMapping
    public List<Prenotazione> getAllPrenotazione() {
        return prenotazioneRepository.findAll();
    }

@GetMapping("/{id}")
public Prenotazione getPrenotazione(@PathVariable Long id){
    return prenotazioneRepository.findById(id).get();
}

    @PostMapping
    public Prenotazione CreatePrenotazione(@RequestBody Prenotazione prenotazione) {
        return prenotazioneRepository.save(prenotazione);
    }
    @DeleteMapping("/{id}")
    public void DeletePagamento(@PathVariable Long id) {
        prenotazioneRepository.deleteById(id);
    
}
}
