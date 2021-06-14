package com.example.prm.model;


public class Imc {
	private float altura;
	private float peso;
	private float IMC;
	private String conta_final;
 
	
	public String getconta_final() {
		if(IMC < 18.5) {
            this.conta_final = IMC + ",você está abaixo do peso, risco: Elevado!";
        }else if(IMC >= 18.5 && IMC < 25) {
            this.conta_final = IMC + ",você está no peso ideal, risco: Inexistente!";
        }else if(IMC >= 25 && IMC < 30) {
            this.conta_final =IMC +",você está com excesso de peso, risco: Elevado!";
        }else if(IMC >= 30 && IMC < 35) {
            this.conta_final = IMC +",você está com obesidade grau 1, risco: Muito Elevado!";
        }else if(IMC >= 35 && IMC < 40) {
            this.conta_final = IMC +",você está com obesidade grau 2, risco: Muitíssimo Elevado!";
        }else if(IMC >= 40) {
            this.conta_final = IMC +",você está com obesidade grau 3, risco: Obesidade Mórbida!";
        }
        return conta_final;
	}
	public void setconta_final(String conta_final) {
		this.conta_final = conta_final;
	}
	public float getIMC() {
		return IMC;
	}
	public void setIMC(float peso, float altura) {
		IMC = peso/(altura*altura);
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
}
