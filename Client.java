import middleware.Middleware;
class Client{
    public static void main(String[] args){
        Middleware mware = new Middleware();
        
        try{
            System.out.println(mware.subService(args[0],args[1],args[2]));
        }catch(Exception e){
            System.out.println("\nHELP..!\n\n>>>For addition , use      java Client add (integer) (integer)\n>>>For substraction , use  java Client sub (integer) (integer)\n>>>For GCD , use           java Client gcd (integer) (integer)\n>>>For Power , use         java Client pow (integer) (integer)\n\n");
        }
    }
}