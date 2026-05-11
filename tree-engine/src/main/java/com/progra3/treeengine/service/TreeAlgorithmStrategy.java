package com.progra3.treeengine.service;

import java.util.List;

public interface TreeAlgorithmStrategy<T> {
  
    void createRoot(T value);
    
    void insert(String parentId, T value);
    
    
    List<T> getTree();
    
 
    T findNode(String id);
    
    
    void deleteNode(String id);
    
   
    List<T> getDFS();
    
    
    List<T> getBFS();
    
    
    int getHeight();
    
 
    int getLevel(String id);
    
  
    List<T> getLeaves();
    
    
    boolean hasCycles();
}