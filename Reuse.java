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
public class Reuse {
    
        //Followig are some methods created for reuse 

        static void gap()
        {
            for(int i =0;i<5;i++)
            {
                for(int  j = 0;j<5;j++)
                {
                    System.out.print(" ");
                }
                System.out.println(" ");
            }
        }
        
        static void a()
               {
             for (int i = 1; i <= 4; i++) 
        {
            for (int j = 1; j <= 5; j++) 
            {
                if((i==1 && j==1) || (i==1 && j==2)|| (i==1 && j==3) || (i==1 && j==4) || (i==1 && j==5)
                    || (i==2 && j==5)||(i==3 && j==5)||(i==4 && j==5) ||(i==3 && j==1)|| (i==3 && j==2)||
                        (i==3 && j==3) || (i==3 && j==4) || (i==4 && j==1))
                
                    System.out.print("*");
    
                else
                    System.out.print(" ");   
            }
        System.out.println(" ");
         }
         }

        static void mida()
        {
           
           

            for(int i = 1; i<=4;i++)
           {
               for(int j=1;j<=5;j++)
               {

                   if((i==2 && j==2)||(i==2 && j==3)||(i==2 && j==4)||
                           (i==3 && j==2)||(i==3 && j==3)||(i==3 && j==4) ) 
                System.out.print(" ");
                   else
                       System.out.print("*");
                   }
               System.out.println(" ");
           }

            } 
        static void mida2()
        {
             for(int i = 1; i<=4;i++)
           {
               for(int j=1;j<=5;j++)
               {
               if((i==1 && j==2)||(i==1 && j==3)||(i==1 && j==4)||(i==2 && j==2)||
                       (i==2 && j==3)|| (i==2 && j==4)||
                       (i==3 && j==2)||(i==3 && j==3)||(i==3 && j==4)||
                       (i==4 && j==2)||(i==4 && j==3)||(i==4 && j==4)) 
               {
                  System.out.print(" ");
               } else
                       System.out.print("*");
                   }
               System.out.println(" "); 
               }
               }

            static void u2()
            {
                 for(int i = 1; i<=4;i++)
           {
               for(int j=1;j<=5;j++)
               {
               if((i==1 && j==2)||(i==1 && j==3)||(i==1 && j==4)||
                       (i==2 && j==2)||(i==2 && j==3)|| (i==2 && j==4)||
                       (i==3 && j==2)||(i==3 && j==3)||(i==3 && j==4)) 
               {
                  System.out.print(" ");
               } else
                       System.out.print("*");
                   }
               System.out.println(" "); 
               }
            }
            static void b2()
            {
                 for(int i = 1; i<=4;i++)
           {
               for(int j=1;j<=5;j++)
               {
               if((i==1 && j==2)||(i==1 && j==3)||(i==1 && j==4)||
                       (i==2 && j==2)||(i==2 && j==3)|| (i==2 && j==4)||
                       (i==3 && j==2)||(i==3 && j==3)||(i==3 && j==4)) 
               {
                  System.out.print(" ");
               } else
                       System.out.print("*");
                   }
               System.out.println(" "); 
               }
            }


            static void m1()
             { 
            for(int i=1;i<=4;i++)
            {
            for(int j=1;j<=5;j++)
            {
                if((i==1 && j==1)||(i==1 && j==3)||(i==1 && j==5)||
                        (i==2 && j==2) ||(i==2 && j==4)||
                        (i==3 && j==2) || (i==3 && j==4) || (i==4 && j==2) ||
                        (i==4 && j==4)||(i==4 && j==3)) 
               {
                  System.out.print(" ");
               } else
                       System.out.print("*");
                   }
               System.out.println("");
             }
             }

             static void o1()
             {
                  for(int i = 1; i<=4;i++)
           {
               for(int j=1;j<=5;j++)
               {

                   if((i==1 && j==1)||(i==1 && j==5)||(i==2 && j==2)||
                           (i==2 && j==3)||(i==2 && j==4)
                           ||(i==3 && j==2)||(i==3 && j==3)||(i==3 && j==4)|| 
                           (i==4 && j==2)||(i==4 && j==3)||(i==4 && j==4 ) )
                System.out.print(" ");
                   else
                       System.out.print("*");
                   }
               System.out.println(" ");
           }
             }
             static void endj()
            {
             for (int i = 1; i <= 4; i++) 
                {
                    for (int j = 1; j <= 5; j++) 
                    {
                        if((i==1 && j==3)|| 
                                (i==2 && j==3) ||
                                (i==3 && j==3) ||  (i==3 && j==1)||
                                (i==4 && j==3) || (i==4 && j==1))    

                            System.out.print("*");

                        else
                            System.out.print(" ");
                    }

                System.out.println(" ");
                }
            }



            static void fullstop()
            {
              for (int i = 1; i <=1; i++) 
                    {
                        for (int j = 1; j <= 5; j++) 
                        {
                            if((i==1 && j==3))   

                                System.out.print("*");

                            else
                                System.out.print(" ");
                        }

                    System.out.println(" ");
                    }  
            }
            static void ends()
            {
               for (int i = 1; i <= 4; i++) 
                    {
                        for (int j = 1; j <= 5; j++) 
                        {
                            if((i==1 && j==5) || 
                                    (i==2 && j==5)|| 
                                    (i==3 && j==5) || (i==4 && j==1) ||
                                    (i==4 && j==2) ||
                                    (i==4 && j==3) || (i==4 && j==4))   

                                System.out.print("*");

                            else
                                System.out.print(" ");
                        }

                    System.out.println(" ");
                    }   
            }
            static void iupper()
            {
                for (int i = 1; i < 2; i++) 
        {
            for (int j = 1; j <= 5; j++) 
            {
                if((i==1 && j==1) || (i==1 && j==2)|| (i==1 && j==3) || (i==1 && j==4) || (i==1 && j==5))   
                
                    System.out.print("*");
                 
                else
                    System.out.print(" ");
            }
        System.out.println(" ");
        } 
               
            }
            static void i()
             {
                 for (int i = 1; i < 4; i++) 
        {
            for (int j = 1; j <= 5; j++) 
            {
                if((i==1) && (j==3) || (i==2 && j==3)|| (i==3 && j==3))    
                
                    System.out.print("*");
                 
                else
                    System.out.print(" ");
            }
        
        System.out.println(" ");
        }  
             }

                    static void tcaps()
            {
               for (int i = 1; i <= 2; i++) 
                    {
                        for (int j = 1; j <= 5; j++) 
                        {
                            if((i==1 && j==1) || (i==1 && j==2)|| (i==1 && j==3) || (i==1 && j==4) || (i==1 && j==5) || (i==2 && j==3))   
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                    System.out.println(" ");
                    } 
            }
          
        static void lcaps()
        {
        for (int i = 1; i < 8; i++) 
        {
          for (int j = 1; j <= 5; j++) 
          {
              if((i==1 && j==1) || (i==2 && j==1)|| (i==3 && j==1) || (i==4 && j==1) || (i==5 && j==1) || (i==6 && j==1) ||(i==7 && j==1) )   

                  System.out.print("*");

              else
                  System.out.print(" ");
          }

        System.out.println(" ");
        } 
        }

        static void mid_3()
        {
           for (int i = 1; i <= 4; i++) 
                {
                    for (int j = 1; j <= 5; j++) 
                    {
                        if((i==1 && j==1) || (i==1 && j==2)|| (i==1 && j==3) || (i==1 && j==4)
                           || (i==2 && j==5)|| (i==3 && j==5) || (i==4 && j==5))
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                System.out.println(" ");
                } 
        }
        static void mid_5()
        {
           for (int i = 1; i <= 2; i++) 
                {
                    for (int j = 1; j <= 5; j++) 
                    {
                        if((i==1 && j==1) || (i==2 && j==1))
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }

                System.out.println(" ");
                } 
        }
        static void mid_2()
        {
           for (int i = 1; i < 2; i++) 
                {
                    for (int j = 1; j <= 3; j++) 
                    {
                        if((i==1 && j==1) || (i==1 && j==3))   

                            System.out.print("*");

                        else
                            System.out.print(" ");
                    }

                System.out.println(" ");
                } 
        }
        static void upper_1()
        {
           for (int i = 1; i <= 3; i++) 
                {
                    for (int j = 1; j <= 3; j++) 
                    {
                        if((i==1 && j==3)|| (i==3 && j==1) || (i==2 && j==2) || (i==3 && j==3))   

                            System.out.print("*");

                        else
                            System.out.print(" ");
                    }

                System.out.println(" ");
                } 

        }

        static void slant_line()
        {
           for (int i = 1; i <=6; i++) 
                {
                    for (int j = 1; j <= 5; j++) 
                    {
                        if((i==1 && j==5) || (i==2 && j==5) || (i==3 && j==4) || (i==4 && j==3)||(i==5 && j==2)||(i==6 && j==1))   

                            System.out.print("*");

                        else
                            System.out.print(" ");
                    }
                System.out.println(" ");
                } 
        }

        static void slant_line_z()
        {
           for (int i = 1; i < 4; i++) 
                {
                    for (int j = 1; j <= 5; j++) 
                    {
                        if((i==1 && j==5) || (i==2 && j==4) || (i==3 && j==3) )   

                            System.out.print("*");

                        else
                            System.out.print(" ");
                    }

                System.out.println(" ");
                } 
        }
         static void small_f_mid()
         {
             for (int i = 1; i <= 3; i++) 
            {
            for (int j = 1; j <= 5; j++) 
            {
                if((i==1 && j==1)||(i==1 && j==2)||(i==1 && j==3)||(i==1 && j==4)
                        ||(i==2 && j==1)||(i==3 && j==1))
                System.out.print("*");
                else
                    System.out.print(" ");
                }
             System.out.println(" ");
            }
         }
         static void k_r_2()
         {
         for(int i=1;i<=4; i++)
         {
             for(int j=1;j<=5;j++)
             {
                 if((i==1 && j==1) || (i==1 && j==2)||
                         (i==2 && j==1)||(i==2 && j==3)||
                         (i==3 & j==1)|| (i==3 && j==4)||
                         (i==4 && j==1) ||(i==4 && j==5))
                 System.out.print("*");
                 else
                     System.out.print(" ");
             }
             System.out.println("");
         }
         }
          static void small_a1()
         {
              for (int i = 1; i <= 2; i++) 
        {
            for (int j = 1; j <= 5; j++) 
            {
                if( (i==1 && j==4)|| (i==2) && (j==1)|| 
                        (i==2) && (j==2) || (i==2 && j==3)||
                        (i==2 && j==4))
                
                    System.out.print("*");
    
                else
                    System.out.print(" ");   
            }
        System.out.println(" ");
         }
         }
          static void part_vw()
         {
            for(int i = 1; i<=2;i++)
            {
          for(int j=1;j<=5;j++)
          {
               if((i==1 && j==1)||(i==1 && j==5)||
                  (i==2 && j==1)||(i==2 && j==5))
               {
             System.out.print("*");
          }
               else
                  System.out.print(" ");
              }
          System.out.println(" "); 
          } 
         }
         static void part_49()
         {
         for(int i=1;i<=4; i++)
         {
             for(int j=1;j<=5;j++)
             {
                 if((i==1 && j==5)|| 
                         (i==2 && j==5)||
                         (i==3 & j==5)|| 
                         (i==4 && j==5))
                 System.out.print("*");
                 else
                     System.out.print(" ");
             }
             System.out.println("");
         }   }
         
          static void small_e_mid()
         {
             for (int i = 1; i <= 2; i++) 
        {
            for (int j = 1; j <= 5; j++) 
            {
                if( (i==1) && (j==2) || 
                        (i==2) && (j==2) || (i==2 && j==3)|| (i==2 && j==4)|| (i==2) && (j==5))
                
                    System.out.print(" ");
    
                else
                    System.out.print("*");
             }
        System.out.println(" ");
        } 
         }
          
       static void part_6()
       {
         for (int i = 1; i <= 6; i++) 
        {
            for (int j = 1; j <= 5; j++) 
            {
                if( (i==1) && (j==1) || 
                        (i==2) && (j==1) || 
                        (i==3) && (j==1)||(i==3 && j==2)|| (i==3 && j==3)|| (i==3 && j==4)||(i==3 && j==5)||
                        (i==4) && (j==1)||(i==4 && j==5)||
                        (i==5) && (j==1)||(i==5 && j==5)||
                        (i==6) && (j==1)||(i==6 && j==5))
                
                    System.out.print("*");
    
                else
                    System.out.print(" ");
             }
        System.out.println(" ");
        }
       }
       static void mids()
          {
              for(int i=1;i<=3; i++)
         {
             for(int j=1;j<=5;j++)
             {
                 if((i==1 && j==1) || (i==2 && j==2)||
                         (i==2 && j==3)||(i==2 && j==4)||
                         (i==2 & j==5)|| (i==3 && j==5))
                         
                 System.out.print("*");
                 else
                     System.out.print(" ");
             }
             System.out.println("");
         }
          }
}
