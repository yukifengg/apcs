/**
 * class BST
 * v2:partial
 * SKELETON
 * Implementation of the BINARY SEARCH TREE abstract data type (ADT)
 *
 * A BST maintains the invariant that, for any node N with value V,
 * L<V && V<R, where L and R are node values in N's left and right
 * subtrees, respectively.
 * (Any value in a node's left subtree must be less than its value,
 *  and any value in its right subtree must be greater.)
 *
 * This BST implementation only holds ints (its nodes have int cargo)
 */

public class BST
{

  //instance variables / attributes of a BST:
  TreeNode _root;

  /**
   * default constructor
   */
  BST()
  {
    _root = null;
  }


  /**
   * void insert( int )
   * Adds a new data element to tree.
   */
  public void insert( int newVal )
  {
    TreeNode newNode = new TreeNode( newVal );

    if ( _root == null ) {
      _root = newNode;
      return;
    }
    insert( _root, newNode );
  }
  //recursive helper for insert(int)
  public void insert( TreeNode stRoot, TreeNode newNode )
  {
    if ( newNode.getValue() < stRoot.getValue() ) {
      //if no left child, make newNode the left child
      if ( stRoot.getLeft() == null )
        stRoot.setLeft( newNode );
      else //recurse down left subtree
        insert( stRoot.getLeft(), newNode );
      return;
    }
    else { // new val >= curr, so look down right subtree
      //if no right child, make newNode the right child
      if ( stRoot.getRight() == null )
        stRoot.setRight( newNode );
      else //recurse down right subtree
        insert( stRoot.getRight(), newNode );
      return;
    }
  }//end insert()

  /**
  * removes target and moves nodes accordingly
  preconditon: tree contains target node
  ALGO for removal:
  1. To remove a node and make sure its children are not abandoned,
  you must replace itself with the correct node. You do so by recursively going
  down the right subtree of this root node.
  2. You find the least value in the right subtree and store its value in an int,
  leastR. You then set the getRight of the parent of the node containing the
  smallest value to null, essentially getting rid of the kid. BUT DON'T FRET! We
  have the kid's value stored.
  3. You climb back up the tree recursively to the node you want to remove. You
  then set the getValue of this node to leastR, and you maintain the binary search
  ordiliness. Yass!
  */

  public void remove(int target) {
    TreeNode parent = _root;
    if (parent.getValue() == target) {
      remove(parent);
    }
    else if (search(target) != null) {
      remove(search(target));
    }
  } //end remove()

  //remove() recursive helper
  public void remove(TreeNode trashNode) {
    System.out.println("trashNode: " + trashNode.getValue());
    if (!isLeaf(trashNode)) {
      TreeNode leastR = trashNode.getRight();
      int leastRVal = leastR.getValue();
      trashNode.setValue(leastRVal);
      trashNode.setRight(null);
    }
    else {
      //finding parent
      // TreeNode currNode = new TreeNode(_root.getValue());
      // System.out.println(currNode.getRight().getValue());
      // if (_root.getLeft().getValue() != trashNode.getValue() ||
      //     _root.getRight().getValue() != trashNode.getValue())
      //     {
      //       _root.setValue(getLeft)
      //     }
      // while (_root.getRight().getValue() != trashNode.getValue()) {
      //   currNode = _root.getRight();
      // }
      // if (_root.getRight().getValue() == trashNode.getValue()) {
      //   currNode.setRight(null);
      // }
      TreeNode parentLooker = new TreeNode(_root.getValue());
      int parentVal = parentVal.getValue();
      if (_root.getValue() < trashNode.getValue()) { //start looking down rigth subtree
        parentLooker.setValue(_root);
      }
    }

  }

  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~v~~TRAVERSALS~~v~~~~~~~~~~~~~~~~~~~~~
  // each traversal should simply print to standard out
  // the nodes visited, in order

  //process root, recurse left, recurse right
  public void preOrderTrav()
  {
    preOrderTrav( _root );
  }
  public void preOrderTrav( TreeNode currNode )
  {
    if ( currNode == null )
      return;
    System.out.print( currNode.getValue() + " " );
    preOrderTrav( currNode.getLeft() );
    preOrderTrav( currNode.getRight() );
  }

  //recurse left, process root, recurse right
  public void inOrderTrav()
  {
    inOrderTrav( _root );
  }
  public void inOrderTrav( TreeNode currNode )
  {
    if ( currNode == null )
      return;
    inOrderTrav( currNode.getLeft() );
    System.out.print( currNode.getValue() + " " );
    inOrderTrav( currNode.getRight() );
  }

  //recurse left, recurse right, process root
  public void postOrderTrav()
  {
    postOrderTrav( _root );
  }
  public void postOrderTrav( TreeNode currNode )
  {
    if ( currNode == null )
      return;
    postOrderTrav( currNode.getLeft() );
    postOrderTrav( currNode.getRight() );
    System.out.print( currNode.getValue() + " "  );
  }

  public String inOrderTravStr( TreeNode currNode ) {
    String retStr = "";
    if ( currNode == null )
      return retStr;
    retStr += inOrderTravStr( currNode.getLeft() );
    retStr += " " + currNode.getValue();
    retStr += inOrderTravStr( currNode.getRight() );
    return retStr;
  }
  public String preOrderTravStr( TreeNode currNode ) {
    String retStr = "";
    if ( currNode == null )
      return retStr;
    retStr += " " + currNode.getValue();
    retStr += preOrderTravStr( currNode.getLeft() );
    retStr += preOrderTravStr( currNode.getRight() );
    return retStr;
  }
  public String postOrderTravStr( TreeNode currNode ) {
    String retStr = "";
    if ( currNode == null )
      return retStr;
    retStr += postOrderTravStr( currNode.getLeft() );
    retStr += postOrderTravStr( currNode.getRight() );
    retStr += " " + currNode.getValue();
    return retStr;
  }

  //~~~~~~~~~~~~~^~~TRAVERSALS~~^~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  //~~~~~~~~~~~~~v~~MISC.HELPERS~~v~~~~~~~~~~~~~~~~~~~
  public boolean isLeaf( TreeNode node )
  {
    return ( node.getLeft() == null
             &&
             node.getRight() == null );
  }
  //~~~~~~~~~~~~~^~~MISC.HELPERS~~^~~~~~~~~~~~~~~~~~~~


  //overridden toString
  public String toString()
  {
    return
      " pre-order trav:" + preOrderTravStr( _root ) + '\n' +
      "  in-order trav:" + inOrderTravStr( _root ) + '\n' +
      "post-order trav:" + postOrderTravStr( _root ) + '\n' +
      "         height: " + height() + '\n' +
      "     num leaves: " + numLeaves()
      ;
  }


  /**
   * TreeNode search(int)
   * returns pointer to node containing target,
   * or null if target not found
   */
  TreeNode search( int target )
  {
    return search( target, _root );
  }
  TreeNode search( int target, TreeNode currNode )
  {
    if ( currNode==null || currNode.getValue()==target )
      return currNode;
    else if ( target < currNode.getValue() )
      return search( target, currNode.getLeft() );
    else if ( target > currNode.getValue() )
      return search( target, currNode.getRight() );
    else
      return null; //to get past compiler
  }


  /**
   * int height()
   * returns height of this tree (length of longest leaf-to-root path)
   * eg: a 1-node tree has height 0
   */
  public int height()
  {
    return height( _root );
  }
  //recursive helper for height()
  public int height( TreeNode currNode )
  {
    if ( currNode==null ) //Q: Why cannot use .equals() ?
      return 0;
    if ( isLeaf(currNode) )
      return 0;
    else //height is 1 for this node + height of deepest subtree
      return 1 + Math.max( height(currNode.getLeft()),
                           height(currNode.getRight()) );
  }


  /**
   * int numLeaves()
   * returns number of leaves in tree
   */
  public int numLeaves()
  {
    return numLeaves( _root );
  }
  public int numLeaves( TreeNode currNode ) {
    int foo = 0;
    if ( currNode == null )
      return 0;
    foo += numLeaves( currNode.getLeft() );
    if ( isLeaf(currNode) )
      foo++;
    foo += numLeaves( currNode.getRight() );
    return foo;
  }



  //main method for testing
  public static void main( String[] args )
  {
    BST arbol = new BST();

    //PROTIP: sketch state of tree after each insertion
    //        ...BEFORE executing these.

    arbol.insert( 4 );
    arbol.insert( 2 );
    arbol.insert( 5 );
    arbol.insert( 6 );
    arbol.insert( 1 );
    arbol.insert( 3 );
    arbol.insert( 0 );

    System.out.println( "\n-----------------------------");
    System.out.println( "pre-order traversal:" );
    arbol.preOrderTrav();

    System.out.println( "\n-----------------------------");
    System.out.println( "in-order traversal:" );
    arbol.inOrderTrav();

    System.out.println( "\n-----------------------------");
    System.out.println( "post-order traversal:" );
    arbol.postOrderTrav();

    System.out.println( "\n-----------------------------");

    /**
       EXPECTED OUTPUT for traversals:
       -----------------------------
       pre-order traversal:
       4 2 1 3 5 6
       -----------------------------
       in-order traversal:
       1 2 3 4 5 6
       -----------------------------
       post-order traversal:
       1 3 2 6 5 4
       -----------------------------
    */


    System.out.println("h:\t" + arbol.height());
    System.out.println("nL:\t" + arbol.numLeaves());

    /*~~~~~~~~~~~~move~me~down~~~~~~~~~~~~~~~~~~~~~~
      System.out.println("s(1):\t" + arbol.search(1).getValue());
      System.out.println("s(2):\t" + arbol.search(2).getValue());
      System.out.println("s(3):\t" + arbol.search(3).getValue());
      System.out.println("s(4):\t" + arbol.search(4).getValue());
      System.out.println("s(5):\t" + arbol.search(5).getValue());
      System.out.println("s(6):\t" + arbol.search(6).getValue());
      //System.out.println("s(7):\t" + arbol.search(7).getValue());
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/



    //insering in this order will build a linked list to left
    /*
      arbol.insert( 6 );
      arbol.insert( 5 );
      arbol.insert( 3 );
      arbol.insert( 4 );
      arbol.insert( 2 );
      arbol.insert( 1 );
      arbol.insert( 0 );
    */

    System.out.println( "tree after insertions:\n" + arbol );
    System.out.println();

    System.out.println();
    for( int i=-1; i<8; i++ ) {
      System.out.println(" searching for "+i+": " + arbol.search(i) );
    }

    //removing test time

    System.out.println("AHHHHHHHHHHH");
    System.out.println( arbol );

  	arbol.remove(6);
  	System.out.println();
  	System.out.println( arbol );

  	arbol.remove(5);
  	System.out.println();
  	System.out.println( arbol );

  	arbol.remove(4);
  	System.out.println();
  	System.out.println( arbol );

  	arbol.remove(3);
  	System.out.println();
  	System.out.println( arbol );

  	arbol.remove(2);
  	System.out.println();
  	System.out.println( arbol );

  	arbol.remove(1);
  	System.out.println();
  	System.out.println( arbol );

  	arbol.remove(0);
  	System.out.println();
  	System.out.println( arbol );

    /*~~~~~~~~~~~~move~me~down~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/


  }

}//end class
