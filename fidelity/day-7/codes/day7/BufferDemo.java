package com.fidelity.java.day7;

import java.nio.ByteBuffer;

public class BufferDemo {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);

        buffer.put((byte) 10);
        buffer.put((byte) 20);
        buffer.put((byte) 30);
        buffer.put((byte) 40);
        buffer.put((byte) 50);
        buffer.put((byte) 60);
        buffer.put((byte) 70);
        buffer.put((byte) 80);   
        buffer.put((byte) 90);
        buffer.put((byte) 100);
        //buffer.put((byte) 110); //java.nio.BufferOverflowException
        
        
        buffer.flip();

        while (buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }
}