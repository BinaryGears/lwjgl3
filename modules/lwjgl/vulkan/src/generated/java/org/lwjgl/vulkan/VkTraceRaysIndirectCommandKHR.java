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
 * struct VkTraceRaysIndirectCommandKHR {
 *     uint32_t width;
 *     uint32_t height;
 *     uint32_t depth;
 * }}</pre>
 */
public class VkTraceRaysIndirectCommandKHR extends Struct<VkTraceRaysIndirectCommandKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        WIDTH,
        HEIGHT,
        DEPTH;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        WIDTH = layout.offsetof(0);
        HEIGHT = layout.offsetof(1);
        DEPTH = layout.offsetof(2);
    }

    protected VkTraceRaysIndirectCommandKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkTraceRaysIndirectCommandKHR create(long address, @Nullable ByteBuffer container) {
        return new VkTraceRaysIndirectCommandKHR(address, container);
    }

    /**
     * Creates a {@code VkTraceRaysIndirectCommandKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkTraceRaysIndirectCommandKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code width} field. */
    @NativeType("uint32_t")
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    @NativeType("uint32_t")
    public int height() { return nheight(address()); }
    /** @return the value of the {@code depth} field. */
    @NativeType("uint32_t")
    public int depth() { return ndepth(address()); }

    /** Sets the specified value to the {@code width} field. */
    public VkTraceRaysIndirectCommandKHR width(@NativeType("uint32_t") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public VkTraceRaysIndirectCommandKHR height(@NativeType("uint32_t") int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code depth} field. */
    public VkTraceRaysIndirectCommandKHR depth(@NativeType("uint32_t") int value) { ndepth(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkTraceRaysIndirectCommandKHR set(
        int width,
        int height,
        int depth
    ) {
        width(width);
        height(height);
        depth(depth);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkTraceRaysIndirectCommandKHR set(VkTraceRaysIndirectCommandKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkTraceRaysIndirectCommandKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkTraceRaysIndirectCommandKHR malloc() {
        return new VkTraceRaysIndirectCommandKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkTraceRaysIndirectCommandKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkTraceRaysIndirectCommandKHR calloc() {
        return new VkTraceRaysIndirectCommandKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkTraceRaysIndirectCommandKHR} instance allocated with {@link BufferUtils}. */
    public static VkTraceRaysIndirectCommandKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTraceRaysIndirectCommandKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkTraceRaysIndirectCommandKHR} instance for the specified memory address. */
    public static VkTraceRaysIndirectCommandKHR create(long address) {
        return new VkTraceRaysIndirectCommandKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkTraceRaysIndirectCommandKHR createSafe(long address) {
        return address == NULL ? null : new VkTraceRaysIndirectCommandKHR(address, null);
    }

    /**
     * Returns a new {@link VkTraceRaysIndirectCommandKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTraceRaysIndirectCommandKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkTraceRaysIndirectCommandKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTraceRaysIndirectCommandKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTraceRaysIndirectCommandKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkTraceRaysIndirectCommandKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkTraceRaysIndirectCommandKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkTraceRaysIndirectCommandKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkTraceRaysIndirectCommandKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkTraceRaysIndirectCommandKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTraceRaysIndirectCommandKHR malloc(MemoryStack stack) {
        return new VkTraceRaysIndirectCommandKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkTraceRaysIndirectCommandKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTraceRaysIndirectCommandKHR calloc(MemoryStack stack) {
        return new VkTraceRaysIndirectCommandKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkTraceRaysIndirectCommandKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTraceRaysIndirectCommandKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTraceRaysIndirectCommandKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTraceRaysIndirectCommandKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + VkTraceRaysIndirectCommandKHR.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + VkTraceRaysIndirectCommandKHR.HEIGHT); }
    /** Unsafe version of {@link #depth}. */
    public static int ndepth(long struct) { return memGetInt(struct + VkTraceRaysIndirectCommandKHR.DEPTH); }

    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { memPutInt(struct + VkTraceRaysIndirectCommandKHR.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { memPutInt(struct + VkTraceRaysIndirectCommandKHR.HEIGHT, value); }
    /** Unsafe version of {@link #depth(int) depth}. */
    public static void ndepth(long struct, int value) { memPutInt(struct + VkTraceRaysIndirectCommandKHR.DEPTH, value); }

    // -----------------------------------

    /** An array of {@link VkTraceRaysIndirectCommandKHR} structs. */
    public static class Buffer extends StructBuffer<VkTraceRaysIndirectCommandKHR, Buffer> implements NativeResource {

        private static final VkTraceRaysIndirectCommandKHR ELEMENT_FACTORY = VkTraceRaysIndirectCommandKHR.create(-1L);

        /**
         * Creates a new {@code VkTraceRaysIndirectCommandKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkTraceRaysIndirectCommandKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkTraceRaysIndirectCommandKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code width} field. */
        @NativeType("uint32_t")
        public int width() { return VkTraceRaysIndirectCommandKHR.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("uint32_t")
        public int height() { return VkTraceRaysIndirectCommandKHR.nheight(address()); }
        /** @return the value of the {@code depth} field. */
        @NativeType("uint32_t")
        public int depth() { return VkTraceRaysIndirectCommandKHR.ndepth(address()); }

        /** Sets the specified value to the {@code width} field. */
        public VkTraceRaysIndirectCommandKHR.Buffer width(@NativeType("uint32_t") int value) { VkTraceRaysIndirectCommandKHR.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public VkTraceRaysIndirectCommandKHR.Buffer height(@NativeType("uint32_t") int value) { VkTraceRaysIndirectCommandKHR.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code depth} field. */
        public VkTraceRaysIndirectCommandKHR.Buffer depth(@NativeType("uint32_t") int value) { VkTraceRaysIndirectCommandKHR.ndepth(address(), value); return this; }

    }

}