package io.github.lucasstarsz.fastj.framework.io.mouse;

import java.awt.event.MouseEvent;

/**
 * A mouse action listener.
 *
 * <b>NOTE:</b> For use with a FastJ {@code Scene}, a mouse action listener must be added to a
 * {@code Scene}'s list of mouse action listeners.
 * <br>
 * If you are planning to implement this class into a separate usage, you may consider using the {@code InputManager}
 * class to store a list of mouse action listeners. Then, have events from a class extending {@code MouseListener} fired
 * to that {@code InputManager}.
 *
 * @author Andrew Dey
 * @version 1.0.0
 */
public interface MouseActionListener {

    /**
     * Event called when a mouse button is pressed.
     *
     * @param mouseEvent The mouse event generated by the recent mouse button press.
     */
    default void onMousePressed(MouseEvent mouseEvent) {
    }

    /**
     * Event called when a mouse button is released.
     *
     * @param mouseEvent The mouse event generated by the recent mouse button released.
     */
    default void onMouseReleased(MouseEvent mouseEvent) {
    }

    /**
     * Event called when a mouse button is clicked.
     *
     * @param mouseEvent The mouse event generated by the recent mouse button click.
     */
    default void onMouseClicked(MouseEvent mouseEvent) {
    }

    /**
     * Event called when the mouse is moved.
     *
     * @param mouseEvent The mouse event generated by the recent mouse moved.
     */
    default void onMouseMoved(MouseEvent mouseEvent) {
    }

    /**
     * Event called when the mouse is dragged.
     *
     * @param mouseEvent The mouse event generated by the recent mouse dragged.
     */
    default void onMouseDragged(MouseEvent mouseEvent) {
    }

    /**
     * Event called when the mouse wheel is scrolled.
     *
     * @param mouseEvent The mouse event generated by the recent mouse wheel scroll.
     */
    default void onMouseWheelScrolled(MouseEvent mouseEvent) {
    }

    /**
     * Event called when the mouse enters the application screen.
     *
     * @param mouseEvent The mouse event generated by the mouse entering the screen.
     */
    default void onMouseEntersScreen(MouseEvent mouseEvent) {
    }

    /**
     * Event called when the mouse exits the application screen.
     *
     * @param mouseEvent The mouse event generated by the mouse exiting the screen.
     */
    default void onMouseExitsScreen(MouseEvent mouseEvent) {
    }
}