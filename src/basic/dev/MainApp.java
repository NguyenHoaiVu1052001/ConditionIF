	package basic.dev;
	
	import java.util.Scanner;
	
	public class MainApp {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//9.1 
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			if(a > 0) {
				System.out.println("So Nguyen Duong: " + a);
			}else {
			if (a != 0)
				System.out.println("So Nguyen Am: " + a);
			}
		//9.2
		    int n = sc.nextInt();
		    if (n % 3 ==0) {
		    	System.out.println("So chia het cho 3");
		    }
		    if (n % 5 == 0) {
		    	System.out.println("So chia het cho 5");
		    }
		//9.3
			  System.out.println("Nhap vao thang trong nam");
			  int t = sc.nextInt();
			  if( t == 1 || t == 3 || t == 5 || t == 7 || t == 8 || t == 10 || t == 12) 
			  System.out.println("Thang co 31 ngay");
			  else if( t == 4 || t == 6 || t == 9 || t == 11 )
			  System.out.println("Thang co 30 ngay");
			  else if( t == 2 )
				  System.out.println("Thang co 28 ngay");
		 //9.4 
		      System.out.println("Nhap he so bac 2, a = ");
			  float p = sc.nextFloat();
			  System.out.println("Nhap he so bac 1, b = ");
			  float q = sc.nextFloat();
			  System.out.println("Nhap he so tu do");
			  float r = sc.nextFloat();
			  
			  if (p == 0) {
				  if (q == 0) {
					  System.out.println("Phuong trinh vo nghiem");
				  }else {
					  System.out.println("Phuong trinh co 1 nghiem: " + "x = " + (-r/q));  			  
				  }
			  }
			  // delta
			  float delta = q*q - 4*p*r;
			  float x1;
			  float x2;
			  //tinh nghiem phuong trinh
			  if(delta > 0) {
				  x1 = (float) ((-q + Math.sqrt(delta)) / (2*p));
				  x2 = (float) ((-q - Math.sqrt(delta)) / (2*p));
				  System.out.println("Phuong trinh co 2 nghiem la: " + "x1 = " + x1 + " va x2 = " + x2 + "");
			  }else if(delta == 0) {
				  x1 = (-q/(2*p));
				  System.out.println("Phuong trinh co nghiem kep : " + "x1 = x2 = " +x1);
			
			  }else {
				  System.out.println("Phuong trinh vo nghiem");
			  }
			  // 9.5  kiem tra co phai 3 anh tam giac ko
			  int o = sc.nextInt();
			  System.out.println("canh o");
			  int y = sc.nextInt();
			  System.out.println("canh y");
			  int u = sc.nextInt();
			  System.out.println("canh u");
			  if (o + y > u && y + u > o && o + u > y)
			  System.out.println("o,y,u la 3 canh cua 1 tam giac");
			 }
	    }
	
		
