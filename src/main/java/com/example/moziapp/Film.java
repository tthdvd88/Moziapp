package com.example.moziapp;

public class Film {
    public Integer getFkod() {
        return fkod;
    }

    public void setFkod(Integer fkod) {
        this.fkod = fkod;
    }

    public String getFilmcim() {
        return filmcim;
    }

    public void setFilmcim(String filmcim) {
        this.filmcim = filmcim;
    }

    public boolean isSzines() {
        return szines;
    }

    public void setSzines(boolean szines) {
        this.szines = szines;
    }

    public String getSzinkron() {
        return szinkron;
    }

    public void setSzinkron(String szinkron) {
        this.szinkron = szinkron;
    }

    public String getSzarmazas() {
        return szarmazas;
    }

    public void setSzarmazas(String szarmazas) {
        this.szarmazas = szarmazas;
    }

    public String getMufaj() {
        return mufaj;
    }

    public void setMufaj(String mufaj) {
        this.mufaj = mufaj;
    }

    public Integer getHossz() {
        return hossz;
    }

    public void setHossz(Integer hossz) {
        this.hossz = hossz;
    }

    public Film(Integer fkod, String filmcim, boolean szines, String szinkron, String szarmazas, String mufaj, Integer hossz) {
        this.fkod = fkod;
        this.filmcim = filmcim;
        this.szines = szines;
        this.szinkron = szinkron;
        this.szarmazas = szarmazas;
        this.mufaj = mufaj;
        this.hossz = hossz;
    }

    private Integer fkod;
    private String filmcim;
    private boolean szines;
    private String szinkron;
    private String szarmazas;
    private String mufaj;
    private Integer hossz;

}
