interface Vehicle
{
    void Engine();
    void Gear();
    void Wheels();
}
class Bicycles implements Vehicle
{
    @Override
    public void Wheels()
    {
        System.out.println("I am Bicycle, I have 4 wheels.");
    }

    @Override
    public void Engine() {
        System.out.println(" I don't have any engine.");
    }

    @Override
    public void Gear()
    {
        System.out.println("I am Bicycle, I have gears.");
    }
}
class Cars implements Vehicle {
    @Override
    public void Engine()
    {
        System.out.println("I am a car, I have a V8 Engine.");
    }
    @Override
    public void Wheels()
    {
        System.out.println("I am a car, I have 4 wheels.");
    }
    @Override
    public void Gear()
    {
        System.out.println("I am a car, I have 5 gears.");
    }
}
class Bikes implements Vehicle{
    @Override
    public void Engine()
    {
        System.out.println("I am a Bike, I have a V4 Engine.");
    }
    @Override
    public void Wheels()
    {
        System.out.println("I am a Bike, I have two wheels.");
    }
    @Override
    public void Gear()
    {
        System.out.println("I am a Bike, I have gears.");
    }
}
class Expt13_1 {
    public static void main(String[] args)
    {
        Vehicle v1 = new Bicycles();
        v1.Wheels();
        v1.Gear();
        v1.Engine();

        System.out.println("----------------------------");

        Vehicle v2 = new Cars();
        v2.Engine();
        v2.Wheels();
        v2.Gear();

        System.out.println("----------------------------");

        Vehicle v3 = new Bikes();
        v3.Gear();
        v3.Wheels();
        v3.Engine();
    }
}