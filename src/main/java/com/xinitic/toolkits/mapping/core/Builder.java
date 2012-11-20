package com.xinitic.toolkits.mapping.core;

public interface Builder<T, S> {

    public void setConfiguration(Profile profile);

    public T buildTarget(S source);

    public S buildSource(T target);

}
