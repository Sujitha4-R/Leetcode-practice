class Solution {
    public void rotate(int[][] matrix) {
        int row=matrix.length;
        for(int i=0;i<row;i++){
            for(int j=i+1;j<row;j++){
                 int temp=matrix[i][j];
                 matrix[i][j]=matrix[j][i];
                 matrix[j][i]=temp;

            }
        }
           for(int[] arr:matrix){
            for(int j=0;j<row/2;j++){
            int temp1=arr[j];
            arr[j]=arr[row-j-1];
            arr[row-j-1]=temp1;
            }
    }
}
}