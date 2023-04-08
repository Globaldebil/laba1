package com.example.laba1;

public class Memory {

    private String memory = null;
    public void setMemory(String num) {
        this.memory = num;
    }
    public String getMemory() {
        return memory;
    }
    public boolean isEmpty(){
        return memory == null;
    }

    public void delete() {
        memory = null;
    }
}

