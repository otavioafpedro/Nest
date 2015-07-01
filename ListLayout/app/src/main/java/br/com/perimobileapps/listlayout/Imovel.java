package br.com.perimobileapps.listlayout;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Peri Mobile Apps on 25/06/2015.
 */
public class Imovel implements Serializable {

    public static final int TIPO_CASA = 1;
    public static final int TIPO_AP = 2;
    public static final int TIPO_TER = 3;

    private int tipo;
    private String endereco;
    private String complemento;
    private int bloco;

    private ArrayList<String> ambiente;
    private ArrayList<String> servico;
    private int quartos;
    private int suite;
    private int bwc;

    private float valor;

    private float areaMaior;
    private float areaMenor;
    private int vagaG;

    private int indVisitas;
    private int indAtendimento;
    private int indFavoritos;

    private Imobiliaria imob;

    private String info;

    public Imovel(int tipo,float valor, String endereco) {
        this.tipo = tipo;
        this.endereco = endereco;
        this.valor = valor;
    }



    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getBloco() {
        return bloco;
    }

    public void setBloco(int bloco) {
        this.bloco = bloco;
    }

    public ArrayList<String> getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(ArrayList<String> ambiente) {
        this.ambiente = ambiente;
    }

    public ArrayList<String> getServico() {
        return servico;
    }

    public void setServico(ArrayList<String> serviço) {
        this.servico = serviço;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public int getSuite() {
        return suite;
    }

    public void setSuite(int suite) {
        this.suite = suite;
    }

    public int getBwc() {
        return bwc;
    }

    public void setBwc(int bwc) {
        this.bwc = bwc;
    }

    public int getIndVisitas() {
        return indVisitas;
    }

    public void setIndVisitas(int indVisitas) {
        this.indVisitas = indVisitas;
    }

    public int getIndAtendimento() {
        return indAtendimento;
    }

    public void setIndAtendimento(int indAtendimento) {
        this.indAtendimento = indAtendimento;
    }

    public int getIndFavoritos() {
        return indFavoritos;
    }

    public void setIndFavoritos(int indFavoritos) {
        this.indFavoritos = indFavoritos;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getAreaMaior() {
        return areaMaior;
    }

    public void setAreaMaior(float areaMaior) {
        this.areaMaior = areaMaior;
    }

    public float getAreaMenor() {
        return areaMenor;
    }

    public void setAreaMenor(float areaMenor) {
        this.areaMenor = areaMenor;
    }

    public int getVagaG() {
        return vagaG;
    }

    public void setVagaG(int vagaG) {
        this.vagaG = vagaG;
    }

    public Imobiliaria getImob() {
        return imob;
    }

    public void setImob(Imobiliaria imob) {
        this.imob = imob;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
