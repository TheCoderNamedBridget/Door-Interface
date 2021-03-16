
/**
Names: Bridget Naylor, Forgot your name sorry partner
Date: 3/15/2021
Lab 8 Interface
*/
class Main {

  /**
  @description: passes in the door the user will try to unlock. It should call
examine, then menu, get the user’s input, and pass the input to the unlock method to
try to open the door, if it was successful, it calls success, otherwise, it calls clue and
repeats from the menu until the user successfully opens the door.
  @param th door that has been chosen
  @return none
  */
  static void openDoor( Door d )
  {
    System.out.println( d.open());
    while ( d.open() == false )
    {
      System.out.println(d.examine());
      System.out.println(d.menu());
      int userInput = CheckInput.getInt();
      System.out.println(d.unlocking( userInput ));
    }


  }

  static int getIntRange( int min, int max )
  {
    return min;
  }

  public static void main(String[] args) {
    BasicDoor door = new BasicDoor();
    openDoor( door );
  }
}
