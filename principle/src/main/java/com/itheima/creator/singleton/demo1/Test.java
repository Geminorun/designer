//package com.itheima.creator.singleton.demo1;
//
//import java.io.*;
//import java.lang.invoke.VarHandle;
//import java.lang.reflect.Constructor;
//import java.security.Signature;
//
///**
// * @Auther: lyl
// * @Date: 2024/1/24 10:53
// * @Description:
// */
//public class Test {
//    public static void main(String[] args) throws Exception {
//
////        Class clazz = Singleton.class;
////        Constructor constructor = clazz.getDeclaredConstructor();
////        constructor.setAccessible(true);
////        Singleton singleton1 = (Singleton) constructor.newInstance();
////        Singleton singleton2 = (Singleton) constructor.newInstance();
////        System.out.println(singleton2==singleton1);
//
//        //writeObject2File();
////        readObjectFromFile();
////        readObjectFromFile();
//        Runtime runtime = Runtime.getRuntime();
//        Process ipconfig = runtime.exec("ipconfig");
//        InputStream inputStream = ipconfig.getInputStream();
//        byte[] arr = new byte[1024*1024*100];
//        int len = inputStream.read(arr);
//        System.out.println(new String(arr,0,len,"GBK"));
//
//    }
//
//    public static void readObjectFromFile() throws Exception {
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
//        Singleton singleton = (Singleton)ois.readObject();
//        ois.close();
//
//        System.out.println(singleton);
//    }
//
//    public static void writeObject2File() throws Exception {
//        Singleton singleton = Singleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
//        oos.writeObject(singleton);
//        oos.close();
//    }
//}
