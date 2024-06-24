import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

// To list all network interfaces
public class Iface {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface interf = interfaces.nextElement();
                System.out.println("Name: " + interf.getName());
                System.out.println("Display Name: " + interf.getDisplayName());
                System.out.println("MTU: " + interf.getMTU());
                System.out.println("Loopback: " + interf.isLoopback());
                System.out.println("Up: " + interf.isUp());
                System.out.println("Virtual: " + interf.isVirtual());
                System.out.println();
            }
        } catch (SocketException e) {
            System.out.println(e);
        }
    }
}
