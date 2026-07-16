public class Logger{
    private static Logger instance;

    private Logger(){
        System.out.println("Logger instance created");

    }

    public static Logger getinstance(){
        if(instance == null){
            instance = new Logger();

        }
        return instance;
    }
    public static void log(String message){
        System.out.println("LOG: " + message);
    }

    
}