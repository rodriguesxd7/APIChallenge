package stepsDefinitions;

import Statments.ConsultEmployee;
import Statments.CreateEmployee;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import java.io.IOException;

public class GivenStepsDefinition {

    @Dado("que vou criar um novo funcionario")
    public void que_vou_criar_um_novo_funcionario() {
        System.out.println("Iniciando a execucao da API");
    }

    @Dado("que realizei a criacao de um funcionario")
    public void que_realizei_a_criacao_de_um_funcionario() {
        System.out.println("Iniciando a execucao da API");
    }

    @Dado("que vou alterar os dados de um funcionario")
    public void que_vou_alterar_os_dados_de_um_funcionario() {
        System.out.println("Iniciando a execucao da API");
    }

    @Dado("que vou excluir um funcionario da base")
    public void que_vou_excluir_um_funcionario_da_base() {
        System.out.println("Iniciando a execucao da API");
    }

    @Dado("que vou consultar um funcionario ja cadastrado")
    public void que_vou_consultar_um_funcionario_ja_cadastrado() {
        System.out.println("Iniciando a execucao da API");
    }

}
