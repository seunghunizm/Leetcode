class Solution {
    public void rotate(int[][] matrix) {
        int edgeLength = matrix.length; // get the length to get size
        int top = 0;
        int bottom = edgeLength - 1; 
        while (top < bottom) { // flip vertically
            for (int y = 0; y < edgeLength; y++){
                int temp = matrix[top][y];
                matrix[top][y] = matrix[bottom][y]; // not the top
                matrix[bottom][y] = temp; // make top the bottom
            }
            top++;
            bottom--;
        }
        for(int x = 0; x < edgeLength; x++){
            for (int y = x + 1; y < edgeLength; y++){ // + 1 makes it start from 2nd column then 3rd
                int temp = matrix[x][y];
                matrix[x][y] = matrix[y][x]; // transpose it
                matrix[y][x] = temp;
            }
        }
    }
}