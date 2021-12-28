package agh.ics.oop;

public interface IPositionChangeObserver {
    void positionChanged(Animal moveAnimal, Vector2d oldPosition, Vector2d newPosition);
}
