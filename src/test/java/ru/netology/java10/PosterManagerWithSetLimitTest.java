package ru.netology.java10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PosterManagerWithSetLimitTest {

    PosterManager posters = new PosterManager(15);

    PosterItem item1 = new PosterItem(0, "Блэдшот", 2020, "Ссылка на картинку 1");
    PosterItem item2 = new PosterItem(1, "Вперед", 2020, "Ссылка на картинку 2");
    PosterItem item3 = new PosterItem(2, "Отель 'Белград'", 2020, "Ссылка на картинку 3");
    PosterItem item4 = new PosterItem(3, "Джентельмены", 2020, "Ссылка на картинку 4");
    PosterItem item5 = new PosterItem(4, "Человек-неведимка", 2020, "Ссылка на картинку 5");
    PosterItem item6 = new PosterItem(5, "Тролли. Мировой тур", 2020, "Ссылка на картинку 6");
    PosterItem item7 = new PosterItem(6, "Номер один", 2020, "Ссылка на картинку 7");

    @BeforeEach
    public void setup() {
        posters.add(item1);
        posters.add(item2);
        posters.add(item3);
        posters.add(item4);
        posters.add(item5);
        posters.add(item6);
        posters.add(item7);
    }

    @Test
    public void testReversLimitMorePosterCount() {
        PosterItem[] actual = posters.findLast();
        PosterItem[] expected = {item7, item6, item5, item4, item3, item2, item1};

        Assertions.assertArrayEquals(expected, actual);
    }

}