package job4j;
/**
* Class Класс для вычиления арифметических операций.
* @author dlukyanchuk
* @since 13.02.2017
* @version 1
*/
public class Calculate1 {
	double result;

 	void add(double a, double b){
		this.result=a+b;	}

	void sub(double a, double b){
		this.result=a-b;	}

	void div(double a, double b){
		this.result=a/b;	}

	void mult(double a, double b){
		this.result=a*b;	}

	
		double getResult() {
		this.result = result;
}
};