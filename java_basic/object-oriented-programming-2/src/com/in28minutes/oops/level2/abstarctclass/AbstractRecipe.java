package com.in28minutes.oops.level2.abstarctclass;

public abstract class AbstractRecipe {
    public void execute(){
        getReady();
        doTheDish();
        cleanup();
    }

    abstract void getReady();
    abstract void doTheDish();
    abstract  void cleanup();
}
