package honGongJa.Else;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class strClass= Class.forName("java.lang.String");
		
		Constructor[] cons = strClass.getConstructors();
		for (Constructor c : cons) {
			System.out.println(c);
			/*
			 * public java.lang.String(byte[],int,int) public
			 * java.lang.String(byte[],java.nio.charset.Charset) public
			 * java.lang.String(byte[],java.lang.String) throws
			 * java.io.UnsupportedEncodingException public
			 * java.lang.String(byte[],int,int,java.nio.charset.Charset) public
			 * java.lang.String(byte[],int,int,java.lang.String) throws
			 * java.io.UnsupportedEncodingException public
			 * java.lang.String(java.lang.StringBuilder) public
			 * java.lang.String(java.lang.StringBuffer) public java.lang.String(byte[])
			 * public java.lang.String(int[],int,int) public java.lang.String() public
			 * java.lang.String(char[]) public java.lang.String(java.lang.String) public
			 * java.lang.String(char[],int,int) public java.lang.String(byte[],int) public
			 * java.lang.String(byte[],int,int,int)
			 */
		}
		
		Field[] fields = strClass.getFields();
		for(Field f : fields) {
			System.out.println(f);
		}
		System.out.println("___________");
		Method[] methods = strClass.getMethods();
		for(Method m: methods) {

			System.out.println(m);
		}
	}
}
