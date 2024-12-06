
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

import com.sportcenter.dto.PrenotazioneRequest;
import com.sportcenter.dto.PrenotazioneResponse;
import com.sportcenter.model.Prenotazione;
import com.sportcenter.repository.PrenotazioneRepository;
import com.sportcenter.service.PrenotazioniService;

@RequestMapping("/api/Prenotazioni")
@RestController
public class PrenotazioneController {
    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    @Autowired
    private PrenotazioniService prenotazioniService;

    @GetMapping
    public List<Prenotazione> getAllPrenotazione() {
        return prenotazioneRepository.findAll();
    }

    @GetMapping("/{id}")
    public Prenotazione getPrenotazione(@PathVariable Long id) {
        return prenotazioneRepository.findById(id).get();
    }

    @DeleteMapping("/{id}")
    public void DeletePagamento(@PathVariable Long id) {
        prenotazioneRepository.deleteById(id);

    }

    @PostMapping
    public PrenotazioneResponse create(@RequestBody PrenotazioneRequest prenotazioneRequest) {
        Prenotazione prenotazione = prenotazioniService.create(prenotazioneRequest);

        PrenotazioneResponse response = new PrenotazioneResponse();

        response.setId(prenotazione.getId());
        response.setCampoSportivoResponseId(prenotazione.getCampoSportivo().getId());
        response.setUtenteResponseId(prenotazione.getUtente().getId());
        response.setDataOraResponse(prenotazione.getDataOra());
        response.setStatoResponse(prenotazione.getStato());
        return response;
    }
}
