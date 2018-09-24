package br.com.jsa.feiravirtual.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Produto implements Serializable {

	private static final long serialVersionUID = -3368715674382334913L;
	@Id
	private String idPoduto;
	private String titulo;
	private String marca;
	private String modelo;
	private String descricao;
	@DBRef
	private List<Imagem> fotos = new ArrayList<Imagem>();
	@DBRef
	private List<Categoria> categoria = new ArrayList<Categoria>();
	
	private double preco;

	private String cor;
	private String família;
	private String linhaSerie;
	private String tipoTela;
	private String tamanhoTela;
	private String tipoResolução;
	private String resoluçãoMáxima;
	private String quantidadePortosHdmi;
	private String quantidadePortasUsb;
	private String altura;
	private String largura;
	private String profundidade;
	private String quantidadeAltoFalante;
	private String potênciaMáximaAltoFalantes;
	private String modoSom;
	private String ripoCorrente;
	private String memóriaInterna;
	private String memóriaRam;
	private String operadora;
	private String sistemaOperacional;
	private String dimensões;
	private String peso;
	private String versãoSistemaOperacional;
	private String velocidadeProcessador;
	private String capacidadeBateria;
	private String resoluçãoCâmeraTraseira;
	private String resoluçãoCâmeraFrontalGenero;
	private String tipoRoupa;
	private String materialRoupa;
	private String temporada;
	private String tamanho;
	@Version
	private Long versao;

	public String getIdPoduto() {
		return idPoduto;
	}

	public void setIdPoduto(String idPoduto) {
		this.idPoduto = idPoduto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Imagem> getFotos() {
		return fotos;
	}

	public void setFotos(List<Imagem> fotos) {
		this.fotos = fotos;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getFamília() {
		return família;
	}

	public void setFamília(String família) {
		this.família = família;
	}

	public String getLinhaSerie() {
		return linhaSerie;
	}

	public void setLinhaSerie(String linhaSerie) {
		this.linhaSerie = linhaSerie;
	}

	public String getTipoTela() {
		return tipoTela;
	}

	public void setTipoTela(String tipoTela) {
		this.tipoTela = tipoTela;
	}

	public String getTamanhoTela() {
		return tamanhoTela;
	}

	public void setTamanhoTela(String tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}

	public String getTipoResolução() {
		return tipoResolução;
	}

	public void setTipoResolução(String tipoResolução) {
		this.tipoResolução = tipoResolução;
	}

	public String getResoluçãoMáxima() {
		return resoluçãoMáxima;
	}

	public void setResoluçãoMáxima(String resoluçãoMáxima) {
		this.resoluçãoMáxima = resoluçãoMáxima;
	}

	public String getQuantidadePortosHdmi() {
		return quantidadePortosHdmi;
	}

	public void setQuantidadePortosHdmi(String quantidadePortosHdmi) {
		this.quantidadePortosHdmi = quantidadePortosHdmi;
	}

	public String getQuantidadePortasUsb() {
		return quantidadePortasUsb;
	}

	public void setQuantidadePortasUsb(String quantidadePortasUsb) {
		this.quantidadePortasUsb = quantidadePortasUsb;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getLargura() {
		return largura;
	}

	public void setLargura(String largura) {
		this.largura = largura;
	}

	public String getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(String profundidade) {
		this.profundidade = profundidade;
	}

	public String getQuantidadeAltoFalante() {
		return quantidadeAltoFalante;
	}

	public void setQuantidadeAltoFalante(String quantidadeAltoFalante) {
		this.quantidadeAltoFalante = quantidadeAltoFalante;
	}

	public String getPotênciaMáximaAltoFalantes() {
		return potênciaMáximaAltoFalantes;
	}

	public void setPotênciaMáximaAltoFalantes(String potênciaMáximaAltoFalantes) {
		this.potênciaMáximaAltoFalantes = potênciaMáximaAltoFalantes;
	}

	public String getModoSom() {
		return modoSom;
	}

	public void setModoSom(String modoSom) {
		this.modoSom = modoSom;
	}

	public String getRipoCorrente() {
		return ripoCorrente;
	}

	public void setRipoCorrente(String ripoCorrente) {
		this.ripoCorrente = ripoCorrente;
	}

	public String getMemóriaInterna() {
		return memóriaInterna;
	}

	public void setMemóriaInterna(String memóriaInterna) {
		this.memóriaInterna = memóriaInterna;
	}

	public String getMemóriaRam() {
		return memóriaRam;
	}

	public void setMemóriaRam(String memóriaRam) {
		this.memóriaRam = memóriaRam;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	public String getDimensões() {
		return dimensões;
	}

	public void setDimensões(String dimensões) {
		this.dimensões = dimensões;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getVersãoSistemaOperacional() {
		return versãoSistemaOperacional;
	}

	public void setVersãoSistemaOperacional(String versãoSistemaOperacional) {
		this.versãoSistemaOperacional = versãoSistemaOperacional;
	}

	public String getVelocidadeProcessador() {
		return velocidadeProcessador;
	}

	public void setVelocidadeProcessador(String velocidadeProcessador) {
		this.velocidadeProcessador = velocidadeProcessador;
	}

	public String getCapacidadeBateria() {
		return capacidadeBateria;
	}

	public void setCapacidadeBateria(String capacidadeBateria) {
		this.capacidadeBateria = capacidadeBateria;
	}

	public String getResoluçãoCâmeraTraseira() {
		return resoluçãoCâmeraTraseira;
	}

	public void setResoluçãoCâmeraTraseira(String resoluçãoCâmeraTraseira) {
		this.resoluçãoCâmeraTraseira = resoluçãoCâmeraTraseira;
	}

	public String getResoluçãoCâmeraFrontalGenero() {
		return resoluçãoCâmeraFrontalGenero;
	}

	public void setResoluçãoCâmeraFrontalGenero(String resoluçãoCâmeraFrontalGenero) {
		this.resoluçãoCâmeraFrontalGenero = resoluçãoCâmeraFrontalGenero;
	}

	public String getTipoRoupa() {
		return tipoRoupa;
	}

	public void setTipoRoupa(String tipoRoupa) {
		this.tipoRoupa = tipoRoupa;
	}

	public String getMaterialRoupa() {
		return materialRoupa;
	}

	public void setMaterialRoupa(String materialRoupa) {
		this.materialRoupa = materialRoupa;
	}

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

}
