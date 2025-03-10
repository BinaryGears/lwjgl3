/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class IndexerStartedTranslationUnit extends Callback implements IndexerStartedTranslationUnitI {

    /**
     * Creates a {@code IndexerStartedTranslationUnit} instance from the specified function pointer.
     *
     * @return the new {@code IndexerStartedTranslationUnit}
     */
    public static IndexerStartedTranslationUnit create(long functionPointer) {
        IndexerStartedTranslationUnitI instance = Callback.get(functionPointer);
        return instance instanceof IndexerStartedTranslationUnit
            ? (IndexerStartedTranslationUnit)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable IndexerStartedTranslationUnit createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code IndexerStartedTranslationUnit} instance that delegates to the specified {@code IndexerStartedTranslationUnitI} instance. */
    public static IndexerStartedTranslationUnit create(IndexerStartedTranslationUnitI instance) {
        return instance instanceof IndexerStartedTranslationUnit
            ? (IndexerStartedTranslationUnit)instance
            : new Container(instance.address(), instance);
    }

    protected IndexerStartedTranslationUnit() {
        super(CIF);
    }

    IndexerStartedTranslationUnit(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends IndexerStartedTranslationUnit {

        private final IndexerStartedTranslationUnitI delegate;

        Container(long functionPointer, IndexerStartedTranslationUnitI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long client_data, long reserved) {
            return delegate.invoke(client_data, reserved);
        }

    }

}