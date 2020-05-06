package util;

import org.reflections.Reflections;
import org.reflections.scanners.MethodAnnotationsScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.scanners.TypeElementsScanner;

import java.util.Set;

public class JdbcUtil {
    public Set<Class<?>> getReflectionsSubTypes() {
        Reflections reflections = new Reflections("entity", new SubTypesScanner(),new TypeElementsScanner(), new MethodAnnotationsScanner());
        return reflections.getSubTypesOf(Object.class);
    }
    public void updateDB () {
        Set<Class<?>> allClasses = getReflectionsSubTypes();
        System.out.println(allClasses);
    }
    public enum GenerationType {
        IDENTITY("identity"), UUID("uuid");
        private String type;
        GenerationType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }
}
