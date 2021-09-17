public class BuddyInfo {



    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


    public static void main(String[] args) {
        BuddyInfo bud = new BuddyInfo("Pablo", "123 Saint", "416-333-4444");

        System.out.println("Hello "+ bud.getName()+ "!");
    }



    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }


}
