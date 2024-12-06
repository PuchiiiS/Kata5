package Software.ulpgc.kata5;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args){

        port(8080);

        get("/convertir/:dia", (req, res) -> {
            try{
                int dayOfYear = Integer.parseInt(req.params(":dia"));
                if(dayOfYear < 1 || dayOfYear > 365){
                    res.status(400);
                    return "El numero debe estar entre 1 y 365";
                }
                String result = DayOfYearAdapter.converDayTodDate(dayOfYear);
                return result;
            } catch (NumberFormatException e) {
                res.status(400);
                return "El valor debe ser un numero válido";
            }
        });

        System.out.println("http://localhost:8080");
    }
}
