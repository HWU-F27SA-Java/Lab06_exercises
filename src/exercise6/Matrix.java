package exercise6;

public class Matrix {
	int nbRows;
	int nbColumns;
	double [][] tab;
	
	public Matrix(int rows, int columns){
		nbRows = rows;
		nbColumns = columns;
		tab = new double[rows][columns]; //filled with zero
	}
	public Matrix(double [][] d){
		nbRows = d.length;
		nbColumns = d[0].length;
		tab = d;
	}

	public int getNbRows(){return nbRows;}
	public int getNbColumns(){return nbColumns;}
	public double getComp(int i, int j){return tab[i][j];}

	public Matrix add(Matrix s)  {
		//your code here
		return null;
	}
	
	public Matrix mul(Matrix s)  {
		//your code here
		return null;
	}
	
	public Matrix transpose(){
		//your code here
		return null;
	}

	private Matrix sub(int x, int y){
		//your code here
		return null;

	}
	
	public double det() {//determinant of the matrix
		//your code here
		return -1;
	}

	
	public String toString(){
		java.text.DecimalFormat d = new java.text.DecimalFormat("#.00");
		String s="";
		for(int i=0; i<nbRows; i++){
			s += "| ";
			for(int j=0; j<nbColumns; j++){
				s += "  " + d.format(tab[i][j]);
			}
			s += " |\n";
		}
		return s;
	}

}
