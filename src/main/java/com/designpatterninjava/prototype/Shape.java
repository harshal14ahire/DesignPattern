package com.designpatterninjava.prototype;

interface Shape extends Cloneable {
    void draw();

    Object clone() throws CloneNotSupportedException;
}
