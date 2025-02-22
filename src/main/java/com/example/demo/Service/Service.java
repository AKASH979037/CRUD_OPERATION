package com.example.demo.Service;

import com.example.demo.modl.Details;

import java.util.Arrays;
import java.util.*;

@org.springframework.stereotype.Service
public class Service {
    public String show() {
        return "List of Students";
    }

    List<Details> det;

    {
        det = new ArrayList<>(Arrays.asList(new Details(1, "aksh", "cyber"),
                new Details(2, "Anush", "cyber")));
    }

    public List<Details> stget() {
        return det;
    }

    public String get(int roll) {
        for (int i = 0; i < det.size(); i++){
            if (roll == det.get(i).getDa()) 
                return det.get(i).getDa() + " " + det.get(i).getStr() + " " + det.get(i).getDep();
            }
        return "NO ELEMENTS FOUND";
    }
    public String addstudent(Details st)
    {
        det.add(st);
            return "Success";
    }

    public String delete(int n) {
        for(int i=0;i<det.size();i++)
        {
            if(n==det.get(i).getDa())
            {

                    det.remove(det.get(i).getDa());
                    return "sucees fully";
            }
        }
        return "not found";
    }

    public String update(Details st) {
        for(int i=0;i<det.size();i++)
        {
            if(st.getDa()==det.get(i).getDa())
            {
                det.set(i,st);
                return "upadted sucess";
            }

        }
        return "NOT upadted sucess";

    }
}