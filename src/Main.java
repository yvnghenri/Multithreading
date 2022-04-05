public class Main {

    //Method to shorten System.out.println(); method
    private void println(Object output){
        System.out.println(output);
    }

    //Start
    public static void main(String[] args) {

        //Instantiate main class
        Main main = new Main();

        //Check for correct syntax
        if(args.length != 1){
            main.println("Cannot resolve syntax...");
            System.exit(0);
        }
        //If syntax is correct run test() method on a new thread for every int threads
        else{
            final int threads = Integer.parseInt(args[0]);

            for(int i = 0; i < threads; i++){
                new Thread(main.test()).start();
            }
        }
    }

    //Method to run
    private Runnable test(){
        return new Runnable() {
            @Override
            public void run() {
                Main main = new Main();
                main.println("Working");
            }
        };
    }
}
