class Main{ 
    public static void main(String[] args) {
        System.out.println("Mundito Car");
        Car car = new Car("AMQ123", 
        new Account("Andres Herrena", "AND125",
         "paquin@hotmail.com", "123456"));
        car.setPassenger(4);
        car.printDataCar();
    
        System.out.println("Usuario BB");
        User user = new User("Lesly Lucano",
        "7458632",
        "lely02@gmail.com", "piolin654");
        user.printDataUser();

        System.out.println("HI UBERMIKI");
         UberX uberx = new UberX( "JJJ655", new Account("Juanito Salazar ", "85967456"
         , "juani.salza@gmail.com", "olin334"), "Nissan", "Sentra");
        uberx.setPassenger(4);
        uberx.printDataCar();

        System.out.println("HI UBERFAMILIAR");
        UberVan uberVan = new UberVan("FGH555", new Account( "Willy León", "anda456",
        "curlin@hotmail.com", "654321"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
        
    }
}
