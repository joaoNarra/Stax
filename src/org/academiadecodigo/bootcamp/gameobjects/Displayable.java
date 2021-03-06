package org.academiadecodigo.bootcamp.gameobjects;

public interface Displayable {
    void show(int x, int y);

    void hide();

    int getX();

    int getY();

    int getWidth();

    int getHeight();
}
