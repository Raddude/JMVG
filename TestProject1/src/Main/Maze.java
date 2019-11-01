package Main;

/* 	CLASS DEFINITION: This class stores the maze array and has methods relating to behavior of the player within the maze.
 */

public class Maze {
	
	private static int[][] maze = 
		{
				{1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1},
				{1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1},
				{1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1},
				{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
				{1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1},
				{1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1},
				{1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1},
				{1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1},
				{1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1},
				{1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1},
				{1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1}
		};
	
	private static int currentX = 0;
	private static int currentY = 0;
	
	
	
	
	
	//Returns a boolean based on whether the current position can move left
	public static boolean canMoveLeft()
	{
		if (currentX == 0)
		{
			return false;
		}
		
		else if (maze[currentY][currentX-1] == 1)
		{
			return false;
		}

		return true;
	}

	//Returns a boolean based on whether the current position can move right
	public static boolean canMoveRight()
	{
		if (currentX == maze[0].length-1)
		{
			return false;
		}
		
		else if (maze[currentY][currentX+1] == 1)
		{
			return false;
		}
		
		return true;
	}

	//Returns a boolean based on whether the current position can move down
	public static boolean canMoveDown()
	{
		if (currentY == maze[0].length-1)
		{
			return false;
		}
		
		else if (maze[currentY-1][currentX] == 1)
		{
			return false;
		}
		
		return true;
	}

	//Returns a boolean based on whether the current position can move up
	public static boolean canMoveUp()
	{
		if (currentY == 0)
		{
			return false;
		}
		
		else if (maze[currentY+1][currentX] == 1)
		{
			return false;
		}
		
		return true;
	}
	

	
	
	
	/*
	 * Uses the above functions to move in the appropriate direction if possible. Also returns a boolean for whether or not it was completed.
	 */
	public static boolean moveLeftIfPossible()
	{
		if (canMoveLeft())
		{
			currentX -= 1;
			return true;
		}
		
		return false;
	}

	public static boolean moveRightIfPossible()
	{
		if (canMoveRight())
		{
			currentX += 1;
			return true;
		}
		
		return false;
	}

	public static boolean moveDownIfPossible()
	{
		if (canMoveDown())
		{
			currentY -= 1;
			return true;
		}
		
		return false;
	}

	public static boolean moveUpIfPossible()
	{
		if (canMoveUp())
		{
			currentY += 1;
			return true;
		}
		
		return false;
	}
	
	
	
	
	
	//Returns the maze variable as a 2-D integer array formatted like the variable above.
	public static int[][] returnMaze()
	{
		return maze;
	}
	
	
	
	//Returns the maze as a string where all of the 1's are replaced with * and all of the 0's are replaced with spaces.
	public String toString()
	{
		String outputString = "";
		
		//These for loops iterate through every point 
		for (int row = 0; row < maze[0].length; row++)
		{
			for (int col = 0; col < maze.length; col++)
			{
				//If the point is a 1, add a * to outputString, otherwise add a space
				if (row == currentY && col == currentX)
				{
					outputString += "X";
				}
				
				else if (maze[row][col] == 1)
				{
					outputString += "*";
				}
				
				else
				{
					outputString += " ";
				}
			}
			
			//Add in a new line to outputString every time that the inner loop finishes. This has the effect of printing to the next line whenever the loop is moving to a new row.
			outputString += "\n";
		}	
		
		return outputString;
	}

}
