/*
TNPG Chocolate Freds: Anjini Katari, Yuki Feng, Hamim Seam
APCS pd08
Lab09: Some Folks Call It Charades
2022-04-27
Time spent: 3.0 hrs
*/

/**
 * Celebrity base class for the Celebrity game.
 * @author cody.henrichsen
 * @version 1.4 17/09/2018
 */
public class Celebrity
{
	/**
	 * The clue to determine the celebrity
	 */
	public String _clue;

	/**
	 * The answer or name of the celebrity.
	 */
	public String _name;

	/**
	 * Creates a Celebrity instance with the supplied answer and clue
	 * @param answer
	 * @param clue
	 */
	public Celebrity(String answer, String clue)
	{
		_clue = clue;
		_name = answer;
	}

	/**
	 * Supplies the clue for the celebrity
	 * @return
	 */
	public String getClue()
	{
		System.out.println(_clue);
		return null;
	}

	/**
	 * Supplies the answer for the celebrity.
	 * @return
	 */
	public String getAnswer()
	{
		System.out.println(_name);
		return null;
	}

	/**
	 * Updates the clue to the provided String.
	 * @param clue The new clue.
	 */
	public void setClue(String clue)
	{
		_clue = clue;
	}

	/**
	 * Updates the answer to the provided String.
	 * @param answer The new answer.
	 */
	public void setAnswer(String answer)
	{
		_name = answer;
	}

	/**
	 * Provides a String representation of the Celebrity.
	 */
	@Override
	public String toString()
	{
		String s = "Name of the celeb: ";
		s += _name;
		return null;
	}

}
