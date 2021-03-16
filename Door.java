
/**
Door interface with basic door functions
*/
public interface Door
{
  /**
  @description: returns a string descrip of door
  @param none
  @return String value of door
  */
  String examine();

  /**
  @description: returns a list of options user can do to unlock door
  @param none
  @return String menu of options
  */
  String menu();

  /**
  @description: returns max value of the above menu
  @param none
  @return int max value
  */
  int getMenuMax();

  /**
  @description: – passes in the user’s menu selection and performs the action associated with that choice in the attempt to open the door. Returns text related to the user’s action.
  @param int option from user
  @return return text related to choice
  */
  String unlocking( int option );

  /**
  @description: tests to see if door if unlocked return true if it is
  @param none
  @return true if door is open
  */
  boolean open();

  /**
  @description: returns hint to help user unlock the door if they failed at unlocking it
  @param none
  @return return hints
  */
  String clue();

  /**
  @description: returns the success method for when the user unlocks the door
  @param none
  @return win statement
  */
  String success();

}
