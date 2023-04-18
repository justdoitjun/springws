package com.kbstar.frame;

import com.kbstar.dao.ProductDAO;

import java.util.List;

public interface GeneralService<K, V> {


    public void register(V v);
    public void remove(K k);
    public void modify(V v);
    public V get(K k);
    public List<V> get();
}
