package com.dizzy.demo;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedJunitEx {
	    @Nested
	    class FirstNestedClass {
	        @Test
	        void test() {
	            System.out.println("FirstNestedClass");
	        }
	    }

	    @Nested
	    class SecondNestedClass {
	        @Test
	        void test() {
	            System.out.println("SecondNestedClass");
	        }
	    }
	
}
