package Jobs.Domain;

public abstract class AbsStaffMember {

    private int id;
    private String name;
    private String address;
    private String phone;
    private double totalPaid=0;

    private static int COUNTER_MEMBERS = 1;

    public AbsStaffMember(String name, String address, String phone) throws Exception {
        if (name.equals(""))
            throw new Exception();
        if (address.equals(""))
            throw new Exception();
        if (phone.equals(""))
            throw new Exception();

        this.name = name;
        this.address = address;
        this.phone = phone;
        id = COUNTER_MEMBERS;
        COUNTER_MEMBERS++;
    }

    public abstract void pay();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public double getTotalPaid(double pay) {
        return totalPaid;
    }

    public void setTotalPaid(double totalPaid) {
        this.totalPaid = totalPaid;
    }

    public static int getCounterMembers() {
        return COUNTER_MEMBERS;
    }

    public static void setCounterMembers(int counterMembers) {
        COUNTER_MEMBERS = counterMembers;
    }
}

