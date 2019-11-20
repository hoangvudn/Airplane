package AP;

public class Main {
        public static void main(String[] args){
                AirPlane ap=new AirPlane();
                ap.setidAirPlane("AP888888");
                ap.setNameAirPlane("AirForceOne");
                ap.setTypeAirPlane("Helicopter");

                System.out.println("This is test OOP programming: ");
                System.out.println("This is test ID Air Plane: " + ap.getidAirPlane()+" --- Name Of AirPlane: " + ap.getNameAirPlane()+" --- Type of AirPlane: " + ap.getTypeAirPlane());
                Helicopter hlc=new Helicopter();
                hlc.setNameAirPlane("Turn down. Fire:  ");
                //Override
                hlc.typeTakeOff();
                System.out.println("This is test inheritance of Helicopter:"+hlc.getNameAirPlane());
                AttackAir at=new AttackAir();
                at.setNameAirPlane(" B2 SPIRIT: BOM");
                System.out.println("This is test inheritance of AttackAir: "+at.getNameAirPlane());
                at.fly();
                at.AttackAir(2000,30);
        }
}
