
class day58{
    void run() {
        System.out.println("Vehicle is running.");
    }
}

class Bike extends day58 {
    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.run();
    }
}
