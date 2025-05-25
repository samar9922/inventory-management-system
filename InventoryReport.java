public class InventoryReport {
    public static void main(String[] args) {
        String[] items = {"Mouse", "Keyboard", "Monitor"};
        double[] prices = {5.5, 12.0, 80.0};

        for (int i = 0; i < items.length; i++) {
            int reportType = i % 2;
            switch (reportType) {
                case 0:
                    System.out.println("Stock Report - Item: " + items[i] + ", Price: " + prices[i]);
                    break;
                case 1:
                    System.out.println("Sales Report - Item: " + items[i] + ", Price: " + prices[i]);
                    break;
                default:
                    System.out.println("Invalid Report Type");
            }
        }
        // Added by [CollaboratorName]: Display total item count
        System.out.println("Total Items in Inventory Report: " + items.length);
    }
} 
