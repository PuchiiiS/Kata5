package software.ulpgc.kata5.io;

import org.jsoup.Jsoup;
import org.jsoup.Connection;
import java.io.IOException;

public class RandomUserReader implements UserReader{
    @Override
    public String read(){
        try {
            return read("https://randomuser.me/api/");
        } catch (IOException e) {
            throw new RuntimeException("Error al leer de la API", e);
        }
    }

    private static String read(String url) throws IOException{
        Connection.Response response = Jsoup.connect(url).ignoreContentType(true).header("accept", "aplication/json")
                .method(Connection.Method.GET).execute();
        if (response.statusCode() != 200) throw new RuntimeException("Error al conectar con la API" + response.statusCode());
        return response.body();
    }
}
