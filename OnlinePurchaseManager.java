package pkg;
import java.util.ArrayList;
public class OnlinePurchaseManager
{
   
   private ArrayList<Gizmo> purchases;
   

   
   public Gizmo getCheapestGizmoByMaker( String mkr )
   {
   	
   }
   
   public void add(String c, boolean elec, int p){
      
   }

   public int countElectronicsByMaker(String mak){
      int c = 0;
      for(int i = 0; i<purchases.size();i++){
         if(purchases.get(i).isElectronic()){
            if(purchases.get(i).getMaker() == mak){
               c++;
            }
         }
      }
      return c;
   }
   
   public boolean hasAdjacentEqualPair(){
      int g = 0;
      for(int i = 1; i<purchases.size();i++){
         if(purchases.get(i).equals(purchases.get(i-1))){
            g++;
         }
      }
      if(g>1){
         return true;
      }
      else return false;
   }
   
   public String toString()
   {
   	return "" + purchases;
   }
}
