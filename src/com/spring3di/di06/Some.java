package com.spring3di.di06;

import java.util.*;

public class Some {
    private School[] schools;
    private String[] myStrs;
    private List<String> myList;
    private Set<String> mySet;
    private Map<String, Object> myMap;
    private Properties myPros;

    public School[] getSchools() {
        return schools;
    }

    public void setSchools(School[] schools) {
        this.schools = schools;
    }

    public String[] getMyStrs() {
        return myStrs;
    }

    public void setMyStrs(String[] myStrs) {
        this.myStrs = myStrs;
    }

    public List<String> getMyList() {
        return myList;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public Set<String> getMySet() {
        return mySet;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public Map<String, Object> getMyMap() {
        return myMap;
    }

    public void setMyMap(Map<String, Object> myMap) {
        this.myMap = myMap;
    }

    public Properties getMyPros() {
        return myPros;
    }

    public void setMyPros(Properties myPros) {
        this.myPros = myPros;
    }

    @Override
    public String toString() {
        return "Some{" +
                "schools=" + Arrays.toString(schools) +
                ", myStrs=" + Arrays.toString(myStrs) +
                ", myList=" + myList +
                ", mySet=" + mySet +
                ", myMap=" + myMap +
                ", myPros=" + myPros +
                '}';
    }
}
