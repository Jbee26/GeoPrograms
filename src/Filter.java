

public class Filter extends World
{

   public int red;
   public int blue;
   public int green;
 

   public void go()
   {
      System.out.println("This will be printed to the  window. ");
      plane.teleport(0,0);
      plane.showBackGround();
      System.out.println(plane.howMuchRed());
   
      for(int row=1; row<250; row++)
      {
         
         for(int col=1; col<250; col++)
         {
            plane.teleport(col,row);
            red   = plane.howMuchRed();  //this returns a number between 0 and 255 describing how much red there is
            green = plane.howMuchGreen();  //this returns a number between 0 and 255 describing how much green there is
            blue  = plane.howMuchBlue();  //this returns a number between 0 and 255 describing how much blue there is
         
         
         
            if(red>80 && green<45 && blue<50)
            {
               plane.setPixelColor(0,255,1);
               		
            
            }
           //  if(gr)
//             {
//                plane.setPixelColor(51,51,251);
               		
            
          //  }
         
         
         
         
         }
      }
   
   
   }



}

