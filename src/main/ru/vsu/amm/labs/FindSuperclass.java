package ru.vsu.amm.labs;

/**
 * Created by FManukovskiy on 29.06.17.
 */
public class FindSuperclass {
    public static Class<?> getSuperClass(Class<?> cls) {
        return cls.getSuperclass();
    }

    public static Class<?> getSuperClass(String className) throws ClassNotFoundException {
        return getSuperClass(Class.forName(className));
    }

    public static String getSuperclassName(Class<?> cls) {
        return getSuperClass(cls).getName();
    }

    public static String getSuperclassName(String className) throws ClassNotFoundException {
        return getSuperclassName(Class.forName(className));
    }
}
