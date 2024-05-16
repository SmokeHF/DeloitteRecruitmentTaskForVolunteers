public class Main {
  public static void main(String[] args) {
    int[] tab={-3,1,2,-3,-3,-1};
    
    int maxPair=0;
    for(int i =0;i<tab.length;i++){
      for(int l=0;l<i;l++){
        if(tab[l]==(-1)*tab[i]){
          if(maxPair<Math.abs(tab[i])){
            maxPair=Math.abs(tab[i]);
          }
        }  
      }
    }
    if(maxPair==0)
      System.out.println("there aren't any pairs");
    else
      System.out.println("highes pair is : "+maxPair+" and "+maxPair*(-1));
  }
}