class Driver extends Account {
    public Driver (String name, String document, 
    String email, String password){
        super(name, document, email, password);
    }
    void printDataDriver(){
        System.out.println("Documento " + document 
        + " Name Driver: " + name + " Email: " 
        + email + " Password: " + password);
    }
}
    
