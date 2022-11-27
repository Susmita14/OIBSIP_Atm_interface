import java.util.Scanner;

public class AtmInterface
{
	public static void main(String[] args) 
	{

		int ch, pinNo=0, k;
		long amount=0,deposit=0,withdraw=0;
		Scanner s = new Scanner(System.in);
        int ID=4001;
		String Transactionhistory="";
		System.out.println("\nWelcome to Atm service \n");
		 do{
		 	System.out.println("Enter your ID : ");
			ID = s.nextInt();
		

			System.out.println("Enter your pin : ");
			pinNo = s.nextInt();
			

			if(ID != 4001&& pinNo!=1020)
				System.out.println("Please Enter correct username or password");
		 }

		while(ID != 4001 || pinNo!=1020);
		
		do
		{
            System.out.println("\n\n**********************************");
			System.out.println("\n # ATM SERVICE #\n");
			System.out.println("1. Trasction History");
			System.out.println("2. Deposit ");
			System.out.println("3. Withdraw");
			System.out.println("4. Transfer");
			System.out.println("5. Quit");
            System.out.println("***********************************");

			System.out.println("\n\nEnter your choice : ");
			 ch = s.nextInt();

			switch(ch)
			{
				
				
				case 1:
                    System.out.println("*********************");
					System.out.println("trasction history "+Transactionhistory);
                    System.out.println("*********************");
					break;

				case 2:
                    
     				System.out.println("\nEnter the amount to Deposit ");
					int c = s.nextInt();
					amount = amount + c;
                    System.out.println("*********************");
					System.out.println("Your balance is: "+amount);
                    System.out.println("*********************");
                    break;

				case 3:
					
					
                    
                    System.out.println("\nEnter the amount to withdraw");
					int b = s.nextInt();
                  
					if(b % 100 != 0)
					{
						System.out.println("\nPlease Enter the amount in multiple of 100 ");
					}
					else if(b > (amount - 500))
					{
						System.out.println("\n Not sufficent Balance not available for the withdraw");
					}
					else
					{
						amount = amount - b;
                        System.out.println("*********************");
						System.out.println("\n\nPlease receive cash");
						System.out.println("Your current balance is "+amount);
					}
                    System.out.println("*******************************");
					break;
                     

				case 4:
                   
					System.out.println("Transfer");
					{
						Scanner sc = new Scanner(System.in);
		                System.out.print("\nEnter the Receipent's Name : ");
		                String receipent = sc.nextLine();
		                System.out.print("\nEnter the amount you wish to transfer : ");
		                float amount1 = sc.nextFloat();
		
	           	try {
			           if ( amount >= amount1 ) {
				           if ( amount1 <= 50000f ) {
					//transaction++;
				           	amount -= amount1;
				           	System.out.println("\nSuccessfully Transfered to " + receipent);
					        String str = amount1 + " Rs transfered to " + receipent + "\n";
					        Transactionhistory = Transactionhistory.concat(str);
				}
				else {
					System.out.println("\ninvalid transfer..Limit is 50000.00 only");
				}
			}
			else {
				System.out.println("\n Not sufficient Balance");
			}
		}
		catch ( Exception e) {
		}
					}
                    System.out.println("*********************");
				case 5:
                      System.out.println("\n\n********************************");
					System.out.println("Thank you for using our services!");
                      System.out.println("********************************");

					break;


				default:
					System.out.println("Invalid choice");

			}


			
		}while(ch!=5);
	}
}