import java.util.Map;

/**A class which provides methods for claculating QCA based on grades. It maps grades to the corresponding QCA
    * Class gets information from CSV file */
public class QcaCalc {

//creates object of the CsvReader class
    static CsvReader reader = new CsvReader();
    
//maps grades to corresponding QCA; reads grades from CSV file
    static Map<String, Double> gradeQcaMap = reader.readGrade("./src/data/grades.csv");

/**Calculates QCA for a given set of grades
    *@param grades -the grades to be calculated
    *@return the QCA */
    public static double getCummulativeQca ( String ... grades) {
        //We used to Varargs here instead of method overloading for more clean and readable code
        int numModules = grades.length;
        double cummulativeQca = 0.00;

        for (String grade : grades) {
            cummulativeQca += (gradeQcaMap.get(grade)) / numModules;

        }
        return cummulativeQca;
    }
}
