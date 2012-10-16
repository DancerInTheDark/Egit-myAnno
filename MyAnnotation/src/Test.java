import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ShowAnno ob = new ShowAnno();
		Map<Integer, Method> annoMap = new TreeMap<Integer, Method>();
		for (Method method : ob.getClass().getDeclaredMethods()) {
			if (method.isAnnotationPresent(Anno.class)) {
				method.setAccessible(true);
				annoMap.put(method.getAnnotation(Anno.class).val(), method);
				System.out.println(method);
			}
		}
for(Integer key: annoMap.keySet()){
	annoMap.get(key).invoke(ob);
}
		
	}

}
