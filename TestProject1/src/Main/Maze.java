package Main;

/* 	CLASS DEFINITION: This class stores the maze array and has methods relating to behavior of the player within the maze.
 */

public class Maze {
	
	private static int[][] maze = 
		{{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		 {1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1}};
	
	
	
	public static String returnMaze()
	{
		return maze[0][0] + ", " + maze[0][1] + "\n" + maze[1][0] + ", " + maze[1][1];
	}
	
	
	
	public String toString()
	{
		return "";
	}

}
