# TrominoJava

This code is a solution for the Tromino Puzzle problem, which is a tiling problem that involves filling a 2D board with L-shaped trominoes (made up of three unit squares) in such a way that one square is left unfilled. The code uses a recursive approach to solve the problem.

The main method of the code is the trominoPuzzle() method, which takes in two arguments: an integer 'size' representing the size of the board and two integers 'missingX' and 'missingY' representing the coordinates of the missing square on the board. The method is a recursive function that first checks if the size of the board is 2, in which case it returns a tiled board with the missing square.

Otherwise, the method divides the board into four smaller squares and recursively calls the trominoPuzzle() method on each of these smaller squares. The smaller squares are then copied into the larger board. The missing square is then found, and the square containing the missing square is tiled.

The main() method then uses the trominoPuzzle() method to create an 8x8 board with a missing square at coordinates (2,3) and prints out the tiled board.

In summary, this code uses a recursive approach to solve the Tromino Puzzle problem by dividing the board into smaller squares, solving the problem on the smaller squares, and combining the solutions to form the solution for the larger board.