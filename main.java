
/**
Names: Bridget Naylor, David P
Date: 3/15/2021
Lab 8 Interface
*/
import java.util.Scanner;
class Main {

  /**
  @description: passes in the door the user will try to unlock. It should call
examine, then menu, get the user’s input, and pass the input to the unlock method to
try to open the door, if it was successful, it calls success, otherwise, it calls clue and
repeats from the menu until the user successfully opens the door.
  @param th door that has been chosen
  @return none
  */
  public static void openDoor(Door d)
  {
    boolean isOpen = false;
    int input;
    System.out.println(d.examine());
        
    while (isOpen == false)
    {
      System.out.println(d.menu());
      input = getIntRange(1, d.getMenuMax());
      System.out.println(d.unlocking(input));
      if (d.open() == true) 
      {
        System.out.println(d.success());
        isOpen = true;
      }
      else
      {
        System.out.println(d.clue());
      }
    }
  }

    /**
  @description: gets the user's input in a range depending on which door was picked
  @param the min and max for this particular door
  @return user's choice
  */
  static int getIntRange( int min, int max )
  {
    Scanner in = new Scanner( System.in );
		int input = 0;
		boolean valid = false;
		while( !valid ) {
			if( in.hasNextInt() ) {
				input = in.nextInt();
				if( input <= max && input >= min ) {
					valid = true;
				} else {
					System.out.println( "Invalid Range." );
				}
			} else {
				in.next(); //clear invalid string
				System.out.println( "Invalid Input." );
			}
		}
		return input;
  }

  public static void main(String[] args) {
        
        Door door = new BasicDoor();
        int randomNumber;
        System.out.println("Welcome to the Escape Room. You must unlock 3 doors to escape...");
        
        for (int doorsOpened = 0; doorsOpened < 3; doorsOpened++){

            randomNumber = (int)(Math.random() * 5);
randomNumber = 4;
            if (randomNumber == 0)
            {
              door = new BasicDoor();
            }
            else if (randomNumber == 1)
            {
              door = new LockedDoor();
            }
            else if ( randomNumber == 2 )
            {
              door = new ComboDoor();
            }   
            else if ( randomNumber == 3 )
            {
              door = new DeadboltDoor();
            }  
            else if ( randomNumber == 4 )
            {
              door = new CodeDoor();
            }       
            openDoor(door);
        }

        System.out.println("Congratulations! You escaped... this time.");

    }
}
