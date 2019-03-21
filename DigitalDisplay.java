/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitaldisplay;

import java.util.Scanner;

/**
 *
 * @author bodig
 */
public class DigitalDisplay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter letter or a digit: ");
       String a=sc.nextLine();
        char[] cc=a.toCharArray();
        
        if(cc.length==1) //As we are printing  one character pattern only 
        {
            for(int j=0;j<cc.length;j++)
            {
                switch (cc[j]) 
                {
                    case 'a':
                        SmallLetters.smalla();
                        break;
                    case 'b':
                        SmallLetters.smallb();
                        break;
                    case 'c':
                        SmallLetters.smallc();
                        break;
                    case 'd':
                        SmallLetters.smalld();
                        break;
                    case 'e':
                        SmallLetters.smalle();
                        break;
                    case 'f':
                        SmallLetters.smallf();
                        break;
                    case 'g':
                        SmallLetters.smallg();
                        break;
                    case 'h':
                        SmallLetters.smallh();
                        break;
                    case 'i':
                        SmallLetters.smalli();
                        break;
                    case 'j':
                        SmallLetters.smallj();
                        break;
                    case 'k':
                        SmallLetters.smallk();
                        break;
                    case 'l':
                        SmallLetters.smalll();
                        break;
                    case 'm':
                        SmallLetters.smallm();
                        break;
                    case 'n':
                        SmallLetters.smalln();
                        break;
                    case 'o':
                        SmallLetters.smallo();
                        break;
                    case 'p':
                        SmallLetters.smallp();
                        break;
                    case 'q':
                        SmallLetters.smallq();
                        break;
                    case 'r':
                        SmallLetters.smallr();
                        break;
                    case 's':
                        SmallLetters.smalls();
                        break;
                    case 't':
                        SmallLetters.smallt();
                        break;
                    case 'u':
                        SmallLetters.smallu();
                        break;
                    case 'v':
                        SmallLetters.smallv();
                        break;
                    case 'w':
                        SmallLetters.smallw();
                        break;
                    case 'x':
                        SmallLetters.smallx();
                        break;
                    case 'y':
                        SmallLetters.smally();
                        break;
                    case 'z':
                        SmallLetters.smallz();
                        break;
                    case 'A':
                        CapLetters.capa();
                        break;
                    case 'B':
                        CapLetters.capb();
                        break;
                    case 'C':
                        CapLetters.capc();
                        break;
                    case 'D':
                        CapLetters.capd();
                        break;
                    case 'E':
                        CapLetters.cape();
                        break;
                    case 'F':
                        CapLetters.capf();
                        break;
                    case 'G':
                        CapLetters.capg();
                        break;
                    case 'H':
                        CapLetters.caph();
                        break;
                    case 'I':
                        CapLetters.capi();
                        break;
                    case 'J':
                        CapLetters.capj();
                        break;
                    case 'K':
                        CapLetters.capk();
                        break;
                    case 'L':
                        CapLetters.capl();
                        break;
                    case 'M':
                        CapLetters.capm();
                        break;
                    case 'N':
                        CapLetters.capn();
                        break;
                    case 'O':
                        CapLetters.capo();
                        break;
                    case 'P':
                        CapLetters.capp();
                        break;
                    case 'Q':
                        CapLetters.capq();
                        break;
                    case 'R':
                        CapLetters.capr();
                        break;
                    case 'S':
                        CapLetters.caps();
                        break;
                    case 'T':
                        CapLetters.capt();
                        break;
                    case 'U':
                        CapLetters.capu();
                        break;
                    case 'V':
                        CapLetters.capv();
                        break;
                    case 'W':
                        CapLetters.capw();
                        break;
                    case 'X':
                        CapLetters.capx();
                        break;
                    case 'Y':
                        CapLetters.capy();
                        break;
                    case 'Z':
                        CapLetters.capz();
                        break;
                    case '1':
                        Numbers.one();
                        break;
                    case '2':
                        Numbers.two();
                        break;
                    case '3':
                        Numbers.three();
                        break;
                    case '4':
                        Numbers.four();
                        break;
                    case '5':
                        Numbers.five();
                        break;
                    case '6':
                        Numbers.six();
                        break;
                    case '7':
                        Numbers.seven();
                        break;
                    case '8':
                        Numbers.eight();
                        break;
                    case '9':
                        Numbers.nine();
                        break;
                    case '0':
                        Numbers.zero();
                        break;
                    default:
                        System.out.println(" Invalid Input");
                        break;
                 }
              System.out.print("");
        }}
        else
            System.out.println("Please Enter one Character only");    
    }}