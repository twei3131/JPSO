package com.company;

public class SO
{
    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    private Integer x;
    private Integer y;

    public SO(Integer x, Integer y)
    {
        this.x = x;
        this.y = y;
    }
}
