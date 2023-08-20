class Salary{
	public static void main(String args[]){
		int salary = 32000;
		double gross_salary;
		if(salary < 30000)
			gross_salary = salary - 0.2 * salary;
		else if(salary >= 30000 && salary < 40000)	
			gross_salary = salary - 0.3 * salary;
		else
			gross_salary = salary - 0.4 * salary;
		gross_salary += gross_salary * 0.23;
		System.out.println("The Gross Amount is : " + gross_salary);
	}
}