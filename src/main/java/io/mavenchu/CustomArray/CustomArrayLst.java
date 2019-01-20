package io.mavenchu.CustomArray;

import java.util.Arrays;



class CustomArrayLst<E> {
	   
	   private static final int arrayCapacity = 10;
	   private int size = 0;
	   private Object elementData[] = {};

	   public CustomArrayLst() {
		   
		   elementData = new Object[arrayCapacity];// 

	   }

	   public void fellowAdd(E e) {
		   if (size == elementData.length) {
			   ensureCapacity(); 
		   }
		   elementData[size++] = e;
	   }
	   
	   @SuppressWarnings("unchecked")
	   public E get(int index) {

	   if (index < 0 || index >= size) {
	   throw new IndexOutOfBoundsException("Index: " + index + ", Size "
	   + index);
	   }
	   return (E) elementData[index]; 
	   }
	 
	   public void remove(int index) {

	      if (index < 0 || index >= size) {
	   throw new IndexOutOfBoundsException("Index: " + index + ", Size "
	   + index);
	   }
	      
	   for (int i = index; i < size - 1; i++) {
	   elementData[i] = elementData[i + 1];
	   }
	   size--; 

	   }
	  
	   private void ensureCapacity() {
	   int newIncreasedCapacity = elementData.length * 2;
	   elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
	   }

	   public void display() {
		   
	   System.out.print("Displaying list : ");
	   
	   
	   for (int i = 0; i < size; i++) {
		   
	   System.out.print(elementData[i] + " ");
	   
	   }
	   	   
	   }
	}



