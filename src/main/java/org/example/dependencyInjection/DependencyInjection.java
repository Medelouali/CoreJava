package org.example.dependencyInjection;

import org.example.dependencyInjection.dao.DoaInterface;
import org.example.dependencyInjection.metier.MetierInterface;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class DependencyInjection {

    public static void run() throws FileNotFoundException, ClassNotFoundException,
            InstantiationException, IllegalAccessException, NoSuchMethodException,
            InvocationTargetException {
        Scanner scanner1=new Scanner(new File("config.txt"));
        String daoImplClassName=scanner1.nextLine();

        Class<?> daoImplClass= Class.forName(daoImplClassName);
        DoaInterface daoImplClassInstance=(DoaInterface) daoImplClass.newInstance();

        String metierClassName=scanner1.nextLine();

        Class<?> metierClass= Class.forName(metierClassName);
        MetierInterface metierClassInstance=(MetierInterface) metierClass.newInstance();
        Method setDataMethod=metierClass.getMethod("setData", DoaInterface.class);
        Method calculateMethod=metierClass.getMethod("calculate");

        setDataMethod.invoke(metierClassInstance, daoImplClassInstance);
        calculateMethod.invoke(metierClassInstance);
    }
}
