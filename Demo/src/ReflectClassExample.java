import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectClassExample
{
    public static void main(String[] args)
    {
        try {
            getClassInfo();

        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
            System.out.println("None");
        }
        getContructor();
    }

    public static void getClassInfo() throws ClassNotFoundException
    {
        Class<?> aClazz = Class.forName("Cat");
        System.out.println("Name: " + aClazz.getName());
        System.out.println("Simple Name: " + aClazz.getSimpleName());
        System.out.println("Package Name = " + aClazz.getPackage());
        System.out.println("Is Public = " + Modifier.isPublic(aClazz.getModifiers()));
        Class<?> aSuperClass = aClazz.getSuperclass();
        System.out.println("Simple Class Name of Super class = " + aClazz.getSuperclass().getSimpleName());

        System.out.println("\nConstructor:");
        Constructor<?>[] constructors = aClazz.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("+ " + constructor.getName() + " has " + constructor.getParameterCount() + " param");
        }

        System.out.println("\nDeclared Methods:");
        Method[] methods = aClazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("+ " + method.getName());
        }

        System.out.println("\nField:");
        Field[] fields = aClazz.getFields();
        for (Field field : fields) {
            System.out.println("+ " + field.getName());
        }
    }

    public static void getContructor()
    {
        Class aClazz = Cat.class; // obtain class object
        Constructor[] constructors = aClazz.getConstructors();
        for (Constructor c : constructors) {
            System.out.println("+ " + c.getName());
        }
    }
}