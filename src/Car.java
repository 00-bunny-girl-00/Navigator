import static java.lang.Thread.sleep;

public class Car implements Runnable{
    public static float speed = 5;
    public static int timeTek = 1000;

    public boolean PlusOrMinus = true;

    public void run(){
        for (int i = 0; i < 10; i++){
            speed += 5;
            try {
                sleep(timeTek);
            }catch (Exception e){}
        }

        while (true){
            if(PlusOrMinus) {
                speed += 5;
                PlusOrMinus = false;
            }else {
                speed -= 5;
                PlusOrMinus = true;
            }
            try {
                sleep(timeTek);
            }catch (Exception e){}
        }
    }
}
