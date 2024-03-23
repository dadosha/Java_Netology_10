package ru.netology.java10;

public class PosterManager {
    private PosterItem[] items = new PosterItem[0];
    private int limit = 5;

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public PosterManager() {}

    public void add(PosterItem item) {
        PosterItem[] tmp = new PosterItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public void removeById(int id) {
        PosterItem[] tmp = new PosterItem[items.length - 1];
        int copyToIndex = 0;
        for (PosterItem item : items) {
            if (item.getId() != id) {
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        items = tmp;
    }

    public PosterItem[] findAll() {
        return items;
    }

    public PosterItem[] findLast() {
        int resultLength;
        if (limit > items.length)  {
            resultLength = items.length;
        } else {
            resultLength = limit;
        }
        PosterItem[] limitReversItems = new PosterItem[resultLength];
        for (int i = 0; i < resultLength; i++) {
            limitReversItems[i] = items[items.length - 1 - i];
        }
        return limitReversItems;
    }
}
