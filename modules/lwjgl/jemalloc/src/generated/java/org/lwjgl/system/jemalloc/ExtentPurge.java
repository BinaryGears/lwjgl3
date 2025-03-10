/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke extent_purge_t} */
public abstract class ExtentPurge extends Callback implements ExtentPurgeI {

    /**
     * Creates a {@code ExtentPurge} instance from the specified function pointer.
     *
     * @return the new {@code ExtentPurge}
     */
    public static ExtentPurge create(long functionPointer) {
        ExtentPurgeI instance = Callback.get(functionPointer);
        return instance instanceof ExtentPurge
            ? (ExtentPurge)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ExtentPurge createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ExtentPurge} instance that delegates to the specified {@code ExtentPurgeI} instance. */
    public static ExtentPurge create(ExtentPurgeI instance) {
        return instance instanceof ExtentPurge
            ? (ExtentPurge)instance
            : new Container(instance.address(), instance);
    }

    protected ExtentPurge() {
        super(CIF);
    }

    ExtentPurge(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ExtentPurge {

        private final ExtentPurgeI delegate;

        Container(long functionPointer, ExtentPurgeI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long extent_hooks, long addr, long size, long offset, long length, int arena_ind) {
            return delegate.invoke(extent_hooks, addr, size, offset, length, arena_ind);
        }

    }

}