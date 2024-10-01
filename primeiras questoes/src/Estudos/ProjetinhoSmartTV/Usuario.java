public class Usuario {
    public static void main(String[] args) throws Exception{
        
        
        SmartTV smartTV = new SmartTV();
        System.out.println("TV ligada ? " + smartTV.ligada);
        System.out.println("Canal atual : " + smartTV.canal);
        System.out.println("Volume atual : " + smartTV.volume);



        smartTV.ligar ();
            System.out.println("Novo status -> TV ligada ? " + smartTV.ligada);
        smartTV.desligar();
            System.out.println("Novo status -> TV ligada ? " + smartTV.ligada);



        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        System.out.println("Volume atual " + smartTV.volume);


        System.out.println("Canal atual " + smartTV.canal);

        smartTV.mudarCanal(13);
        System.out.println("Canal atual " + smartTV.canal);

    }
}
