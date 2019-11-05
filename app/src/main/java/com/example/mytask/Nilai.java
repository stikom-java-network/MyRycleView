package com.example.mytask;

public class Nilai {
    private String Matkul, nh;
    private int sks, gambar;
    private double tugas, uts, uas, na;


    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getMatkul() {
        return Matkul;
    }

    public void setMatkul(String matkul) {
        Matkul = matkul;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public double getTugas() {
        return tugas;
    }

    public void setTugas(double tugas) {
        this.tugas = tugas;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double na() {
        double na = (uts*0.3)+(uas*0.3)+(tugas*0.4);
        return na;
    }

    public String nh(double na) {
        String nh="";
        if(na >= 80 && na <=100){
            nh = "A";

        }else if(na >=75 && na <=79){
            nh = "B+";
        }else if(na >=65 && na <=74){
            nh = "B";
        }else if(na >=60 && na <=64){
            nh = "C+";
        }else if(na >=50 && na <=59){
            nh = "C";
        }else if(na >=40 && na <=49){
            nh = "D";
        }else {
            nh = "E";
        }

        return nh;
    }




}
