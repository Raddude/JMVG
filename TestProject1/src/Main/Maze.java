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
				if (maze[row][col] == 1)
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
