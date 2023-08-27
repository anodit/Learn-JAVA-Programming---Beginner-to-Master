package com.udemy.section20;


import java.lang.*;


class MyObject
{
    public String toString()
    {
        return "My Object";
    }
    
    public int hashCode()
    {
        return 100;
    }
    public boolean equals(Object o)
    {
        return this.hashCode()==o.hashCode();
    }
// 	  ---> wait and notify is final so we can't override it
//    public void notify() 
//    {
//        
//    }

//    public void wait() {
//    	
//    }

}

public class LangDemo 
{
    public static void main(String[] args) 
    {
    	MyObject o1=new MyObject();
    	MyObject o2=new MyObject();
        System.out.println(o1);
        System.out.println(o1.equals(o2));
    }    
}

//Output
//My Object
//true

