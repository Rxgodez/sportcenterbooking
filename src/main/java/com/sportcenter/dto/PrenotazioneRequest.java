package com.sportcenter.dto;

import java.time.LocalDateTime;

public class PrenotazioneRequest {

    private LocalDateTime dataOra;
    private String stato;
    private Long utentiId;
    private Long campoSportivoId;
    
    public LocalDateTime getDataOra() {
        return dataOra;
    }
    public void setDataOra(LocalDateTime dataOra) {
        this.dataOra = dataOra;
    }
    public String getStato() {
        return stato;
    }
    public void setStato(String stato) {
        this.stato = stato;
    }
    public Long getUtentiId() {
        return utentiId;
    }
    public void setUtentiId(Long utentiId) {
        this.utentiId = utentiId;
    }
    public Long getCampoSportivoId() {
        return campoSportivoId;
    }
    public void setCampoSportivoId(Long campoSportivoId) {
        this.campoSportivoId = campoSportivoId;
    }

    
    
}
