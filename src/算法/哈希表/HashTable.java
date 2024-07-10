package 算法.哈希表;

public class HashTable {

    class Entry {
        Object key;
        Object value;
        int hash;
        Entry next;

        public Entry(int hash, Object key, Object value) {
            this.key = key;
            this.value = value;
            this.hash = hash;
        }
    }


    Entry table[] = new Entry[16];
    int size;
    float loadFactor = 0.75f;

    int threshold = (int) (table.length * loadFactor);

    public void put(int hash, Object key, Object value) {
        int index = getIndex(hash);
        Entry p = table[index];
        if (p == null) {
            table[index] = new Entry(hash, key, value);
        } else {
            while (true) {
                if (p.key.equals(key)) {
                    p.value = value;
                    break;
                }

                if (p.next == null) {
                    p.next = new Entry(hash, key, value);
                    break;
                }
                p = p.next;
            }
        }

        size++;
        if (size >= threshold) {
            resize();
        }
    }

    private void resize() {
        Entry[] newTable = new Entry[table.length * 2];
        Entry aHead = null;
        Entry bHead = null;
        for (int i = 0; i < table.length; i++) {
            Entry p = table[i];
            Entry a = null;
            Entry b = null;
            while (p != null) {
                if ((p.hash & table.length) == 0) {
                    if (a != null) {
                        a.next = p;
                    } else {
                        aHead = p;
                    }
                    a = p;

                } else {
                    if (b != null) {
                        b.next = p;
                    } else {
                        bHead = p;
                    }
                    b = p;
                }
                p = p.next;
            }
            if (a != null){
                a.next = null;
                newTable[i] = aHead;
            }
            if (b != null){
                b.next = null;
                newTable[i + table.length] = bHead;

            }


        }
        table = newTable;
        threshold = (int) (loadFactor * table.length);
    }

    public Object get(int hash, Object key) {
        int index = getIndex(hash);
        if (table[index] == null) {
            return null;
        } else {
            Entry p = table[index];
            while (p != null) {
                if (p.key.equals(key)) {
                    return p.value;
                }
                p = p.next;
            }
        }
        return null;
    }

    private int getIndex(int hash) {
        int index = hash & (table.length - 1);
        return index;
    }

    public void remove(int hash, Object key) {
        int index = getIndex(hash);
        Entry p = table[index];
        Entry prev = null;
        if (p != null) {
            while (p != null) {
                if (p.key.equals(key)) {
                    if (prev == null) {
                        table[index] = p.next;
                    } else {
                        prev.next = p.next;
                    }
                    size--;
                }
                prev = p;
                p = p.next;
            }
        }
    }


}
