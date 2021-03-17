
 /**
  LockedDoor is a subclass of the Door interface
  */
class LockedDoor implements Door
{
  //field for keyLocation
  int keyLocation;
  //user's input based on which key they chose
  int searchOption;

  //constructor for basic door
  public LockedDoor()
  {
    keyLocation = (int)(Math.random() * 4) + 1;
  }

  /**
  @description: returns a string descrip of door
  @param none
  @return String value of door
  */
  @Override
  public String examine()
  {
    return "You find a door that can be opened with a key. Look around to see if you can find it.";
  }

  /**
  @description: returns a list of options user can do to unlock door
  @param none
  @return String menu of options
  */
  @Override
  public String menu()
  {
    return "1. Look under mat\n2. Look under the flower pot\n3. Look in flower pot soil\n4. Look under the fake rock";
  }

  /**
  @description: returns max value of the above menu
  @param none
  @return int max value
  */
  @Override
  public int getMenuMax()
  {
    return 4;
  }

  /**
  @description: – passes in the user’s menu selection and performs the action associated with that choice in the attempt to open the door. Returns text related to the user’s action.
  @param int option from user
  @return return text related to choice
  */
  @Override
  public String unlocking( int option )
    {
        searchOption = option;
        if ( searchOption == 1 )
        {
            return"You look under the mat.";

        }
        else if ( searchOption == 2 )
        {
            return "You look under the flower pot.";
        }
        else if ( searchOption == 3 )
        {
            return "You dig into the flower pot soil.";
        }
        else
        {
            return "You look under the fake rock.";
        }
    }

  /**
  @description: tests to see if door if unlocked return true if it is
  @param none
  @return true if door is open
  */
  @Override
  public boolean open()
  {
    if ( searchOption == keyLocation )
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
    return "You found nothing. Look somewhere else.";
  }

  /**
  @description: returns the success method for when the user unlocks the door
  @param none
  @return win statement
  */
  @Override
  public String success()
  {
    return "You found the key and unlocked the door.\n";
  }
}
