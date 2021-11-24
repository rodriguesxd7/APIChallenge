package Statments;

import Requests.RequestsJson;
import Suporte.DataController;
import io.restassured.path.json.JsonPath;
import org.json.JSONObject;

import java.io.IOException;

public class AlterDataEmployee {

    RequestsJson request = new RequestsJson();

    public void consultEmployeeToAlterData() throws IOException {
        JsonPath res = new JsonPath(DataController.getData().get("CREATE_EMPLOYEE"));
        String id = res.getJsonObject("data.id").toString();

        JSONObject obj = new JSONObject();
        obj.put("name", "Anastacia Rodrigues Virginio");
        obj.put("salary", "0");
        obj.put("age", "4");

        request.alterDataEmployee(obj, id);
    }

    public void getResponsePutMainFields() {
        String [] fields = {"status", "data", "message"};
        JSONObject obj = new JSONObject(DataController.getData().get("ALTER_EMPLOYEE"));

        for (int i = 0; i < obj.length(); i++) {
            if(obj.has(fields[i])) {
                System.out.println("O campo: "  + fields[i] + " foi encontrado - Valor: " + obj.get(fields[i]));
            } else {
                System.out.println("O campo: " + fields[i] + " nao foi encontrado");
            }
        }
    }

    public void getResponsePutSubFieldsData () {
        String [] fields = {"name", "salary", "age", "id"};
        JSONObject obj = new JSONObject(DataController.getData().get("ALTER_EMPLOYEE"));

        if (obj.has("data")) {
            JSONObject objData = obj.getJSONObject("data");
            for (int i = 0; i < objData.length(); i ++ ) {
                if(objData.has(fields[i])) {
                    System.out.println("O campo: "  + fields[i] + " foi encontrado - Valor: " + objData.get(fields[i]));
                } else {
                    System.out.println("O campo: " + fields[i] + " nao foi encontrado");
                }
            }
        }
    }
}
