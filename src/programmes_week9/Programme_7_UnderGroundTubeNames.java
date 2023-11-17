package programmes_week9;

import java.util.ArrayList;

public class Programme_7_UnderGroundTubeNames {
    public void isEmpty() {
        ArrayList<String> tubeNames = new ArrayList<>();
        tubeNames.add("Bakerloo lines");
        tubeNames.add("Central lines");
        tubeNames.add("Circle lines");
        tubeNames.add("Disrict lines");
        tubeNames.add("Hammdersmith_and_City_line");
        tubeNames.add("Jubilee lines");
        tubeNames.add("Metropolitan lines");
        tubeNames.add("Northern lines");
        tubeNames.add("Piccadilly lines");
        tubeNames.add("Victoria lines");
        tubeNames.add("Waterloo and City lines");
        System.out.println("Given Array List: " + tubeNames);
        if (tubeNames.isEmpty()) {
            System.out.println("Given Array List is empty");
        } else {
            System.out.println("Given Array List is not Empty");
        }
    }

    public static void main(String[] args) {
        Programme_7_UnderGroundTubeNames obj = new Programme_7_UnderGroundTubeNames();
        obj.isEmpty();
    }
    }


