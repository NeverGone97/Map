package com.example.nut_it.map.Model;

import java.io.Serializable;

/**
 * Created by Nut_IT on 3/18/2017.
 */

public class Navi implements Serializable{

    private int hinh;

    public Navi(int hinh) {
        this.hinh = hinh;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
