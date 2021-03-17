public class ComboDoor implements Door
{
  private int comboValue;
  private int guess;

  ComboDoor()
  {
    comboValue = (int)(Math.random() * 10) + 1;
  }


  @Override
  public String examine()
  {
    return "You encounter a door with a combination lock. You can spin the dial to a number 1-10.";
  }

  @Override
  public String menu()
  {
    return "Enter a number(1-10): ";
  }


  @Override
  public int getMenuMax()
  {
    return 10;
  }


  @Override
  public String unlocking( int option )
  {
    guess = option; 
    return "You turn the dial to ... " + guess;
  }


  @Override
  public boolean open()
  {
    if (guess == comboValue)
    {
      return true;
    }
    return false;
  }


  @Override
  public String clue()
  {
    if (guess > comboValue)
    {
      return "You feel resistance as you turn the dial, it must be lower.";
      }
    return "You feel no resistance or click, it must be higher";
  }


  @Override
  public String success()
  {
    return "You found the right value and opened the door.\n";
  }
}
