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
 * struct VkPhysicalDeviceProvokingVertexPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 provokingVertexModePerPipeline;
 *     VkBool32 transformFeedbackPreservesTriangleFanProvokingVertex;
 * }}</pre>
 */
public class VkPhysicalDeviceProvokingVertexPropertiesEXT extends Struct<VkPhysicalDeviceProvokingVertexPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PROVOKINGVERTEXMODEPERPIPELINE,
        TRANSFORMFEEDBACKPRESERVESTRIANGLEFANPROVOKINGVERTEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PROVOKINGVERTEXMODEPERPIPELINE = layout.offsetof(2);
        TRANSFORMFEEDBACKPRESERVESTRIANGLEFANPROVOKINGVERTEX = layout.offsetof(3);
    }

    protected VkPhysicalDeviceProvokingVertexPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceProvokingVertexPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceProvokingVertexPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceProvokingVertexPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceProvokingVertexPropertiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code provokingVertexModePerPipeline} field. */
    @NativeType("VkBool32")
    public boolean provokingVertexModePerPipeline() { return nprovokingVertexModePerPipeline(address()) != 0; }
    /** @return the value of the {@code transformFeedbackPreservesTriangleFanProvokingVertex} field. */
    @NativeType("VkBool32")
    public boolean transformFeedbackPreservesTriangleFanProvokingVertex() { return ntransformFeedbackPreservesTriangleFanProvokingVertex(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceProvokingVertexPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTProvokingVertex#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_PROPERTIES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceProvokingVertexPropertiesEXT sType$Default() { return sType(EXTProvokingVertex.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceProvokingVertexPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceProvokingVertexPropertiesEXT set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceProvokingVertexPropertiesEXT set(VkPhysicalDeviceProvokingVertexPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceProvokingVertexPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT malloc() {
        return new VkPhysicalDeviceProvokingVertexPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceProvokingVertexPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT calloc() {
        return new VkPhysicalDeviceProvokingVertexPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceProvokingVertexPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceProvokingVertexPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceProvokingVertexPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT create(long address) {
        return new VkPhysicalDeviceProvokingVertexPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceProvokingVertexPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceProvokingVertexPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProvokingVertexPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProvokingVertexPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProvokingVertexPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceProvokingVertexPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceProvokingVertexPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceProvokingVertexPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceProvokingVertexPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceProvokingVertexPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProvokingVertexPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProvokingVertexPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceProvokingVertexPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceProvokingVertexPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #provokingVertexModePerPipeline}. */
    public static int nprovokingVertexModePerPipeline(long struct) { return memGetInt(struct + VkPhysicalDeviceProvokingVertexPropertiesEXT.PROVOKINGVERTEXMODEPERPIPELINE); }
    /** Unsafe version of {@link #transformFeedbackPreservesTriangleFanProvokingVertex}. */
    public static int ntransformFeedbackPreservesTriangleFanProvokingVertex(long struct) { return memGetInt(struct + VkPhysicalDeviceProvokingVertexPropertiesEXT.TRANSFORMFEEDBACKPRESERVESTRIANGLEFANPROVOKINGVERTEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceProvokingVertexPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceProvokingVertexPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceProvokingVertexPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceProvokingVertexPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceProvokingVertexPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceProvokingVertexPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceProvokingVertexPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceProvokingVertexPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceProvokingVertexPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceProvokingVertexPropertiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceProvokingVertexPropertiesEXT.npNext(address()); }
        /** @return the value of the {@code provokingVertexModePerPipeline} field. */
        @NativeType("VkBool32")
        public boolean provokingVertexModePerPipeline() { return VkPhysicalDeviceProvokingVertexPropertiesEXT.nprovokingVertexModePerPipeline(address()) != 0; }
        /** @return the value of the {@code transformFeedbackPreservesTriangleFanProvokingVertex} field. */
        @NativeType("VkBool32")
        public boolean transformFeedbackPreservesTriangleFanProvokingVertex() { return VkPhysicalDeviceProvokingVertexPropertiesEXT.ntransformFeedbackPreservesTriangleFanProvokingVertex(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceProvokingVertexPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceProvokingVertexPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTProvokingVertex#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_PROPERTIES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceProvokingVertexPropertiesEXT.Buffer sType$Default() { return sType(EXTProvokingVertex.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceProvokingVertexPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceProvokingVertexPropertiesEXT.npNext(address(), value); return this; }

    }

}