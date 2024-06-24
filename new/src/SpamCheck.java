import java.net.InetAddress;
import java.net.UnknownHostException;

public class SpamCheck {
    public static final String BLACKHOLE = "sbl.spamhaus.org";
    public static void main(String[] args) throws UnknownHostException {
        if (args.length == 0) {
            System.out.println("Please provide IP addresses to check.");
            return;
        }
        for(String arg:args){
            if(isSpammer(arg)){
                System.out.println(arg + " is a known Spammer");
            }
            else{
                System.out.println(arg+ " appears legitimate.");
            }
        }
    }
    private static boolean isSpammer(String arg){
        try{
            InetAddress ad = InetAddress.getByName(arg);
            byte[] qu = ad.getAddress();
            String query = BLACKHOLE;

            for(byte octet:qu){
                int unsignedByte = octet < 0 ? octet + 256: octet;
                query= unsignedByte + "." + query;
            }
            InetAddress.getByName(query);
            return true;
        }
        catch(UnknownHostException e){
            return false;
        }
    }
}
