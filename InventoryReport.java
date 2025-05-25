public class InventoryReport {
    public static void main(String[] args) {
        String[] items = {"Mouse", "Keyboard", "Monitor"};
        
        for (int i = 0; i < items.length; i++) {
            int reportType = i % 2;
            switch (reportType) {
                case 0:
                    System.out.println("Stock Report for: " + items[i]);
                    break;
                case 1:
                    System.out.println("Sales Report for: " + items[i]);
                    break;
                default:
                    System.out.println("Invalid Report Type");
            }
        }
    }
}
