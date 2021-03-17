
/**
A class that implements door with different function definitions 
*/
class DeadboltDoor implements Door
{
  //field for bolt1
  boolean bolt1;
  //field for bolt2
  boolean bolt2;

  //constructor for basic door
  DeadboltDoor ()
  {
    int bolt11 = (int)(Math.random()*2);

    if ( bolt11 == 0 )
    {
      bolt1 = true;
    }
    else if ( bolt11 == 1 )
    {
      bolt1 = false;
    }
    bolt2 = !bolt1;
  }

  /**
  @description: returns a string descrip of door
  @param none
  @return String value of door
  */
  @Override
  public String examine()
  {
    return "You encounter a deadbolt door. You need to get both of the bolts unlocked";
  }

  /**
  @description: returns a list of options user can do to unlock door
  @param none
  @return String menu of options
  */
  @Override
  public String menu()
  {
    return "1. Toggle Bolt 1\n2. Toggle Bolt 2";
  }

  /**
  @description: returns max value of the above menu
  @param none
  @return int max value
  */
  @Override
  public int getMenuMax()
  {
    return 2;
  }

  /**
  @description: – passes in the user’s menu selection and performs the action associated with that choice in the attempt to open the door. Returns text related to the user’s action.
  @param int option from user
  @return return text related to choice
  */
  @Override
  public String unlocking( int option )
    {
        if ( option == 1 )
        {
          bolt1 = true;
          return "You toggle the first bolt";
        }
        bolt2 = true;
        return "You toggle the second bolt";    
    }

  /**
  @description: tests to see if door if unlocked return true if it is
  @param none
  @return true if door is open
  */
  @Override
  public boolean open()
  {
    if ( bolt1 == true && bolt2 == true )
    {
      return true;
    }
    return false;
  }

  /**
  @description: returns hint to help user unlock the door if they failed at unlocking it
  @param none
  @return return hints
  */
  @Override
  public String clue()
  {
    return "You jiggle the door, it's locked.";
  }

  /**
  @description: returns the success method for when the user unlocks the door
  @param none
  @return win statement
  */
  @Override
  public String success()
  {
    return "Congrats, you opened the door\n";
  }
}
