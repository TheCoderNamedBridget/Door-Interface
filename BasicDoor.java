
/**
A class that implements door with different function definitions 
*/
class BasicDoor implements Door
{
  //field for push
  boolean push;
  //user's input based on whether they pushed or pulled
  boolean input;

  //constructor for basic door
  BasicDoor ()
  {
    int pushPull = (int)(Math.random()*2);

    if ( pushPull == 0 )
    {
      push = true;
    }
    else if ( pushPull == 1 )
    {
      push = false;
    }
  }

  /**
  @description: returns a string descrip of door
  @param none
  @return String value of door
  */
  @Override
  public String examine()
  {
    return "You encounter a basic door. You can either push or pull it to open";
  }

  /**
  @description: returns a list of options user can do to unlock door
  @param none
  @return String menu of options
  */
  @Override
  public String menu()
  {
    return "1. Push\n2. Pull";
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
            input = true;
            return "You push the door";
        }
        input = false;
        return "You pull the door";    
    }

  /**
  @description: tests to see if door if unlocked return true if it is
  @param none
  @return true if door is open
  */
  @Override
  public boolean open()
  {
    if ( push == input )
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
    return "The door did not open. Try the other way.";
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
