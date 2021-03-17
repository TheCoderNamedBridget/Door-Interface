
/**
A class that implements door with different function definitions 
*/
class CodeDoor implements Door
{
  //field for keys
  char[] keys = new char[3];
  //field for code
  char[] code = new char[3];

  //constructor for basic door
  CodeDoor ()
  {
    char key1 = 'X';
    char key2 = 'X';
    char key3 = 'O';

    for ( int i = 0; i < 3; i++ )
    {
      int whichKey = (int)(Math.random()*3);
      if (whichKey == 0) 
      {
        keys[i] = key1;
      }
      else if (whichKey == 1)
      {
        keys[i] = key2;
      }
      else if (whichKey == 2)
      {
        keys[i] = key3;
      }
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
    return "You encounter a code door. You need to guess the keys to unlock it";
  }

  /**
  @description: returns a list of options user can do to unlock door
  @param none
  @return String menu of options
  */
  @Override
  public String menu()
  {
    return "1. Press Key 1 \n2. Press Key 2 \n3. Press key 3";
  }

  /**
  @description: returns max value of the above menu
  @param none
  @return int max value
  */
  @Override
  public int getMenuMax()
  {
    return 3;
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
          for ( int i = 0; i < 3; i ++ )
          {
            if ( code[i] != keys[i] && keys[i] == 'X' || code[i] != 'X' && code[i] != 'O' )
            {
              code[i] = 'X';
              break;
            }
          }
          return "You press the first key";
        }
        else if ( option == 2 )
        {
          for ( int i = 0; i < 3; i ++ )
          {
            if ( code[i] != keys[i] && keys[i] == 'X' || code[i] != 'X' && code[i] != 'O' )
            {
              code[i] = 'X';
              break;
            }
          }
          return "You press the second key";
        }
        for ( int i = 0; i < 3; i ++ )
        {
          if ( code[i] != keys[i] && keys[i] == 'O' || code[i] != 'X' && code[i] != 'O' )
          {
            code[i] = 'O';
            break;
          }
        }
        return "You press the third key";    
    }

  /**
  @description: tests to see if door if unlocked return true if it is
  @param none
  @return true if door is open
  */
  @Override
  public boolean open()
  {
    for ( int i = 0; i < 3; i ++ )
    {
      if ( keys[i] != code[i] )
      {
        return false;
      }
    }
    return true;
  }

  /**
  @description: returns hint to help user unlock the door if they failed at unlocking it
  @param none
  @return return hints
  */
  @Override
  public String clue()
  {
    int numCorrect = 0;
    for ( int i = 0; i < 3; i ++ )
    {
      if ( keys[i] == code[i] )
      {
        numCorrect++;
      }
    }
    return "You have " + numCorrect +" keys correct";
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
