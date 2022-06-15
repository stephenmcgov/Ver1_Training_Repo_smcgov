import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//Task 1 - hello world
		/*
		String statement = "Hello World";
		System.out.println(statement );
		*/
		
		//Task 2 - if statement
		/*
		byte temp = 21;
		if (temp >= 20) System.out.println("It is hot today!");
		else if (temp < 20) System.out.println("It is notvery hot today!");
		else if (temp > 35) System.out.println("Seek a cool, sheltered place");
		*/
		
		//Task 3 - longer if statement
		/*
		String day = "Monday";
		if (day == "Monday") System.out.println("Today is Monday");
		else if (day == "Tuesday") System.out.println("Today is Tuesday");
		else if (day == "Wednesday") System.out.println("Today is Wednesday");
		else if (day == "Thursday") System.out.println("Today is Thursday");
		else if (day == "Friday") System.out.println("Today is Friday");
		else if (day == "Saturday") System.out.println("Today is Saturday");
		else if (day == "Sunday") System.out.println("Today is Sunday");*/
		
		//Task 4 - taking input (calculator)
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter first num:");
		String val1 = sc.nextLine();
		System.out.println("Enter operator:");
		String op = sc.nextLine();
		System.out.println("Enter second num:");
		String val2 = sc.nextLine();
		
		float num1 = Float.parseFloat(val1);
		float num2 = Float.parseFloat(val2);
		float ans = 0f;
		
		if (op.equals("+")) ans = num1+num2;
		else if (op.equals("-")) ans = num1-num2;
		else if (op.equals("/")) ans = num1/num2;
		else if (op.equals("*")) ans = num1*num2;
		else if (op.equals("%")) ans = num1%num2;
		else if (op.equals("^")) ans = (float) Math.pow(num1, num2);
		
		System.out.println(val1 + op + val2 + " = " + ans);
		*/
		
		//Task 5 - switch statements
		/*
		String fruit = "apple";
		
		switch(fruit) {
		case "apple":
			System.out.println("Price: $0.50");
			break;
		case "pineapple":
			System.out.println("Price: $0.75");
			break;
		case "orange":
			System.out.println("Price: $0.60");
			break;
		}
		*/
		
		//Task 6 - do-while loop
		/*
		int i = 1;
		
		do {
			System.out.println(i);
			i++;
		} while (i<21);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num:");
		String val = sc.nextLine();
		
		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j<(int)(Float.parseFloat(val))+1);
		
		int k = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter STOP to halt program, else press Enter to continue");
		while(true){
			String input = sc.nextLine();
		    if(input.equals("STOP"))
		    {
		    	System.out.println("Stopping program");
		    	break;
		    }
		    	
		    else
		    {
		    	System.out.println("Loop "+k);
		    	k++;
		    }
		}*/
		
		//Task 7 - class interactions (passing to methods)
		/*float ans = 0f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first num:");
		String val1 = sc.nextLine();
		System.out.println("Enter operator:");
		String op = sc.nextLine();
		System.out.println("Enter second num:");
		String val2 = sc.nextLine();
		
		switch(op) {
			case "+":
				ans = Calculator.add(val1, val2);
				break;
			case "-":
				ans = Calculator.subtract(val1, val2);
				break;
			case "/":
				ans = Calculator.divide(val1, val2);
				break;
			case "*":
				ans = Calculator.multiply(val1, val2);
				break;
		}
			
		System.out.println(val1 + op + val2 + " = " + ans);
		*/
		
		//Extra Task 1 - reversing strings
		/*
		String sentence = "Are you as excited as I am?";
		String reverseSentence = "";
		
		String[] words = sentence.split(" ");
		
		int i;
		for(i=words.length-1; i!=-1; i--) {
			if (words[i].equals("Are")) words[i] = "are?";
			if (words[i].equals("am?")) words[i] = "Am";
			reverseSentence += words[i]+" ";
		}
		System.out.println(reverseSentence);
		
		String[] wordList = {"Stressed","Parts","Straw","Keep","Wolf"};
		String reversedWord;
		
		int j, k;
		char c;
		for (j=0; j<wordList.length; j++) {
			reversedWord = "";

			for (k=wordList[j].length()-1; k!=-1; k--) {
				c = wordList[j].charAt(k);
				if(k==wordList[j].length()-1) {
					c = Character.toUpperCase(c);
					reversedWord += c;
				}
				else if(Character.isUpperCase(wordList[j].charAt(k))) {
					c = Character.toLowerCase(c);
					reversedWord += c;
				}
				else 
					reversedWord += wordList[j].charAt(k);
			}
			System.out.println("Word was: " + wordList[j]);
			System.out.println("Reversed word is: " + reversedWord);
		}
		*/
		
		//Extra Task 2 - Pangrams
		/*
		String sentence = "Sixty zippers were quickly picked from the woven jute bag.";
		//String sentence = "A wizard’s job is to vex chumps quickly in fog.";
		//String sentence = "Brown jars prevented the mixture from freezing too quickly.";
		//String sentence = "I once went to a quiet place in the Bahamas to see a very dodgy taxman.";
		//String sentence = "I once went to a quiet place in the Bahamas to see a very dodgy taxman.";
		//String sentence = "We promptly judged antique ivory buckles for the next prize.";
		
		Boolean a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
		a=b=c=d=e=f=g=h=i=j=k=l=m=n=o=p=q=r=s=t=u=v=w=x=y=z = false;
		
		int na,nb,nc,nd,ne,nf,ng,nh,ni,nj,nk,nl,nm,nn,no,np,nq,nr,ns,nt,nu,nv,nw,nx,ny,nz;
		na=nb=nc=nd=ne=nf=ng=nh=ni=nj=nk=nl=nm=nn=no=np=nq=nr=ns=nt=nu=nv=nw=nx=ny=nz = 0;
		
		int loop;
		char pos;
		for (loop=0; loop<sentence.length(); loop++) {
			pos = sentence.charAt(loop);
			switch(pos) {
			case 'a':
				a = true;
				na++;
				break;
			case 'b':
				b = true;
				nb++;
				break;
			case 'c':
				c = true;
				nc++;
				break;
			case 'd':
				d = true;
				nd++;
				break;
			case 'e':
				e = true;
				ne++;
				break;
			case 'f':
				f = true;
				nf++;
				break;
			case 'g':
				g = true;
				ng++;
				break;
			case 'h':
				h = true;
				nh++;
				break;
			case 'i':
				i = true;
				ni++;
				break;
			case 'j':
				j = true;
				nj++;
				break;
			case 'k':
				k = true;
				nk++;
				break;
			case 'l':
				l = true;
				nl++;
				break;
			case 'm':
				m = true;
				nm++;
				break;
			case 'n':
				n = true;
				nn++;
				break;
			case 'o':
				o = true;
				no++;
				break;
			case 'p':
				p = true;
				np++;
				break;
			case 'q':
				q = true;
				nq++;
				break;
			case 'r':
				r = true;
				nr++;
				break;
			case 's':
				s = true;
				ns++;
				break;
			case 't':
				t = true;
				nt++;
				break;
			case 'u':
				u = true;
				nu++;
				break;
			case 'v':
				v = true;
				nv++;
				break;
			case 'w':
				w = true;
				nw++;
				break;
			case 'x':
				x = true;
				nx++;
				break;
			case 'y':
				y = true;
				ny++;
				break;
			case 'z':
				z = true;
				nz++;
				break;
			
			//account for capitalised chars
			case 'A':
				a = true;
				na++;
				break;
			case 'B':
				b = true;
				nb++;
				break;
			case 'C':
				c = true;
				nc++;
				break;
			case 'D':
				d = true;
				nd++;
				break;
			case 'E':
				e = true;
				ne++;
				break;
			case 'F':
				f = true;
				nf++;
				break;
			case 'G':
				g = true;
				ng++;
				break;
			case 'H':
				h = true;
				nh++;
				break;
			case 'I':
				i = true;
				ni++;
				break;
			case 'J':
				j = true;
				nj++;
				break;
			case 'K':
				k = true;
				nk++;
				break;
			case 'L':
				l = true;
				nl++;
				break;
			case 'M':
				m = true;
				nm++;
				break;
			case 'N':
				n = true;
				nn++;
				break;
			case 'O':
				o = true;
				no++;
				break;
			case 'P':
				p = true;
				np++;
				break;
			case 'Q':
				q = true;
				nq++;
				break;
			case 'R':
				r = true;
				nr++;
				break;
			case 'S':
				s = true;
				ns++;
				break;
			case 'T':
				t = true;
				nt++;
				break;
			case 'U':
				u = true;
				nu++;
				break;
			case 'V':
				v = true;
				nv++;
				break;
			case 'W':
				w = true;
				nw++;
				break;
			case 'X':
				x = true;
				nx++;
				break;
			case 'Y':
				y = true;
				ny++;
				break;
			case 'Z':
				z = true;
				nz++;
				break;
			}
		} //end of loop
		if (a&&b&&c&&d&&e&&f&&g&&h&&i&&j&&k&&l&&m&&n&&o&&p&&q&&r&&s&&t&&u&&v&&w&&x&&y&&z == true) {
			System.out.println("The sentence "+sentence+" is a pangram!");
		}
		else
		{
			System.out.println("The sentence "+sentence+" is not a pangram!");
		
			if (na == 0||nb == 0||nc == 0||nd == 0||ne == 0||nf == 0||ng == 0||nh == 0||ni == 0||nj == 0||nk == 0||nl == 0||nm == 0||nn == 0||no == 0||np == 0||nq == 0||nr == 0||ns == 0||nt == 0||nu == 0||nv == 0||nw == 0||nx == 0||ny == 0||nz == 0) {
				System.out.println("Missing letters! Letters missing are:");
				
				if(na == 0) System.out.println("a");
				if(nb == 0) System.out.println("b");
				if(nc == 0) System.out.println("c");
				if(nd == 0) System.out.println("d");
				if(ne == 0) System.out.println("e");
				if(nf == 0) System.out.println("f");
				if(ng == 0) System.out.println("g");
				if(nh == 0) System.out.println("h");
				if(ni == 0) System.out.println("i");
				if(nj == 0) System.out.println("j");
				if(nk == 0) System.out.println("k");
				if(nl == 0) System.out.println("l");
				if(nm == 0) System.out.println("m");
				if(nn == 0) System.out.println("n");
				if(no == 0) System.out.println("o");
				if(np == 0) System.out.println("p");
				if(nq == 0) System.out.println("q");
				if(nr == 0) System.out.println("r");
				if(ns == 0) System.out.println("s");
				if(nt == 0) System.out.println("t");
				if(nu == 0) System.out.println("u");
				if(nv == 0) System.out.println("v");
				if(nw == 0) System.out.println("w");
				if(nx == 0) System.out.println("x");
				if(ny == 0) System.out.println("y");
				if(nz == 0) System.out.println("z");
			}
		}*/
		
		//Extra Task 3
		
	}

}
