package core.java;

import java.lang.ref.WeakReference;

/**
 * We tell JVM this is weak reference in
 * case if you run out of memory garbale
 * collect to this object
 * 
 * 
 *
 */
public class WeakReferenceExample {

	public void createWeakRefObject() {
		WeakReference<String> wr = new WeakReference<String>(new String("abc"));
	}
}
