package Statments;

import Requests.RequestsJson;
import Suporte.DataController;
import io.restassured.path.json.JsonPath;
import org.json.JSONObject;

import java.io.IOException;

public class DeleteEmployee {

    RequestsJson request = new RequestsJson();

    public void consultEmployeeCreated() throws IOException {
        JsonPath res = new JsonPath(DataController.getData().get("CREATE_EMPLOYEE"));
        String id = res.getJsonObject("data.id").toString();

        request.deleteEmployee(id);
    }

    public void getResponseDeleteFields() {
        String fields[] = {"status", "data", "message"};
        JSONObject obj = new JSONObject(DataController.getData().get("DELETE_EMPLOYEE"));

        for (int i = 0; i < obj.length(); i++) {
            if (obj.has(fields[i])) {
                System.out.println("O campo: " + fields[i] + " foi encontrado - Valor: " + obj.get(fields[i]));
            } else {
                System.out.println("O campo: " + fields[i] + " nao foi encontrado");
            }
        }
    }


}
