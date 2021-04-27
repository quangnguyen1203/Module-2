import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
    public static void main(String[] args) {
        Country country1 = new Country("1.0.0.0","1.0.0.255","16777216","16777471","AU","Australia");
        Country country2 = new Country("1.0.1.0","1.0.3.255","16777472","16778239","CN","China");
        Country country3 = new Country("1.0.4.0","1.0.7.255","16778240","16779263","AU","Australia");
        Country country4 = new Country("1.0.8.0","1.0.15.255","16779264","16781311","CN","China");
        Country country5 = new Country("1.0.16.0","1.0.31.255","16781312","16785407","JP","Japan");
        Country country6 = new Country("1.0.32.0","1.0.63.255","16785408","16793599","CN","China");
        Country country7 = new Country("1.0.64.0","1.0.127.255","16793600","16809983","JP","Japan");
        Country country8 = new Country("1.0.128.0","1.0.255.255","16809984","16842751","TH","Thailand");

        List<Country> list = new ArrayList<Country>();
        list.add(country1);
        list.add(country2);
        list.add(country3);
        list.add(country4);
        list.add(country5);
        list.add(country6);
        list.add(country7);
        list.add(country8);

        try {
            FileOutputStream fos = new FileOutputStream("country.csv");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//            oos.writeObject(list);
            byte[] b;
            for(int i=0;i<list.size();i++){
                b = list.get(i).toString().getBytes();
                fos.write(b);
            }
//            oos.writeObject(country1);
//            oos.writeObject(country2);
//            oos.writeObject(country3);
//            oos.writeObject(country4);
//            oos.writeObject(country5);
//            oos.writeObject(country6);
//            oos.writeObject(country7);
//            oos.writeObject(country8);
//            oos.close();
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
