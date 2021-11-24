package stepsDefinitions;

import Statments.AlterDataEmployee;
import Statments.ConsultEmployee;
import Statments.CreateEmployee;
import Statments.DeleteEmployee;
import io.cucumber.java.pt.Quando;

import java.io.IOException;

public class WhenStepsDefinitions {

    @Quando("enviar a requisicao com nome <name>, salario <salary> e idade <age>")
    public void enviar_a_requisicao_com_nome_name_salario_salary_e_idade_age() throws IOException {
        new CreateEmployee().employee();
    }

    @Quando("vou conulstar seus dados criados")
    public void vou_conulstar_seus_dados_criados() throws IOException {
        new ConsultEmployee().consultEmployeeCreated();
    }

    @Quando("envio o dados para alteracao")
    public void envio_o_dados_para_alteracao() throws IOException {
        new AlterDataEmployee().consultEmployeeToAlterData();
    }

    @Quando("envio os dados para exclusao")
    public void envio_os_dados_para_exclusao() throws IOException {
        new DeleteEmployee().consultEmployeeCreated();
    }

    @Quando("enviar a requisicao com o id")
    public void enviar_a_requisicao_com_o_id() throws IOException {
        new ConsultEmployee().consultAleatoryEmployee();
    }

}
