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
		String outString = Integer.toString(maze[0].length);
		
		for (int row = 0; row < maze.length; row++)
		{
			
		}
		
		return outString;
	}

}
