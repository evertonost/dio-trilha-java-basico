public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o Volume Para :"+volume);
       
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o Volume Para :"+volume);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando o canal Para :"+canal);
       
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo o canal Para :"+canal);
    }

    public void mudarCanal( int novoCanal){
        canal = novoCanal;
    }


}
