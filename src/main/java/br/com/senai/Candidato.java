package br.com.senai;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import br.com.senai.enuns.Genero;
import br.com.senai.models.Endereco;
import br.com.senai.models.Escolaridade;

public class Candidato {
    public String nomeCompleto;
    public LocalDate dataNascimento;
    public String cpf;
    public String email;
    public Genero genero; 
    public String naturalidade;
    public String nacionalidade;
    public Endereco endereco;
    public List<Escolaridade> escolaridades = new ArrayList<>();
 
    public int calcularIdade(){
        return Period.between(this.dataNascimento,
        LocalDate.now()).getYears();

    }

}
