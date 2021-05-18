package Module;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String dun = "haryagni123@gmail.com";
        String dpw = "GarvitKePapa";
        String eg1= "userID matched";
        String eg2= "Password Matched";
        String eg3 = "Invalid username";
        String eg4 ="Invalid Password";
        String uc="";
        String pc="";
        System.out.println("Enter User ID");
        Scanner un = new Scanner(System.in);
        String str1 = un.nextLine();
        System.out.println("Enter Password");
        Scanner pw = new Scanner(System.in);
        String str2 = pw.nextLine();
        int ln1 = dun.length();
        int ln2= dpw.length();
        int ln3 = str1.length();
        int ln4 = str2.length();
        int y =1;
        if(ln1==ln3){
            char ch1= dun.charAt(0);
            char ch2 = str1.charAt(0);
            int con1=ch1, con2=ch2;
            if(con1==con2){
                for (int x =1;x<ln1;x++){
                    ch1= dun.charAt(x);
                    ch2= str1.charAt(x);
                    if(ch1==ch2){
                        y++;
                    }
                }

            }
        }
        if (y==ln1){
            uc=eg1;
        }
        else if (y!=ln1){
            uc=eg3;
        }
        int z =1;
        if(ln2==ln4){
            char ch3=dpw.charAt(0);
            char ch4=str2.charAt(0);
            int con3=ch3, con4=ch4;
            if(con3==con4){
                for (int p =1;p<ln2;p++){
                    ch3=dpw.charAt(p);
                    ch4=str2.charAt(p);
                    if(ch3==ch4){
                        z++;
                    }

                }
            }
        }
        if (z==ln2){
            pc=eg2;
        }
        else if (z!=ln2){
            pc=eg4;
        }
        if(uc==eg1){
            if(pc==eg2){
                System.out.println("Username and Password Matched");
            }
            else if (pc== eg4){
                System.out.println("Invalid Password");
            }

        }
        else if (uc==eg3){
            if (pc==eg2){
                System.out.println("Invalid Username");
            }
            else if (pc==eg4){
                System.out.println("Invalid Uername and Password");
            }
        }




    }




}
