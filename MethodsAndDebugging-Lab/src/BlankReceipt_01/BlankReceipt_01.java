package BlankReceipt_01;

/**
 * Created by Peter on 11.06.2017.
 */
public class BlankReceipt_01 {
    public static void main(String[] args) {
        PrintReceipt();
    }

    public static void PrintReceiptHeader() {
        System.out.println("CASH RECEIPT");
        System.out.println("------------------------------");
    }

    public static void PrintReceiptBody() {
        System.out.println("Charged to____________________");
        System.out.println("Received by___________________");
    }

    public static void PrintReceiptFooter() {
        System.out.println("------------------------------");
        int symbol = 169;
        System.out.println((char)symbol + " SoftUni");
    }

    public static void PrintReceipt(){
        PrintReceiptHeader();
        PrintReceiptBody();
        PrintReceiptFooter();
    }
}
