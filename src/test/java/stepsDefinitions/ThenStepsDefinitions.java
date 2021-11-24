package stepsDefinitions;

import Statments.AlterDataEmployee;
import Statments.ConsultEmployee;
import Statments.CreateEmployee;
import Statments.DeleteEmployee;
import io.cucumber.java.pt.Entao;

public class ThenStepsDefinitions {

    @Entao("servico retorna status duzentos com response para validacao")
    public void servico_retorna_status_duzentos_com_response_para_validacao() {
        new CreateEmployee().getResponsePostMainFields();
        new CreateEmployee().getResponsePostSubFieldsData();
    }

    @Entao("servico retorna status {int} com os dados para validacao")
    public void servico_retorna_status_com_os_dados_para_validacao(Integer int1) {
        new ConsultEmployee().getResponseConsultMainFields();
        new ConsultEmployee().getResponseConsultSubFieldsData();
    }

    @Entao("servico retorna status duzentos com response alterado para validacao")
    public void servico_retorna_status_duzentos_com_response_alterado_para_validacao() {
        new AlterDataEmployee().getResponsePutMainFields();
        new AlterDataEmployee().getResponsePutSubFieldsData();
    }

    @Entao("sistema retorna mensagem de exlcusao efetuada com sucesso")
    public void sistema_retorna_mensagem_de_exlcusao_efetuada_com_sucesso() {
        new DeleteEmployee().getResponseDeleteFields();
    }

    @Entao("o servico deve retornar os dados desse funcionario")
    public void o_servico_deve_retornar_os_dados_desse_funcionario() {
        new ConsultEmployee().getResponseConsultMainFields();
        new ConsultEmployee().getResponseConsultSubFieldsData();
    }
}

