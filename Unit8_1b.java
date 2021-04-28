//Unit 8 Lab Question 1
//Johnathan Mitri
public class Unit8_1b
{
  public int [] [] modifyRows (int [] [] array)
  { 
    for (int i = 0; i < array.length - 1; i+=2)
    {
      array[i+1] = array[i];
    }
    return array;
  }
}
 