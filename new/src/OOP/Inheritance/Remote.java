package OOP.Inheritance;

interface Remote {
    public void volumeLevel(int level);
    public void channelNumber(int number);
}
interface Cable{
    public void cableType(String cType);
}
class TV implements Remote, Cable{
    public void volumeLevel(int level){
        System.out.println("Volume Level set to: " + level);
    }
    public void channelNumber(int number){
        System.out.println("Channel Number "+ number + " changed");
    }
    public void cableType(String cType){
    System.out.println("Type of cable used: "+ cType);
    }
    public static void main(String[] args) {
        TV t = new TV();
        t.cableType("HDMI");
        t.channelNumber(23);
        t.volumeLevel(4);
    }
}
