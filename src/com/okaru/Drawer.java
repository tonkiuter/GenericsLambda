package com.okaru;

public class Drawer<T>{
    private T name;
    private int size;
    private Drawer[] array;
    private int contador;
    private boolean isThere;

    public Drawer(T name) {
        this.name = name;
        this.array = new Drawer[5];
    }

//    public Drawer() {
//    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public void add(Drawer[] drawer){
        for (int i = 0; i < array.length; i++){
            array[i] = drawer[i];
        }
    }

    public void delete(int index){
        for(int i = index+1; i <array.length; i++){
            array[i-1] = array[i];
        }

        array[4] = null;


    }

    public void find(T name){
//        boolean isThere = true;
        for (int i = 0; i < array.length; i++) {
            if(array[i] != null){
                if(array[i].getName().equals(name)){
                    isThere = true;
                    break;
//                  continue;
                }
                else{
//                    System.out.println(name + " si se encuentra en el array!");
                    isThere = false;

                }
            }

        }
        if(isThere == true){
            System.out.println(name + " si se encuentra en el array!");
        }
        else {
            System.out.println(name + " no se encuentra en el array!");
        }
    }

    public void showArray(){
        for(int i = 0; i< array.length; i++){
            if(array[i] == null){
                break;
            }
            System.out.println(array[i].getName());
        }

    }
//
//    public T[] getArray() {
//        return array;
//    }
//
//    public void setArray(T[] array) {
//        this.array = array;
//    }
}
