package TechTask280125;

       class Matrix extends Thread{
			int[][] a = {{1,3},{6,3}};
			int [][] b = {{5,4},{2,2}};
			int [][] c = new int [2][2];
			
			public void run() {
				for(int i=0; i<2; i++) {
					for(int j =0; j<2; j++){
						c[i][j] = a[i][j] * b[i][j] ;
						System.out.print(c[i][j]+" ");
					}
					System.out.println();
					
				}
				
			}
		}
		public class MatrixMultiThread {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
		Matrix matrix = new Matrix();
		matrix.start();
			}

		}

	