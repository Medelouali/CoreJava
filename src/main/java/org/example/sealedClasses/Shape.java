package org.example.sealedClasses;

public sealed interface Shape permits Circle, Triangle{
    public static final Integer MAX_CREATED_SHAPES=1024;
    public void colorShape();
    public boolean unColorShape();
    public default void print(){
        doInternalJob();
        System.out.println("Printing the shape");
    }
    private void doInternalJob(){
        System.out.println("Doing Internal Stuff");
    }
}
