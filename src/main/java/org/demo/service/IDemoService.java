package org.demo.service;

import org.demo.util.annotation.Demo;

public interface IDemoService {
    void demoOut(String x);

    @Demo(db = "addUser--annotation")
    void addUser();

    @Demo(db = "addCategory--annotation")
    void addCategory();
}
