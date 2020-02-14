package com.lnzz.map;

/**
 * ClassName：Map
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/2/14 9:32
 * @Description:
 */
public interface Map<K, V> {
    /**
     * size
     *
     * @return
     */
    int size();

    /**
     * isEmpty
     *
     * @return
     */
    boolean isEmpty();

    /**
     * clear
     */
    void clear();

    /**
     * put
     *
     * @param key
     * @param value
     * @return
     */
    V put(K key, V value);

    /**
     * get
     *
     * @param key
     * @return
     */
    V get(K key);

    /**
     * remove
     *
     * @param key
     * @return
     */
    V remove(K key);

    /**
     * containsKey
     *
     * @param key
     * @return
     */
    boolean containsKey(K key);

    /**
     * containsValue
     *
     * @param value
     * @return
     */
    boolean containsValue(V value);

    /**
     * traversal
     *
     * @param visitor
     */
    void traversal(Visitor<K, V> visitor);


    public static abstract class Visitor<K, V> {
        boolean stop;

        /**
         * visit
         *
         * @param key
         * @param value
         * @return
         */
        public abstract boolean visit(K key, V value);
    }
}
