package week.o4.exp04;

    public class Passenger {
    private String idCard;
    private String name;
    
        public Passenger(String idCard, String name) {
        this.idCard = idCard;
        this.name = name;
        }
        public String getIdCard() {
        return idCard;
        }
        public String getName() {
        return name;
        }  

        public String info() {
        String info = "";
        info += "ID Card: " + idCard + "\n";
        info += "Name: " + name + "\n";
        return info;
    }
}
