import static java.lang.Thread.sleep;

public class Nav implements Runnable{
    public float credSpeed;
    public float ostatokM;
    public float ostatokTime;
    private float time;

    public float S;

    int i = 0;

    @Override
    public void run() {
        while (true){
            try {
                sleep(1000);
            }catch (Exception e){}
            i++;

            time += 1;
            S = S + ((Car.timeTek / 1000) * Car.speed);

            if(i == 5){
                i = 0;
                credSpeed = S / time;
                ostatokM = Main.m - S;
                ostatokTime = ostatokM / credSpeed;

                if(ostatokM < 0){
                    System.out.println("Вы приехали");
                    System.exit (1);
                }

                System.out.println("Средняя скорость - " + credSpeed + " м/с, остаток маршрута - " + ostatokM + " м, времени осталось ехать - " + ostatokTime + " с");
            }
        }
    }
}
