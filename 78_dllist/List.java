/***
 * interface List
 * subset of actual Java List interface
 * Specifies actions a List must be able to perform.
<<<<<<< HEAD
 *
 * If placed in current working dir, will be consulted instead of
 *  built-in Java library interface.
 *
 * new in version 2.0: 
 * REMOVE-AT-INDEX
 * ADD-AT-INDEX
=======
 * 
 * If placed in current working dir, will be consulted instead of
 *  built-in Java library interface.
>>>>>>> 4f6b1f3dc40fadfcbc683ef4663648020391beb4
 **/

public interface List
{
  //add node to list, containing input String as its data
  public boolean add( String x );

<<<<<<< HEAD
  //insert at specified index
  public void add( int index, String newVal );

=======
>>>>>>> 4f6b1f3dc40fadfcbc683ef4663648020391beb4
  //remove node from list, return its data
  public String remove( int index );

  //return data in element at position i
  public String get( int i );

  //overwrite data in element at position i
  public String set( int i, String x );

  //return length of list
  public int size();

<<<<<<< HEAD
}//end interface
=======
}//end interface
>>>>>>> 4f6b1f3dc40fadfcbc683ef4663648020391beb4
