/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;
import java.util.Scanner;
 class Account
{
    int balance;//data member
    
    //constructors
    
    Account()
    {
        balance=50000;
    }//default constructor
    
        Account(int a)
    {
        balance=a;
    }//parameterize constructor
    
        
    //functions
        
        public void credit()
        {
            int sum,new_balance;
            
            //to input ammount from user
            Scanner add=new Scanner(System.in);
            System.out.println("Enter Ammount To Add : ");
            sum=add.nextInt();
            
            //for credit
            new_balance = sum+ balance;
            System.out.println("Your new balance is : "+ new_balance);
            
        }//credit
        
        public void debit()
        {
            int withdraw,wd;
           
             //to input ammount from user
            Scanner s=new Scanner(System.in);
            System.out.println("Enter Ammount To Add : ");
            wd=s.nextInt();
            
            
            //to cheack whether the entered value is valid or not
            //using conditional loop
            if(wd<=balance)
            {
                
            //for withdraw
            withdraw = wd+ balance;
            System.out.println("Your remaining balance is : "+ withdraw);
            
            
            }//if
    
            else
            {
            
                System.out.println("Invalid Ammount :");
                System.out.println("Your current balance is : "+ balance);
                
            }//else    
        }//debit
}//account
class SavingAccount extends Account
{
    float Ir;//interest rate
    
    //constructors
    
    SavingAccount()
    {
      super.balance=50000;
      
      Ir = 6;
              
    }//default constructor
    
    SavingAccount(int a,float r)
    {
        super (a);
        Ir=r;
    }//parameterize constructor
    
    
    //fuction
    
    public void calculateInterest()
    {
        float pri,tp, interest;
    Scanner values =new Scanner(System.in);
    
    System.out.println("Enter The Principal : ");
    pri=values.nextInt();
    
    System.out.println("Enter The Time Period : ");
    tp=values.nextInt();
    
    //calculat interest
    interest=(pri*Ir*tp)/100;

    System.out.println("Your Interest Is : " + interest );
    
    }
    
}

class CheckingAccount extends Account
{
    //TOTAL FEE PAID/OF TRANSCTIN
    int Tfee;
    float chckin;
    
    //constructors
    
    CheckingAccount()
    {
      super.balance=50000;
      
      Tfee= 200;
              
    }//default constructor
    
    CheckingAccount(int x,int f)
    {
        super (x);
        Tfee= f ;
    }//parameterize constructor
     
    //functions
    
    public void transaction_fee()
    {
        int paidFee,num;
        Scanner chck =new Scanner(System.in);
    
    System.out.println("Enter The total fee paid : ");
    paidFee=chck.nextInt();
    
    System.out.println("Enter The Number of Transactions: ");
    num=chck.nextInt();
     
    //calculate total fee per trasaction
    chckin=paidFee/num;
    System.out.println("Fee Charged Per Transaction : "+chckin);
    
    
    }//transaction_fee
    
    public void remaining()
    {       float rem;
            float withdraw;
            credit();
        {
            int sum,new_balance;
            
            //to input ammount from user
            Scanner add=new Scanner(System.in);
            System.out.println("Enter Ammount To Add : ");
            sum=add.nextInt();
            
            //for credit
            new_balance = sum+ balance;
        
            rem= new_balance-chckin;
            System.out.println("Your remaing balance after checking is : "+ rem );
        }//credit
        
        
        debit();
        {
            int wd;
            
            
             //to input ammount from user
            Scanner s=new Scanner(System.in);
            System.out.println("Enter Ammount To Add : ");
            wd=s.nextInt();
            
            
            //to cheack whether the entered value is valid or not
            //using conditional loop
            if(wd<=balance)
            {
                
            //for withdraw
            withdraw = wd+ balance;
               rem= withdraw-chckin;
            System.out.println("Your remaing balance after checking is : "+ rem );
            
            
            }//if
    
            else
            {
            
                System.out.println("Invalid Ammount :");
                System.out.println("Your current balance is : "+ balance);
                
            }//else
            
            
        }//debit
    }//remaing
    
    
    
}//checkingAccount
public class Banking {

   //main class
    public static void main(String[] args) 
    { int ch;
        //title
        
        System.out.println("******************************************************");
        System.out.println("*****************BANK MANAGEMENT SYSTEM***************");
        System.out.println("******************************************************");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        Scanner h = new Scanner(System.in);
        System.out.println("To Enter Your Choice Press :");
        System.out.println("1- To Add Ammount : ");
        System.out.println("2- To Withdraw Ammount : ");
        System.out.println("3- To Check Interest :");
        System.out.println("4- To Check Fee Charged Per Transaction : ");
        System.out.println("5- To Check Your Remaining Ammount ");
        ch=h.nextInt();
        //to input users choice
    if(ch==1)
    {
             Account sk1 =new Account (50000);
             sk1.credit();
    }
    else if(ch==2)
    {
        Account sk =new Account (70000);
            sk.debit();
    }
    else if(ch==3)
    {
             SavingAccount y1 =new SavingAccount(20000,6);
             y1.calculateInterest();
    }
    else if(ch==4)
    {
            CheckingAccount z1= new CheckingAccount();
            z1.transaction_fee();
    }
    else if(ch==5)
    {
             CheckingAccount z= new CheckingAccount();
             z.remaining();
    }
    else
    {
             //default constructors called 
              Account skk =new Account (20000);
              skk.credit();
              skk.debit();
              //base clase
              SavingAccount y =new SavingAccount();
              y.calculateInterest();
              //saving class
             
             CheckingAccount zz= new CheckingAccount();
             zz.transaction_fee();
             zz.remaining();
             //checking class
            
    }//else
    

            
    }//main
    
}//banking
