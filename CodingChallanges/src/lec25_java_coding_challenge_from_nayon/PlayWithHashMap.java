package lec25_java_coding_challenge_from_nayon;

//TODO Will learn when we teaches Collection framework

/*
Q1:- Assume that the following expression always evaluates to true: 

new MyClass1().hashCode() == new MyClass2().hashCode(); 

What will be the result of executing the following code: 

public class Foo { 
public static void main(String[] args) {

MyClass1 obj1 = new MyClass1(); 
MyClass2 obj2 = new MyClass2(); 

Map<Object, Object> hMap = new HashMap<>(); 

hMap.put(obj1, obj1); 
hMap.put(obj2, obj1); 

System.out.println("size=" + hMap.size());
 	} 
} 

 */

public class PlayWithHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
