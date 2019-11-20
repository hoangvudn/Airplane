package AP;

public class AirPlane {
    private String idAirPlane;
    private String nameAirPlane;
    private String typeAirPlane;
   /* public AirPlane(String idAirPlane, String nameAirPlane, String typeAirPlane){
           this.idAirPlane=idAirPlane;
           this.nameAirPlane=nameAirPlane;
           this.typeAirPlane=typeAirPlane;
    }*/
    public void typeTakeOff(){
        System.out.println("Take Off");
    }
    public void fly(){
        System.out.println(" Flying on the Sky...!!!");
    }
    public String getidAirPlane(){return idAirPlane;}
    public void setidAirPlane(String newIdAP){this.idAirPlane=newIdAP;}
    public String getNameAirPlane(){return nameAirPlane;}
    public void setNameAirPlane(String newNameAP){this.nameAirPlane=newNameAP;}
    public String getTypeAirPlane(){return typeAirPlane;}
    public void setTypeAirPlane(String newTypeAAP){this.typeAirPlane=newTypeAAP;}
}
