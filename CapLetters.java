/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitaldisplay;

/**
 *
 * @author bodig
 */
public class CapLetters {
   
    
     //Methods for Capital letters A to Z
        static void capa()
       {
           Reuse.mida();
           Reuse.mida2();
       }
        
        static void capb()
        {
         Reuse.mida();
         Reuse.b2();
        }
        
        static void capc()
        {
           for (int i = 1; i <= 8; i++) 
        {
            for (int j = 1; j <= 5; j++) 
            {
                if((i==2 && j==1)|| (i==3 && j==1) || (i==4) && (j==1) || (i==5 && j==1)|| (i==6 && j==1) || (i==7 && j==1) 
                        || (i==1 && j==2) || (i==1 && j==3) || (i==1 && j==4) || (i==1 && j==5)
                        || (i==8 && j==2 || (i==8 && j==3) || (i==8 && j==4) || (i==8 && j==5)))
                
                    System.out.print("*");
    
                else
                    System.out.print(" ");   
            }
        System.out.println(" ");
        }
        }
          static void capd()
        {
            for (int i = 1; i <=8; i++) 
        {
            for (int j = 1; j <= 5; j++) 
            {
                if((i==1 && j==1) ||(i==1 && j==2)||(i==1 && j==3)||(i==1 && j==4)
                        ||(i==2 && j==1)|| (i==2 && j==5)
                        ||(i==3 && j==1)||(i==3 && j==5)||(i==4 && j==1)
                    || (i==4 && j==5) || (i==5 && j==1)|| (i==5 && j==5)
                    || (i==6 && j==5) || (i==6 && j==1)|| (i==7 && j==1)||(i==7 && j==5)||
                        (i==8 && j==1) ||(i==8 && j==2)||(i==8 && j==3)||(i==8 && j==4))
                    
                    
                        {
                    System.out.print("*");
                        }
                else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }
        }
          static void cape()
        {
             for (int i = 1; i <= 8; i++) 
               {
                   for (int j = 1; j <= 5; j++) 
                   {
                       if((i==2 && j==1)|| (i==3 && j==1) || (i==4) && (j==1) || (i==5 && j==1)|| (i==6 && j==1) || (i==7 && j==1) 
                            ||(i==1 && j==1)   || (i==1 && j==2) || (i==1 && j==3) || (i==1 && j==4) || (i==1 && j==5)
                               ||(i==8 && j==1)|| (i==8 && j==2 || (i==8 && j==3) || (i==8 && j==4) || (i==8 && j==5) 
                               || (i==4 && j==2)|| (i==4 && j==3) || (i==4 && j==4) || (i==4 && j==5)))

                           System.out.print("*");

                       else
                           System.out.print(" ");

                   }

               System.out.println(" ");
               }
        }
          static void capf()
        {
             for (int i = 1; i < 8; i++) 
        {
            for (int j = 1; j <= 5; j++) 
            {
                if((i==1 && j==1) || (i==1 && j==2)|| (i==1 && j==3) || (i==1 && j==4) || (i==1 && j==5) 
                    || (i==2 && j==1) || (i==3 && j==1)|| (i==4 && j==1) || (i==5 && j==1) 
                    || (i==4 && j==2) || (i==4 && j==3)|| (i==4 && j==4)
                    || (i==5 && j==1) || (i==6 && j==1)|| (i==7 && j==1))   
                
                    System.out.print("*");
                 
                else
                    System.out.print(" ");
            }
        
        System.out.println(" ");
        } 
        }
          
         static void capg()
        {
           Reuse.iupper();
            for(int i=1;i<=6; i++)
         {
             for(int j=1;j<=5;j++)
             {
                 if((i==1 && j==1)||
                         (i==2 && j==1)||
                         (i==3 & j==1)|| 
                         (i==4 && j==1) ||(i==4 && j==3)||(i==4 && j==4)||(i==4 && j==5)||
                         (i==5 && j==1)||(i==5 && j==5)||
                         (i==6 && j==1)||(i==6 && j==5))
                     
                 System.out.print("*");
                 else
                     System.out.print(" ");
             }
             System.out.println("");
         }
          Reuse.iupper();     
            System.out.println("");
        }
        
        static void caph()
        {
             //Reuse.h1();
            SmallLetters.smallu();
       Reuse.mida2();
        }
        
        static void capi()
        {
            Reuse.iupper();
            Reuse.i();
            Reuse.i();
            Reuse.iupper();
        }
        
        static void capj()
        {
         Reuse.iupper();
         Reuse.i();
         Reuse.endj();
        }
        
        static void capk()
        {
            for(int i=1;i<=4; i++)
         {
             for(int j=1;j<=5;j++)
             {
                 if((i==1 && j==1) || 
                         (i==2 && j==1)||(i==2 && j==5)||
                         (i==3 & j==1)|| (i==3 && j==4)||
                         (i==4 && j==1) ||(i==4 && j==3))
                 System.out.print("*");
                 else
                     System.out.print(" ");
             }
             System.out.println("");
         }
            Reuse.k_r_2();
        }
        
        static void capl()
        {
          Reuse.lcaps();
          Reuse.iupper();
        }
        
        static void capm()
        {
            for(int i = 1; i<=8;i++)
       {
           for(int j=1;j<=5;j++)
           {
           if((i==1 && j==2)||(i==1 && j==3)||(i==1 && j==4)
                   ||(i==2 && j==3)
                  ||(i==3 && j==3)||
                   (i==4 && j==3)
                   ||(i==5 && j==3)
                   ||(i==6 &&  j==2)||(i==6 && j==4)||
                   (i==7 && j==2)||(i==7 && j==3)||(i==7 && j==4)||
                   (i==8 && j==2)||(i==8 && j==3)||(i==8 && j==4))
                  
           {
              System.out.print(" ");
           } else
                   System.out.print("*");
               }
           System.out.println(" "); 
           } 
        }
        
        static void capn()
        {
            for(int i = 1; i<=8;i++)
             {
           for(int j=1;j<=5;j++)
           {
                if((i==1 && j==1)||(i==1 && j==5)||
                   (i==2 && j==1)||(i==2 && j==2)||(i==2 && j==5)
                   ||(i==3 && j==1)||(i==3 && j==2)||(i==3 && j==5)||
                   (i==4 && j==1)||(i==4 && j==3)||(i==4 && j==5)
                   ||(i==5 && j==1)||(i==5 && j==3)||(i==5 && j==5)
                   ||(i==6 &&  j==1)||(i==6 && j==4)||(i==6 && j==5)||
                   (i==7 && j==1)||(i==7 && j==4)||(i==7 && j==5)||
                   (i==8 && j==1)||(i==8 && j==5))
                  
           {
              System.out.print("*");
           } else
                   System.out.print(" ");
               }
           System.out.println(" "); 
           } 
        }
        static void capo()
        {
            Reuse.o1();
            Reuse.u2(); 
        }
        static void capp()
        {
         Reuse.mida();
         for(int i=1;i<=4; i++)
         {
             for(int j=1;j<=5;j++)
             {
                 if((i==1 && j==1) ||
                         (i==2 && j==1)||
                         (i==3 & j==1)||
                         (i==4 && j==1))
                 System.out.print("*");
                 else
                     System.out.print(" ");
             }
             System.out.println("");
         }
        }
        
        static void capq()
        {
               for(int i = 1; i<=8;i++)
             {
           for(int j=1;j<=5;j++)
           {
                if((i==1 && j==2)||(i==1 && j==3)||(i==1 && j==4)||
                   (i==2 && j==1)||(i==2 && j==5)
                   ||(i==3 && j==1)||(i==3 && j==5)||
                   (i==4 && j==1)||(i==4 && j==5)
                   ||(i==5 && j==1)||(i==5 && j==5)
                   ||(i==6 &&  j==1)||(i==6 && j==3)||(i==6 && j==5)||
                   (i==7 && j==2)||(i==7 && j==3)||(i==7 && j==4)||
                   (i==8 && j==5))
                  
           {
              System.out.print("*");
           } else
                   System.out.print(" ");
               }
           System.out.println(" "); 
           }
        }
        
        static void capr()
        {
         Reuse.mida(); 
         Reuse.k_r_2();
        }
        
        static void caps()
        {
         SmallLetters.smallc();
         Reuse.ends();
        }
        
        static void capt()
        {
            Reuse.iupper();
            Reuse.i();
            Reuse.i();
            Reuse.fullstop();
        }
        
         static void capu()
        {
         Reuse.mida2();
       Reuse.u2();   
        }
         static void capv()
        {
            Reuse.part_vw();
            Reuse.part_vw();
            Reuse.part_vw();
            for(int i = 1; i<=1;i++)
            {
          for(int j=1;j<=5;j++)
          {
               if((i==1 && j==2)||(i==1 && j==4))
               {
             System.out.print("*");
          }
               else
                  System.out.print(" ");
              }
          System.out.println(" "); 
          }
              Reuse.fullstop();
        }

         static void capw()
        {
            Reuse.part_vw();
            for(int i = 1; i<=5;i++)
            {
          for(int j=1;j<=5;j++)
          {
               if((i==1 && j==2)||(i==1 && j==4)||
                  (i==2 && j==2)||(i==2 && j==4)||
                  (i==3 && j==3)||
                  (i==4 && j==3)||
                  (i==5 && j==2)||(i==5 && j==3)||(i==5 && j==4))
               {
             System.out.print(" ");
          }
               else
                  System.out.print("*");
              }
          System.out.println(" "); 
          } 
        }
         static void capx()
        {
            SmallLetters.smallv();
            Reuse.fullstop();
            for(int i = 1; i<=1;i++)
            {
          for(int j=1;j<=5;j++)
          {
               if((i==1 && j==2)||(i==1 && j==4))
               {
             System.out.print("*");
          }
               else
                  System.out.print(" ");
              }
          System.out.println(" "); 
          } 
            Reuse.part_vw();
        }
         static void capy()
        {
           SmallLetters.smallv();
           Reuse.i();
           Reuse.fullstop();
        }
         static void capz()
        {
           Numbers.seven();
            Reuse.iupper();
        }
}
