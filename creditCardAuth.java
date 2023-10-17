import java.util.Scanner;

//Adding the odd numbers from right to left with the numbers with double the even numbers should give a number that is divisible
//by 10 (Lunh's Algorithm)
//This program does not check if the credit card number is valid within a certain bank
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the credit card number to be validated: ");
        String cardNum = input.nextLine();
        if (cardNum.length() >=13 && cardNum.length() <=16)
            {
                int sum = 0;
                String number = cardNum;
                for (int i = number.length() - 1; i <= 0; i--)
                {
                    if (i % 2 == 0)
                    {
                        int doubled = Integer.parseInt(number.substring(i, i+1)) * 2;
                        if (doubled/10 >= 1)
                        {
                            doubled = doubled % 10;
                        }
                        sum += doubled;

                    }
                    else
                    {
                        sum += Integer.parseInt(number.substring(i, i+1));
                    }
                }
                if (sum % 10 == 0)
                {
                    System.out.println("The number is valid.");
                }
                else
                {
                    System.out.println("The number is not valid.");
                }
            }
        else
        {
            System.out.println("The number is not valid.");
        }
    }
}
