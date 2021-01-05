package carDealership;

public class Employee extends Person{

    public Employee(String name) {
        super(name);
    }

    private String runCreditHistory(Customer customer) {

        if (customer.getCreditRating() <= 500) {
            return "Bad Credit";
        } else {
            return "Good Credit";
        }
    }

    public void handleCustomer(Customer customer, Vehicle vehicle, boolean finance) {

        if (finance == true) {
            String credit = runCreditHistory(customer);
            if (credit.equals("Good Credit")) {
                System.out.println("We ran your credit and it looks like we have some financing options.");
            } else {
                System.out.println("Sorry, we are currently unable to assist you with your credit rating.");
            }
        }

        if (customer.getCash() >= vehicle.getPrice()) {
            System.out.println("Everything's good enjoy your " + vehicle.getModel());
        } else {
            System.out.println("Sorry, ya poor!");
        }

    }
}
