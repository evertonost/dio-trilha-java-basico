public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV(); 
        

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();


        smartTV.diminuirCanal();
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();

        


        System.out.println("TV Ligada ?  "+smartTV.ligada);
        System.out.println("Canal Atual : "+smartTV.canal);
        System.out.println("Volume Atual: "+smartTV.volume);

        smartTV.ligar();

        System.out.println("Novo status ->TV Ligada ?  "+smartTV.ligada);

        smartTV.desligar();

        System.out.println("Novo status ->TV Ligada ?  "+smartTV.ligada);
        smartTV.mudarCanal(13);
        System.out.println("Canal  Atual: "+smartTV.canal);



    }
}