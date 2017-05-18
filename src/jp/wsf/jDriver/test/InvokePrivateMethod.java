package jp.wsf.jDriver.test;

import java.lang.reflect.InvocationTargetException;

import jp.wsf.jDriver.core.jDriver;
import static jp.wsf.jDriver.asserts.AssertResult.*;
import static jp.wsf.jDriver.method.Invoker.*;

public class InvokePrivateMethod {
public static void main(String[] args) {
	Throwable t = new Throwable();
	jDriver jd = new jDriver();
	jd.execute(t.getStackTrace()[0].getClassName());
}

public void testGetName() throws IllegalAccessException,InvocationTargetException,NoSuchMethodException {
	//set Ai's name,age
	Human Ai = new Human("ai",16,"Female");
	String AiName = (String)InvokePrivate("getName",(Object)Ai);
	assertResult("She is a " + AiName,"ai",AiName);

}
}
