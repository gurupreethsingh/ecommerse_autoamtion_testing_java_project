// literals : are the types of varaibles, we have 4 types of literals. 
//1. number literals (intergers, long, float, doulbe , short) - writtern without any qoutes. 
//2. character literals. writtern in single quotes. 
//3. string literals. - writtern in double quotes. 
//4. boolean literals - writtern without any qoutes. (true / false)

//2. DataTypes : we have 8 primitive datatypes in java. 
//
//Datatype  | size in bytes | default value
//1. byte   | 1byte         |   0
//2. short  | 2 bytes       |   0
//3. char   | /u000         |   0
//4. int    | 4 bytes       |   0
//5. float  | 4 bytes       |   0.0
//6. long   | 8 bytes       |   0
//7. double | 8 bytes       |   0.0
//8. String | null          |  null

//3. Variables : are the named memory location which can take any value, and that value can be changed during execution of program

package literals_datatypes_varaibles;

public class Literals_Variables {

	public static void main(String[] args) 
	{
		byte b = 1; 
		short s = 1; 
		char  ch = 'a';
		char ch1 = '4';
		int  i =10; 
		long l = 897867698769l;   // we have to write l at the last indicating its a long value. 
		float f = 34.43f;    // for float value we have to write f at the last, or else by default it will become doulble value. 
		double d = 324432.343; 
		String s1 = "Hello world";
		String s2 = "abc123";
		String s3 = "23455";
		System.out.println(b);
		System.out.println(s);
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
