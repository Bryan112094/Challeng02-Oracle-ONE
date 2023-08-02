package ConversorAlura.ApiModule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class ApiClass {

    public static double Requestapi(String key, String firstDivisa, String secondDivisa) {
        String Request = String.format("https://v6.exchangerate-api.com/v6/%s/pair/%s/%s", key, firstDivisa, secondDivisa);

        try {
            // Creando URL y abriendo HttpUrlConnection.
            URL URL_API = new URL(Request);
            HttpURLConnection connection = (HttpURLConnection) URL_API.openConnection();
            connection.setRequestMethod("GET");

            // Se obtiene el código de respuesta de la api.
            int RESPONSE_CODE = connection.getResponseCode();

            // Uso del metodo ResponseCodeAndGetRate(), para obtener el valor requerido desde la api.
            double rate = ResponseCodeAndGetRate(RESPONSE_CODE, connection);
            return rate;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }

    }

    public static double ResponseCodeAndGetRate(int code, HttpURLConnection connection) throws IOException {
        if(code == HttpURLConnection.HTTP_OK){
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            JSONObject JSON_RESPONSE = new JSONObject(response.toString());

            double CONVERSION_RATE = JSON_RESPONSE.getDouble("conversion_rate");
            return CONVERSION_RATE;
        }else {
            System.out.println("A ocurrido un error");
            return -1;
        }
    }
}
