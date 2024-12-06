package com.sportcenter.dto;

import java.time.LocalDateTime;

public class PrenotazioneResponse {
    private Long Id;
    private LocalDateTime dataOraResponse;
    private String statoResponse;
    private Long utenteResponseId;
    private Long campoSportivoResponseId;
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public LocalDateTime getDataOraResponse() {
        return dataOraResponse;
    }
    public void setDataOraResponse(LocalDateTime dataOraResponse) {
        this.dataOraResponse = dataOraResponse;
    }
    public String getStatoResponse() {
        return statoResponse;
    }
    public void setStatoResponse(String statoResponse) {
        this.statoResponse = statoResponse;
    }
    public Long getUtenteResponseId() {
        return utenteResponseId;
    }
    public void setUtenteResponseId(Long utenteResponseId) {
        this.utenteResponseId = utenteResponseId;
    }
    public Long getCampoSportivoResponseId() {
        return campoSportivoResponseId;
    }
    public void setCampoSportivoResponseId(Long campoSportivoResponseId) {
        this.campoSportivoResponseId = campoSportivoResponseId;
    }
    
    
    
    
   

   

    
}
