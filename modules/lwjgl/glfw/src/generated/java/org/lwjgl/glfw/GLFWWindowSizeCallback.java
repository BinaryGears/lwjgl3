/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.glfw.GLFW.*;

/** Callback function: {@link #invoke GLFWwindowsizefun} */
public abstract class GLFWWindowSizeCallback extends Callback implements GLFWWindowSizeCallbackI {

    /**
     * Creates a {@code GLFWWindowSizeCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWWindowSizeCallback}
     */
    public static GLFWWindowSizeCallback create(long functionPointer) {
        GLFWWindowSizeCallbackI instance = Callback.get(functionPointer);
        return instance instanceof GLFWWindowSizeCallback
            ? (GLFWWindowSizeCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWWindowSizeCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code GLFWWindowSizeCallback} instance that delegates to the specified {@code GLFWWindowSizeCallbackI} instance. */
    public static GLFWWindowSizeCallback create(GLFWWindowSizeCallbackI instance) {
        return instance instanceof GLFWWindowSizeCallback
            ? (GLFWWindowSizeCallback)instance
            : new Container(instance.address(), instance);
    }

    protected GLFWWindowSizeCallback() {
        super(CIF);
    }

    GLFWWindowSizeCallback(long functionPointer) {
        super(functionPointer);
    }

    /** See {@link GLFW#glfwSetWindowSizeCallback SetWindowSizeCallback}. */
    public GLFWWindowSizeCallback set(long window) {
        glfwSetWindowSizeCallback(window, this);
        return this;
    }

    private static final class Container extends GLFWWindowSizeCallback {

        private final GLFWWindowSizeCallbackI delegate;

        Container(long functionPointer, GLFWWindowSizeCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long window, int width, int height) {
            delegate.invoke(window, width, height);
        }

    }

}