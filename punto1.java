package senatarde1;

import javax.swing.JOptionPane;

public class punto1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int codigo, n,categoria, cant1=0,cant2=0,cant3=0,sal1=0,sal2=0,sal3=0;
		int suma1=0 ,suma2=0,suma3=0;
		
		n=Integer.parseInt(JOptionPane.showInputDialog("la cantidad de empleado "));
		for (int i=1;i<=n;i++) {
			codigo=Integer.parseInt(JOptionPane.showInputDialog("el codigo del empleado"));
			categoria=Integer.parseInt(JOptionPane.showInputDialog("ingrese categoria del empleado de 1 a 3 "));
			
			if (categoria==1) {
				sal1=Integer.parseInt(JOptionPane.showInputDialog("ingrese salario "));
				cant1=cant1+1;
				suma1=suma1+sal1;
			}
			
			else if(categoria==2) {
				
				sal2=Integer.parseInt(JOptionPane.showInputDialog("ingrese salario "));
				cant2=cant2+1;
				suma2=suma2+sal2;
			}
			else if(categoria==3) {
			sal3=Integer.parseInt(JOptionPane.showInputDialog("ingrese salario "));
			cant3=cant3+1;
			suma3=suma3+sal3;
			}
		
		}
		System.out.println("la cantidad de empleados de la categoria 1 es:"+ cant1);
		System.out.println("la cantidad de empleados de la categoria 2 es:"+ cant2);
		System.out.println("la cantidad de empleados de la categoria 3 es:"+ cant3);
		System.out.println("el promedio de salario de la categoria 1:"+ suma1/cant1);
		System.out.println("el promedio de salario de la categoria 2:"+ suma2/cant2);
		System.out.println("el promedio de salario de la categoria 3:"+ suma3/cant3);
		System.out.println("la suma de todos los salarios es:"+ suma1+suma2+suma3);
		
		

	}
	

}
