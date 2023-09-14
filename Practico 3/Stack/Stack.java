/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Stack;

/**
 *
 * @author bruno
 */
public class Stack<AnyType> {
    
    //último elemento
    private Integer index;
    //tamaño del arreglo
    private Integer size;
    //arreglo
    private AnyType array[];
    
    public Stack (Integer size){
        this.size = size; 
        this.index = 0;
        this.array = (AnyType []) new Object [size];
    }
    
    //agregar un elemento
    public void push (AnyType element) throws Exception{
        if(!isFull()){
            this.array[this.index] = element; 
            this.index++;
        }else{
            throw new Exception("\nLa pila está llena");
        }
        
    }
    
    //quitar el elemento de arriba
    public AnyType pop(){
        this.index--;
        return this.array[this.index];
    }
    
    // mostrar el elemento de arriba
    public AnyType top(){
        return this.array[this.index - 1];
    }
    
    //pila vacía o no
    public boolean isEmpty (){
      return this.index == 0;
    }
    
    //vaciar pila
    public void makeEmpty(){
        this.index = 0;
    }
    
    //para saber si esta llena
    public Boolean isFull(){
        return this.index == this.size;
    }
}
