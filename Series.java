
public class Series
{
  
    public void generarSerie(int nsimo){
      
        int limite = 3;

        int incial = 1;
        
        int incEn1 = 0;
        
        int numSerie = 1;
        while(incial <= nsimo){
            
            if(incEn1 < limite){
             
                
                System.out.println(numSerie);
                incEn1++;
                numSerie = numSerie + incEn1;
                
            }
            else{
                limite = 1;
                System.out.println(numSerie);         
                if(incEn1 > limite){
                   incEn1--;
                   numSerie = numSerie + incEn1; 
                }else{
                   incEn1++;
                   numSerie = numSerie + incEn1;
                   limite=3;
                }
                
                
            }
            incial++;
        
        }
    }
           int padovan;
    public void sucesionPadovan(int p){
        do{
        this.padovan=p;
        }while(p<0);
            int padovan[] = new int[p+1];
            for(int i=0; i<p; i++){
        
                  if(i>=3){
                       padovan[i]= padovan[i-2] + padovan[i-3];
                   }else{
                       padovan[i]=1;
                  } 
    
            }
        System.out.println("posicion de padovan es : ");
            for(int x=0; x<p; x++){
                if(x==p-1){
                    System.out.println(padovan[x]);
                }else{
                    System.out.println(padovan[x]+"");
                }
            
            }
    
    
    
    }

}
