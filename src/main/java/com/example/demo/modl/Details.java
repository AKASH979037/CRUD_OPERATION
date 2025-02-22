package com.example.demo.modl;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Details {
    int da;
    String str;
    String dep;

    public int getDa() {
        return da;
    }
}
