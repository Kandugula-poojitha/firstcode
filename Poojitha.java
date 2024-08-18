//printing values divisible by 3 and 5 but not by 15 in between o to 100.


class Poojitha 
{
public static void main(String args[])
{
//for loop-used to iterate over the array of numbers from initialized number to end of the array.

for (int i = 0; i <= 100; i++)
{
//if condition-used to check the condition that execute the satisfied output to console

if((i % 3 == 0 || i % 5 == 0) && i % 15 != 0)
{
System.out.println(i);
}
}
}
}