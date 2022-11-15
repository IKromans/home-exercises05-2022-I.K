package io.codelex.oop.exercise3;

public class CarTest {
    public static void main(String[] args) {
        Car audi1 = new Car("Audi", "100", 7900.00, 1994, EngineType.V6);
        Car audi2 = new Car("Audi", "200", 18700.00, 1990, EngineType.V8);
        Car audi3 = new Car("Audi", "A6", 8000.00, 2002, EngineType.V6);
        Car audi4 = new Car("Audi", "V8", 12900.00, 1994, EngineType.V8);
        Car audi5 = new Car("Audi", "S3", 45000.00, 2022, EngineType.S3);
        Car audi6 = new Car("Audi", "Q7", 36990.00, 2012, EngineType.V12);
        Car audi7 = new Car("Audi", "S4", 15700.00, 1994, EngineType.S4);
        Car mini = new Car("Mini", "Countryman", 53810.00, 2017, EngineType.HYBRID);
        Car citroenCv = new Car("Citroen", "2CV", 18000.00, 1986, EngineType.AIR_COOLED);

        CarService service = new CarService();
        service.addCars(audi1);
        service.addCars(audi2);
        service.addCars(audi3);
        service.addCars(audi4);
        service.addCars(audi5);
        service.addCars(audi6);
        service.addCars(audi7);
        service.addCars(mini);
        service.addCars(citroenCv);
        service.removeCars(audi2);

        Manufacturer vw = new Manufacturer("Volkswagen Group", 1899, "Germany");
        Manufacturer bmw = new Manufacturer("BMW", 1916, "Germany");
        Manufacturer citroen = new Manufacturer("Citroen", 1919, "France");
        Manufacturer renault = new Manufacturer("Renault" , 1899, "France");
        Manufacturer peugeot = new Manufacturer("Peugeot", 1810, "France");

        audi1.addManufacturers(vw);
        audi2.addManufacturers(vw);
        audi3.addManufacturers(vw);
        audi4.addManufacturers(vw);
        audi5.addManufacturers(vw);
        audi6.addManufacturers(vw);
        audi7.addManufacturers(vw);
        mini.addManufacturers(bmw);
        citroenCv.addManufacturers(citroen);
        citroenCv.addManufacturers(renault);
        citroenCv.addManufacturers(peugeot);

        System.out.println("All list: " + service.carsList.toString() + "\n");
        System.out.println("Has V12 in: " + service.carEngineList(EngineType.V6) + "\n");
        System.out.println("Cars produced before: " + service.productBefore(1989) + "\n");
        System.out.println("Expensive car: " + service.mostExpensive() + "\n");
        System.out.println("Cheapest car :" + service.mostCheapest() + "\n");
        System.out.println("Made by number of manufacturers :" + service.manufacturedAtLeast(3) + "\n");
        System.out.println("Sorted by year : " + service.sortedByYear() + "\n");
        System.out.println("Specific brand :" + service.specificBrand("Mini") + "\n");
        System.out.println("Specific manufacturer :" + service.specificManufacturer("Volkswagen Group") + "\n");
    }
}
