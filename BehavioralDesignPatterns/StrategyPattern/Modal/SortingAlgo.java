package StrategyPattern.Modal;
public class SortingAlgo{
SortingStrategy sortStrategy;//depend on polymorphic type

public SortingAlgo(SortingStrategy sortStrategy) {
    this.sortStrategy = sortStrategy;
}


public void applyAlgorithm(){
    sortStrategy.sort();
}
}


