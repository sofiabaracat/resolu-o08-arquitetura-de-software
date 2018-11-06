/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucao8;

/**
 *
 * @author sofia
 */
public class Funcionario {
    Long id;
    String nome;
    int idade;
    float salario;
    
    public Funcionario(String nome, int idade, float salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
    }
    
    public Long getID(){
	return id;
    }	

    public void setID(Long id){
        this.id = id;
    }
    public String getNome(){
	return nome;
    }	

    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
	return idade;
    }	

    public void setIdade(int idade){
        this.idade= idade;
    }
    public float getSalario(){
	return salario;
    }	

    public void setSalario(float salario){
        this.salario = salario;
    }
    
}
