package com.sportcenter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportcenter.dto.PrenotazioneRequest;
import com.sportcenter.model.CampoSportivo;
import com.sportcenter.model.Prenotazione;
import com.sportcenter.model.Utente;
import com.sportcenter.repository.CampoSportivoRepository;
import com.sportcenter.repository.PrenotazioneRepository;
import com.sportcenter.repository.UtenteRepository;

@Service
public class PrenotazioniService {
    @Autowired
    private CampoSportivoRepository campoSportivoRepository;
    @Autowired
    private UtenteRepository utenteRepository;
    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    public Prenotazione create(PrenotazioneRequest request) {
        Utente utente = utenteRepository.findById(request.getUtentiId()).get();

        CampoSportivo campoSportivo = campoSportivoRepository.findById(request.getCampoSportivoId()).get();
        Prenotazione prenotazioneToSave = new Prenotazione();

        prenotazioneToSave.setDataOra(request.getDataOra());
        prenotazioneToSave.setStato(request.getStato());
        prenotazioneToSave.setUtente(utente);
        prenotazioneToSave.setCampoSportivo(campoSportivo);

        prenotazioneToSave = prenotazioneRepository.save(prenotazioneToSave);

        return prenotazioneToSave;
    }

    }
