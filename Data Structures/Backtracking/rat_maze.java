import java.util.*;
/**
 * rat_maze
 * Gladden Rumao
 * Consider a rat placed at (0, 0) in a square matrix of order N * N. It has to reach the destination at (N - 1, N - 1). Find all possible paths that the rat can take to reach from source to destination. The directions in which the rat can move are 'U'(up), 'D'(down), 'L' (left), 'R' (right). Value 0 at a cell in the matrix represents that it is blocked and rat cannot move to it while value 1 at a cell in the matrix represents that rat can be travel through it.
Note: In a path, no cell can be visited more than one time. If the source cell is 0, the rat cannot move to any other cell.

Example 1:

Input:
N = 4
m[][] = {{1, 0, 0, 0},
         {1, 1, 0, 1}, 
         {1, 1, 0, 0},
         {0, 1, 1, 1}}
Output:
DDRDRR DRDDRR
Explanation:
The rat can reach the destination at 
(3, 3) from (0, 0) by two paths - DRDDRR 
and DDRDRR, when printed in sorted order 
we get DDRDRR DRDDRR.
Example 2:
Input:
N = 2
m[][] = {{1, 0},
         {1, 0}}
Output:
-1
Explanation:
No path exists and destination cell is 
blocked.
Your Task:  
You don't need to read input or print anything. Complete the function printPath() which takes N and 2D array m[ ][ ] as input parameters and returns the list of paths in lexicographically increasing order. 
Note: In case of no path, return an empty list. The driver will output "-1" automatically.

Expected Time Complexity: O((3N^2)).
Expected Auxiliary Space: O(L * X), L = length of the path, X = number of paths.

Constraints:
2 ≤ N ≤ 5
0 ≤ m[i][j] ≤ 1
 */





 /*Link:https://www.geeksforgeeks.org/problems/rat-in-a-maze-problem/1 */
public class rat_maze {

   public static void solveMaze(ArrayList<String> ans,int r,int c,int m[][],int n,String path,boolean visited[][]){
 //base case
    if(r==n-1 && c==n-1 && m[r][c]!=0){
        ans.add(path);
        return;
   }

   //handling boundary
   if(r>=0 && r<n && c>=0 && c<n){
       if(visited[r][c] == true || m[r][c] == 0){
           return;
       }

       //recursive calls for all 4 directions
      visited[r][c] = true;//mark the cell as visited

       solveMaze(ans, r+1, c, m, n, path+'D', visited); //down
         solveMaze(ans, r, c-1, m, n, path+'L', visited); //left
              solveMaze(ans, r, c+1, m, n, path+'R', visited); //right
                 solveMaze(ans, r-1, c, m, n, path+'U', visited); //up
                 
      visited[r][c] = false; //backtrack and mark the cell as unvisited           

   }
}

    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> ans = new ArrayList<>();
        // String path = "";
        boolean visited[][] = new boolean[n][n];
            solveMaze(ans,0,0,m,n,"",visited);
        return ans;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of maze(n*n matrix): ");
        int n = sc.nextInt();//size of maze
        System.out.println("Enter the maze: ");
        int m[][] = new int[n][n]; //maze
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                m[i][j] = sc.nextInt();
            }
        }

        System.out.println("The paths are: "+findPath(m,n));
    }
}