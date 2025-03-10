/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkSpecializationMapEntry {
 *     uint32_t constantID;
 *     uint32_t offset;
 *     size_t size;
 * }}</pre>
 */
public class VkSpecializationMapEntry extends Struct<VkSpecializationMapEntry> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CONSTANTID,
        OFFSET,
        SIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CONSTANTID = layout.offsetof(0);
        OFFSET = layout.offsetof(1);
        SIZE = layout.offsetof(2);
    }

    protected VkSpecializationMapEntry(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSpecializationMapEntry create(long address, @Nullable ByteBuffer container) {
        return new VkSpecializationMapEntry(address, container);
    }

    /**
     * Creates a {@code VkSpecializationMapEntry} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSpecializationMapEntry(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code constantID} field. */
    @NativeType("uint32_t")
    public int constantID() { return nconstantID(address()); }
    /** @return the value of the {@code offset} field. */
    @NativeType("uint32_t")
    public int offset() { return noffset(address()); }
    /** @return the value of the {@code size} field. */
    @NativeType("size_t")
    public long size() { return nsize(address()); }

    /** Sets the specified value to the {@code constantID} field. */
    public VkSpecializationMapEntry constantID(@NativeType("uint32_t") int value) { nconstantID(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public VkSpecializationMapEntry offset(@NativeType("uint32_t") int value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public VkSpecializationMapEntry size(@NativeType("size_t") long value) { nsize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSpecializationMapEntry set(
        int constantID,
        int offset,
        long size
    ) {
        constantID(constantID);
        offset(offset);
        size(size);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSpecializationMapEntry set(VkSpecializationMapEntry src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSpecializationMapEntry} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSpecializationMapEntry malloc() {
        return new VkSpecializationMapEntry(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSpecializationMapEntry} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSpecializationMapEntry calloc() {
        return new VkSpecializationMapEntry(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSpecializationMapEntry} instance allocated with {@link BufferUtils}. */
    public static VkSpecializationMapEntry create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSpecializationMapEntry(memAddress(container), container);
    }

    /** Returns a new {@code VkSpecializationMapEntry} instance for the specified memory address. */
    public static VkSpecializationMapEntry create(long address) {
        return new VkSpecializationMapEntry(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSpecializationMapEntry createSafe(long address) {
        return address == NULL ? null : new VkSpecializationMapEntry(address, null);
    }

    /**
     * Returns a new {@link VkSpecializationMapEntry.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSpecializationMapEntry.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSpecializationMapEntry.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSpecializationMapEntry.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSpecializationMapEntry.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSpecializationMapEntry.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSpecializationMapEntry.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSpecializationMapEntry.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSpecializationMapEntry.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSpecializationMapEntry mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSpecializationMapEntry callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSpecializationMapEntry mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSpecializationMapEntry callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSpecializationMapEntry.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSpecializationMapEntry.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSpecializationMapEntry.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSpecializationMapEntry.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSpecializationMapEntry} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSpecializationMapEntry malloc(MemoryStack stack) {
        return new VkSpecializationMapEntry(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSpecializationMapEntry} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSpecializationMapEntry calloc(MemoryStack stack) {
        return new VkSpecializationMapEntry(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSpecializationMapEntry.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSpecializationMapEntry.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSpecializationMapEntry.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSpecializationMapEntry.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #constantID}. */
    public static int nconstantID(long struct) { return memGetInt(struct + VkSpecializationMapEntry.CONSTANTID); }
    /** Unsafe version of {@link #offset}. */
    public static int noffset(long struct) { return memGetInt(struct + VkSpecializationMapEntry.OFFSET); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetAddress(struct + VkSpecializationMapEntry.SIZE); }

    /** Unsafe version of {@link #constantID(int) constantID}. */
    public static void nconstantID(long struct, int value) { memPutInt(struct + VkSpecializationMapEntry.CONSTANTID, value); }
    /** Unsafe version of {@link #offset(int) offset}. */
    public static void noffset(long struct, int value) { memPutInt(struct + VkSpecializationMapEntry.OFFSET, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { memPutAddress(struct + VkSpecializationMapEntry.SIZE, value); }

    // -----------------------------------

    /** An array of {@link VkSpecializationMapEntry} structs. */
    public static class Buffer extends StructBuffer<VkSpecializationMapEntry, Buffer> implements NativeResource {

        private static final VkSpecializationMapEntry ELEMENT_FACTORY = VkSpecializationMapEntry.create(-1L);

        /**
         * Creates a new {@code VkSpecializationMapEntry.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSpecializationMapEntry#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkSpecializationMapEntry getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code constantID} field. */
        @NativeType("uint32_t")
        public int constantID() { return VkSpecializationMapEntry.nconstantID(address()); }
        /** @return the value of the {@code offset} field. */
        @NativeType("uint32_t")
        public int offset() { return VkSpecializationMapEntry.noffset(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("size_t")
        public long size() { return VkSpecializationMapEntry.nsize(address()); }

        /** Sets the specified value to the {@code constantID} field. */
        public VkSpecializationMapEntry.Buffer constantID(@NativeType("uint32_t") int value) { VkSpecializationMapEntry.nconstantID(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public VkSpecializationMapEntry.Buffer offset(@NativeType("uint32_t") int value) { VkSpecializationMapEntry.noffset(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public VkSpecializationMapEntry.Buffer size(@NativeType("size_t") long value) { VkSpecializationMapEntry.nsize(address(), value); return this; }

    }

}