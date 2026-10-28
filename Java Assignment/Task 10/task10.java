package Assignment1;

public class task10 {

    static class ParkingTicket {
        private String regNo;
        private int slotNo;

        ParkingTicket(String regNo, int slotNo) {
            this.regNo = regNo;
            setSlotNo(slotNo);
        }

        public String getRegNo() {
            return regNo;
        }

        public int getSlotNo() {
            return slotNo;
        }

        public void setSlotNo(int slotNo) {
            if (slotNo > 0) {
                this.slotNo = slotNo;
            } else {
                System.out.println("Invalid slot number");
            }
        }
    }

    public static void main(String[] args) {

        ParkingTicket t1 = new ParkingTicket("TN01A1", 10);

        System.out.println("Registration Number: " + t1.getRegNo());
        System.out.println("Slot Number: " + t1.getSlotNo());

        t1.setSlotNo(15);
        System.out.println("Updated Slot Number: " + t1.getSlotNo());

        t1.setSlotNo(-2);
        System.out.println("Slot Number: " + t1.getSlotNo());
    }
}