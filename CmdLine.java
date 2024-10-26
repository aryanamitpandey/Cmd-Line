class CmdLine{

	public static void main(String args[]){

		int count, i=0;

		String str;
		count =args.length;
		System.out.println(" The number of parameter = " + count);

		while(i<count){

			str = args[i];
			i=i+1;
			System.out.println("java is : " + str);

		}

	}
}
