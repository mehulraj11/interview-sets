public class Conversion
{
	public static void main(String[] args)
	{
		//String -> Primitive
		String s = "123";
		byte b = Byte.parseByte(s);
		short so = Short.parseShort(s);
		int i = Integer.parseInt(s);
		long l = Long.parseLong(s);
		float f = Float.parseFloat(s);
		double d = Double.parseDouble(s);

		System.out.println(s + " "+ b+" "+ so + " "+ i +" "+ l + " "+ f + " "+d); 

		// String -> Wrapper class
		Integer i2 = Integer.valueOf(s);

		// primitive -> String
		
		String s2 = String.valueOf(i);
		String s3 = i +"";

		// Wrapper class -> String
		
		String s4 = i2.toString();
		String s5 = String.valueOf(i2);
	}
}